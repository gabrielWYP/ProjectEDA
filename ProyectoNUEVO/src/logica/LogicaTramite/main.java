
package logica.LogicaTramite;
import logica.*;
import static logica.LogicaTramite.Administrador.menorPrio;
public class main {
    public static void mostrarCola(Cola<Tramite> cola) {
        Cola<Tramite> aux = new Cola<>();
        while(!cola.esVacia()) {
            Tramite nub = cola.desencolar();
            System.out.print(nub.getPrio() + " | ");
            aux.encolar(nub);
        }
        while(!aux.esVacia()) {
            cola.encolar(aux.desencolar());
        }
    }
    public static void main(String[] args) {
        Documento dni = new Documento("Hola", "Chau");
        Tramite n1 = new Tramite("45", "Gabo", "Copia", 5, dni);
        Tramite n2 = new Tramite("45", "Gabo", "Copia", 10, dni);
        Tramite n3 = new Tramite("45", "Gabo", "Copia", 4, dni);
        Tramite n4 = new Tramite("45", "Gabo", "Copia", 2, dni);
        Tramite n5 = new Tramite("45", "Gabo", "Copia", 3, dni);
        
        Cola<Tramite> cola1 = new Cola<>();
        cola1.encolar(n1);
        cola1.encolar(n2);
        cola1.encolar(n3);
        cola1.encolar(n4);
        cola1.encolar(n5);
        mostrarCola(cola1);
        Tramite fin = menorPrio(cola1);
        System.out.println("");
        System.out.println(fin.getPrio());
        mostrarCola(cola1);
        
    }   
        
        
}
