
package logica.LogicaTramite;
import logica.Cola;
public class Dependencia {
    private String nombre;
    private Cola<Tramite> encolados;

    public Dependencia(String nombre) {
        this.nombre = nombre;
        this.encolados = new Cola<>(); // Inicializar la cola

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cola<Tramite> getEncolados() {
        return encolados;
    }

    public void setEncolados(Cola<Tramite> encolados) {
        this.encolados = encolados;
    }
}
