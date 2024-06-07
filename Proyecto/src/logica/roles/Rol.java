
package logica.roles;

public abstract class Rol {
    protected String usuario, contrasena;

    public Rol(String usuario, String contrasena) {
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
    
    public void MostrarInfo() {
        System.out.println("El usuario es: " + usuario + "\n" +
                "La contrasena es: " + contrasena);
    }
    
}
