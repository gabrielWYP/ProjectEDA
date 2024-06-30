
package logica;

import logica.LogicaTramite.Tramite;
import logica.LogicaTramite.Dependencia;
import logica.LogicaTramite.Usuario;

public class Gestion_Tramite {
    private Lista<Tramite> historial;
    private Lista<Dependencia> depes;
    private Lista<Usuario> user;
    private static Gestion_Tramite instancia;

    private Gestion_Tramite() {
        historial = new Lista<>();
        depes = new Lista<>();
        user=new Lista<>();
    }

    public static Gestion_Tramite getInstance() {
        if (instancia == null) {
            instancia = new Gestion_Tramite();
        }
        return instancia;
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

    public Lista<Usuario> getUser() {
        return user;
    }

    public void setUser(Lista<Usuario> user) {
        this.user = user;
    }
    
    
}
