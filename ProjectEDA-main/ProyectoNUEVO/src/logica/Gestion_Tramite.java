
package logica;
import logica.LogicaTramite.Tramite;
import logica.LogicaTramite.Dependencia;
public class Gestion_Tramite {
    private Lista<Tramite> historial;
    private Lista<Dependencia> depes;

    public Gestion_Tramite() {
    }

    public Lista<Tramite> getHistorial() {
        return historial;
    }

    public void setHistorial(Lista<Tramite> historial) {
        this.historial = historial;
    }

    public Lista<Dependencia> getDepes() {
        return depes;
    }

    public void setDepes(Lista<Dependencia> depes) {
        this.depes = depes;
    }
    
    
}
