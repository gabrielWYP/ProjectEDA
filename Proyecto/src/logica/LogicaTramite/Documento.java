
package logica.LogicaTramite;
public class Documento {
    private String tipo, descrip;

    public Documento(String tipo, String descrip) {
        this.tipo = tipo;
        this.descrip = descrip;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    public void MostrarInfo() {
        System.out.println("EL documento es de tipo: " + tipo + "\n" +
                            "Descripcion: " + descrip);
    }
    
}
