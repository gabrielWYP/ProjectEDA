
package logica.LogicaTramite;
import logica.*;

public class Administrador {
    private String usuario;
    private String contrasena;
    private static Administrador instancia;

    private Administrador(String usuario, String contrasena) {
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
    
     public static Administrador getInstance() {
        if (instancia == null) {
            instancia = new Administrador("admin","admin");
        }
        return instancia;
    }
    
    

    public void crearDependencia(Gestion_Tramite sistema, String nomdep) {
        Dependencia nueva = new Dependencia(nomdep);
        sistema.getDepes().agregar(nueva);
    }
    
    public Tramite registrarIngreso(Usuario datos, String asunto, int prio, Documento ref, Dependencia dep) {
        Tramite nuevo = new Tramite( datos,asunto, prio, ref,dep);
        Fecha ini = new Fecha();
        nuevo.setInicio(ini);
        String evento = "Se inicializa el tramite en dependencia " + dep;
        nuevo.getEventos().agregar(evento);
        dep.getEncolados().encolar(nuevo);
        return nuevo;
    }
    
    public void registrarUsuario(Gestion_Tramite sistema,String dni, String nombre, String fono, String email){
        Usuario nuevo = new Usuario(dni,nombre,fono,email);
        sistema.getUser().agregar(nuevo);
        
    }
    public void registrarMovimiento(boolean prio, Dependencia Origen, Dependencia Final) {
        Cola<Tramite> ordenar = Origen.getEncolados();
        if (prio) {
            Tramite mov = menorPrio(ordenar);
            String actu = "Tramite se ha movido de dependencia: " + Origen.getNombre() + "a dependencia: " + Final.getNombre();
            mov.getEventos().agregar(actu);
            Final.getEncolados().encolar(mov);
        } else {
            Tramite mov = ordenar.desencolar();
            String actu = "Tramite se ha movido de dependencia: " + Origen.getNombre() + "a dependencia: " + Final.getNombre();
            mov.getEventos().agregar(actu);
            Final.getEncolados().encolar(mov);
        }
    } //Corregir cambios en los parametros (no estan cambiando)
    
    public void registrarFinal(Gestion_Tramite sistema, Dependencia depe) {
        Tramite fin = depe.getEncolados().desencolar();
        String finalizo = "Evento ha finalizado satisfactoriamente en dependencia: " + depe;
        fin.getEventos().agregar(finalizo);
        sistema.getHistorial().agregar(fin);
    }
    
    public void observarTramite(Gestion_Tramite sistema, String uid) {
        Tramite objetivo = BuscarporUID(sistema, uid);
        System.out.println(objetivo.getAsunto());
    }
    
    public static Tramite menorPrio(Cola<Tramite> ordenar){
        if (ordenar.esVacia()) {
            throw new RuntimeException("ERROR: la cola está vacía");
        }
        Cola<Tramite> aux = new Cola<>();
        Cola<Tramite> temp = new Cola<>();
        Nodo<Tramite> menor = null;
        
        while(!ordenar.esVacia()) {
            Tramite actual = ordenar.desencolar();
            aux.encolar(actual);
            
            if(menor == null || (actual.getPrio() < menor.getElemento().getPrio())) {
                menor = new Nodo<>(actual, null);
            }
        }
        boolean menorfuera = false;
        while(!aux.esVacia()) {
            Tramite actual = aux.desencolar();
            if(!menorfuera && actual.equals(menor.getElemento())) {
                menorfuera = true;
            } else {
                temp.encolar(actual);
            }
        }
        while(!temp.esVacia()) {
            ordenar.encolar(temp.desencolar());
        }
        
        return menor.getElemento();
    }
    
    private static Tramite BuscarporUID(Gestion_Tramite sistema, String uid) {
        Lista<Dependencia> nueva = sistema.getDepes();
        Nodo<Dependencia> ptr = nueva.getCabeza();
        if(nueva.esVacia()) {
            throw new RuntimeException("ERROR: la cola está vacía");
        }
        while(ptr != null) {
            Cola<Tramite> actual = ptr.getElemento().getEncolados();
            while(!actual.esVacia()) {
                Tramite nuevo = actual.desencolar();
                if(nuevo.getUID().equals(uid)) {
                    return nuevo;
                }
            }
            ptr = ptr.getSgteNodo();
        }
        return null;
    } 
}
