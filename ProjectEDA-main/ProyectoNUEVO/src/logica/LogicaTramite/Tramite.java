
package logica.LogicaTramite;
import logica.Nodo;
import logica.Lista;
public class Tramite {
    private String UID, datos, asunto;
    private int prio;
    private Documento ref;
    private Fecha inicio, fin;
    private Dependencia depe;
    private Lista<String> eventos;

    public Tramite(String UID, String datos, String asunto, int prio, Documento ref) {
        this.UID = UID;
        this.datos = datos;
        this.asunto = asunto;
        this.prio = prio;
        this.ref = ref;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    public Documento getRef() {
        return ref;
    }

    public void setRef(Documento ref) {
        this.ref = ref;
    }

    public Fecha getInicio() {
        return inicio;
    }

    public void setInicio(Fecha inicio) {
        this.inicio = inicio;
    }

    public Fecha getFin() {
        return fin;
    }

    public void setFin(Fecha fin) {
        this.fin = fin;
    }

    public Dependencia getDepe() {
        return depe;
    }

    public void setDepe(Dependencia depe) {
        this.depe = depe;
    }

    public Lista<String> getEventos() {
        return eventos;
    }

    public void setEventos(Lista<String> eventos) {
        this.eventos = eventos;
    }
    
    public String MostrarInfo() {
        return "UID: " + UID + "\n" +
               "Datos: " + datos + "\n" +
                "Asunto: " + asunto + "\n" +
                "Prio: " + prio + "\n";
    }
    
    
    
}
