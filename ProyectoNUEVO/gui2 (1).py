import tkinter as tk
from tkinter import ttk
import threading
import time
import serial
import matplotlib.pyplot as plt
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg

class LectorSerial:
    def __init__(self, puerto, velocidad, actualizar_texto_callback, actualizar_grafica_callback, lista_arduinobits):
        self.puerto = puerto
        self.velocidad = velocidad
        self.actualizar_texto_callback = actualizar_texto_callback
        self.actualizar_grafica_callback = actualizar_grafica_callback
        self.ejecutando = False
        self.lista_arduinobits = []

    def iniciar(self):
        if not self.ejecutando:
            self.ejecutando = True
            self.hilo = threading.Thread(target=self.leer_serial)
            self.hilo.start()

    def leer_serial(self):
        try:
            with serial.Serial(self.puerto, self.velocidad, timeout=1) as ser:
                while self.ejecutando:
                    bit = ser.read()
                    if bit:
                        bit_comprobacion = bit.decode('utf-8').strip()
                        if bit_comprobacion in '01':
                            self.lista_arduinobits.append(bit_comprobacion)
                            if len(self.lista_arduinobits <=10)
                                bitsmc = ''.join(self.lista_arduinobits)
                                bits_originales = self.dezcodificar_manchester_diferencial(bitsmc)
                                self.actualizar_texto_callback(bits_originales)
                                self.actualizar_grafica_callback(bitsmc)
                                self.lista_arduinobits = []
                    time.sleep(1)
        except serial.SerialException as e:
            print(f"Error al leer el puerto serial: {e}")

    def detener(self):
        self.ejecutando = False

    def decodificar_manchester_diferencial(self, bits_entrada):
        lista_aux = []

        bits = [int(bit) for bit in bits_entrada if bit.isdigit()]

        for i in range(0, len(bits), 2):
            sublista = [bits[i], bits[i + 1]]
            lista_aux.append(sublista)

        bits_originales = []

        primera_ejecucion = True  
        for j in range(len(lista_aux)-1):  
            if lista_aux[j][0] == 1 and primera_ejecucion:
                bits_originales.append("1")
                primera_ejecucion = False
            elif lista_aux[j][0] == 0 and primera_ejecucion:
                bits_originales.append("0")
                primera_ejecucion = False

            if lista_aux[j][1] != lista_aux[j + 1][0]:
                bits_originales.append("0")
            elif lista_aux[j][1] == lista_aux[j + 1][0]:
                bits_originales.append("1")

        return ''.join(bits_originales)

class App:
    def __init__(self, root):
        self.root = root
        self.root.title("Datos Recibidos de Arduino")
        self.root.geometry('400x600')
        self.root.eval('tk::PlaceWindow . center')

        self.marco_texto = ttk.Frame(root)
        self.marco_texto.pack(padx=10, pady=10, fill=tk.BOTH, expand=True)

        self.widget_texto = tk.Text(self.marco_texto, wrap='word', height=15, width=40, borderwidth=2, relief="solid")
        self.widget_texto.pack(side=tk.LEFT, padx=(0, 10), fill=tk.BOTH, expand=True)

        self.marco_botones = ttk.Frame(self.marco_texto)
        self.marco_botones.pack(side=tk.RIGHT, fill=tk.Y)

        self.crear_boton("Iniciar lectura", self.iniciar_lectura)
        self.crear_boton("Detener lectura", self.detener_lectura)
        self.crear_boton("Limpiar", self.limpiar_texto)

        self.marco_grafica = ttk.Frame(root)
        self.marco_grafica.pack(padx=10, pady=10, fill=tk.BOTH, expand=True)

        self.figura = plt.figure(figsize=(5, 4))
        self.ax = self.figura.add_subplot(111)
        self.canvas = FigureCanvasTkAgg(self.figura, master=self.marco_grafica)
        self.canvas.get_tk_widget().pack(side=tk.BOTTOM, fill=tk.BOTH, expand=True)

        self.etiqueta_estado = ttk.Label(root, text="Sin contenido", style="StatusLabel.TLabel")
        self.etiqueta_estado.pack(side="bottom", fill="x", pady=10)

        self.lector_serial = LectorSerial('COM3', 9600, self.actualizar_texto, self.actualizar_grafica)

        self.ultimo_indice = None
        self.root.protocol("WM_DELETE_WINDOW", self.al_cerrar)

    def crear_boton(self, texto, comando):
        boton = ttk.Button(self.marco_botones, text=texto, command=comando)
        boton.pack(fill=tk.X, padx=5, pady=2)

    def iniciar_lectura(self):
        self.lector_serial.iniciar()

    def detener_lectura(self):
        self.lector_serial.detener()

    def actualizar_texto(self, datos):
        self.root.after(0, self._actualizar_texto, datos)

    def _actualizar_texto(self, datos):
        self.widget_texto.insert(tk.END, datos + '\n')

        if self.ultimo_indice:
            self.widget_texto.tag_remove("ultima_linea", "1.0", "end")

        self.ultimo_indice = self.widget_texto.index(tk.END)
        self.widget_texto.tag_add("ultima_linea", self.ultimo_indice + "-1c linestart", self.ultimo_indice + "-1c lineend")
        self.widget_texto.tag_config("ultima_linea", foreground="red")

        self.widget_texto.tag_configure("center", justify="center")
        self.widget_texto.tag_add("center", "1.0", "end")

        self.widget_texto.see(tk.END)

    def limpiar_texto(self):
        self.widget_texto.delete("1.0", tk.END)

    def al_cerrar(self):
        self.lector_serial.detener()
        self.root.destroy()

    def actualizar_grafica(self, datos):
        self.root.after(0, self._actualizar_grafica, datos)

    def _actualizar_grafica(self, datos):
        datos_int = [int(bit) for bit in datos]

        valores_tiempo = range(len(datos_int))

        self.ax.clear()

        self.ax.step(valores_tiempo, datos_int, where='post', color='b')

        self.ax.set_title('Forma de onda')
        self.ax.set_xlabel('Tiempo')
        self.ax.set_ylabel('Amplitud')

        self.canvas.draw()

if __name__ == "__main__":
    root = tk.Tk()
    app = App(root)
    root.mainloop()




#https://es.stackoverflow.com/questions/427565/env%C3%ADo-recepci%C3%B3n-de-datos-puerto-serie-por-python
#https://iiab.me/kiwix/content/es.stackoverflow.com_es_all_2022-06/questions/461753/tkinter-python-animacion-de-botones-buttons
#https://es.stackoverflow.com/questions/37537/no-puedo-mostrar-lectura-de-sensor-de-arduino-en-mi-interfaz-se-bloquea
#https://es.stackoverflow.com/questions/468078/librer%C3%ADa-threading-python3 
#el q lo lee se la come, trolo    
    
