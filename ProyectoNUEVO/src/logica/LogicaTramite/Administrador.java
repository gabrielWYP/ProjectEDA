
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
        String evento = "Se inicializa el tramite en dependencia: " + dep.getNombre();
        nuevo.getEventos().agregar(evento);
        dep.getEncolados().encolar(nuevo);
        return nuevo;
    }
    
    public void registrarUsuario(Gestion_Tramite sistema,String dni, String nombre, String fono, String email){
        Usuario nuevo = new Usuario(dni,nombre,fono,email);
        sistema.getUser().agregar(nuevo);
        
    }
    public void registrarMovimiento(boolean prio, Dependencia Origen, Dependencia Final) {
        if (prio) {
            Tramite mov = menorPrio(Origen.getEncolados());
            String actu = "Tramite se ha movido de dependencia: " + Origen.getNombre() + "a dependencia: " + Final.getNombre();
            mov.getEventos().agregar(actu);
            Final.getEncolados().encolar(mov);
        } else {
            Tramite mov = Origen.getEncolados().desencolar();
            String actu = "Tramite se ha movido de dependencia: " + Origen.getNombre() + "a dependencia: " + Final.getNombre();
            mov.getEventos().agregar(actu);
            Final.getEncolados().encolar(mov);
        }
    } //Corregir cambios en los parametros (no estan cambiando)
    
    public void registrarFinal(boolean prio, Gestion_Tramite sistema, Dependencia depe) {
        if (prio) {
            Tramite fin = menorPrio(depe.getEncolados());
            String finalizo = "Evento ha finalizado satisfactoriamente en dependencia: " + depe.getNombre();
            fin.getEventos().agregar(finalizo);
            sistema.getHistorial().agregar(fin);
        } else {
            Tramite fin = depe.getEncolados().desencolar();
            String finalizo = "Evento ha finalizado satisfactoriamente en dependencia: " + depe.getNombre();
            fin.getEventos().agregar(finalizo);
            sistema.getHistorial().agregar(fin);
        }
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
    
    
    public Tramite BuscarporUID(Gestion_Tramite sistema, String uid) {
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
    
    public static Dependencia BuscarDepe(Gestion_Tramite sistema, String nombre) {
        Dependencia dependenciaSeleccionada = null;
        Lista<Dependencia> listasDependencias = sistema.getDepes();
        Nodo<Dependencia> nodoDependencia = listasDependencias.getCabeza();
        while (nodoDependencia != null) {
            if (nodoDependencia.getElemento().getNombre().equals(nombre)) {
                dependenciaSeleccionada = nodoDependencia.getElemento();
                break;
            }
            nodoDependencia = nodoDependencia.getSgteNodo();
        }
        return dependenciaSeleccionada;
    }
    
        /*
     public Tramite BuscarporUID2(Gestion_Tramite sistema, String uid)
     {
        Lista<Dependencia> dependencias = sistema.getDepes();
        Nodo<Dependencia> ptr = dependencias.getCabeza();
        
        
        while(ptr != null)
        {
        
            Cola<Tramite> encolados = ptr.getElemento().getEncolados();    
        
            Cola<Tramite> temp = new Cola<>();
            boolean encontrado = false;
        
            while(!encolados.esVacia())
            {
                Tramite tramite = encolados.desencolar();
                temp.encolar(tramite);
                
                if(tramite.getUID().equals(uid))
                {
                    encontrado = true;
                    return tramite;
                }
            }
        
            while(!temp.esVacia())
            {
                encolados.encolar(temp.desencolar());
            }
            ptr = ptr.getSgteNodo();
            
        }
        return null;
    }
    */
    
}
