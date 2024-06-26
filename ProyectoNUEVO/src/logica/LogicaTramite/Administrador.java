
package logica.LogicaTramite;
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

    public void crearDependencia(Gestion_Tramite sistema, String nomdep) {
        Dependencia nueva = new Dependencia(nomdep);
        sistema.getDepes().agregar(nueva);
    }
    
    public void registrarIngreso(String uid, String datos, String asunto, int prio, Documento ref, Dependencia dep) {
        Tramite nuevo = new Tramite(uid, datos,asunto, prio, ref);
        Fecha ini = new Fecha();
        nuevo.setInicio(ini);
        nuevo.setDepe(dep);
        String evento = "Se inicializa el tramite en dependencia " + dep;
        nuevo.getEventos().agregar(evento);

    }
    
    public void registrarMovimiento(boolean prio, Dependencia Origen, Dependencia Final) {
        if (prio) {
            
        } else {

        }
    }
    
    public void registrarFinal(Gestion_Tramite sistema, Dependencia depe) {
        Tramite fin = depe.getEncolados().desencolar();
        String finalizo = "Evento ha finalizado satisfactoriamente en dependencia: " + depe;
        fin.getEventos().agregar(finalizo);
        sistema.getHistorial().agregar(fin);
    }
    
    public void observarTramite(Gestion_Tramite sistema, Dependencia depe, String uid) {
        
    }
    
    private void ordenarPrio(){
        
    }
    
    private void BuscarporUID(Cola<Tramite> nueva) {
        
    }
    
}
