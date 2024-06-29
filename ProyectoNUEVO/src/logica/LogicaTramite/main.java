
package logica.LogicaTramite;
import logica.*;
import static logica.LogicaTramite.Administrador.menorPrio;
public class main {
    public static void mostrarCola(Cola<Tramite> cola) {
        Cola<Tramite> aux = new Cola<>();
        while(!cola.esVacia()) {
            Tramite nub = cola.desencolar();
            System.out.print(nub.getPrio() + " | ");
            aux.encolar(nub);
        }
        while(!aux.esVacia()) {
            cola.encolar(aux.desencolar());
        }
    }
    public static void main(String[] args) {
        Documento dni = new Documento("Hola", "Chau");
        Dependencia depe= new Dependencia("gaaaaa");
        Usuario gabo = new Usuario("caca", "caca","caca","caca");
        Tramite n1 = new Tramite( gabo , "Copia", 5, dni,depe);
        Tramite n2 = new Tramite( gabo , "Copia", 10, dni,depe);
        Tramite n3 = new Tramite( gabo , "Copia", 4, dni,depe);
        Tramite n4 = new Tramite(gabo , "Copia", 2, dni,depe);
        Tramite n5 = new Tramite( gabo , "Copia", 3, dni,depe);
        
        Cola<Tramite> cola1 = new Cola<>();
        cola1.encolar(n1);
        cola1.encolar(n2);
        cola1.encolar(n3);
        cola1.encolar(n4);
        cola1.encolar(n5);
        mostrarCola(cola1);
        Tramite fin = menorPrio(cola1);
        System.out.println("");
        System.out.println(fin.getPrio());
        mostrarCola(cola1);
        
    }   
        
        
}
