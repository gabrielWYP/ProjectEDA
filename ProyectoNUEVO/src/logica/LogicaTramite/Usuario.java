
package logica.LogicaTramite;

public class Usuario {
    private String dni, nombre, fono, email;

    public Usuario(String dni, String nombre, String fono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.fono = fono;
        this.email = email;
    }

    public Usuario() {
    }   
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
