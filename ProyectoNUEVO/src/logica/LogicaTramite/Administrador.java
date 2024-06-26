
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
    
    public void registrarIngreso() {
        
    }
    
    public void registrarMovimiento() {
        
    }
    
    public void registrarFinal() {
        
    }
    
    public void observarTramite() {
        
    }
    
}
