
package logica.LogicaTramite;
import java.util.Scanner;
import logica.*;

public class Administrador {
    private String usuario;
    private String contrasena;

    public Administrador(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void crearDependencia(Gestion_Tramite sistema) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el nombre de su dependencia: ");
        String nombre = input.nextLine();
        Dependencia nueva = new Dependencia(nombre);
        sistema.getDepes().agregar(nueva);
    }
    
    public void registrarIngreso(String uid, String datos, String asunto, int prio, Documento ref, Dependencia dep) {
        Tramite nuevo = new Tramite(uid, datos,asunto, prio, ref);
        Fecha ini = new Fecha();
        nuevo.inicio = ini;
        nuevo.depe = dep;
        String evento = "Se inicializa el tramite en dependencia " + depe;
        nuevo.eventos.agregar(evento);
    }
    
    public void registrarMovimiento() {
        
    }
    
    public void registrarFinal() {
        
    }
    
    public void observarTramite() {
        
    }
    
}
