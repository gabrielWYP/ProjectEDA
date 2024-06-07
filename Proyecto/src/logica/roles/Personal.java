
package logica.roles;
import logica.LogicaTramite.Dependencia;

public class Personal implements Fun_Per {
    private Dependencia depe;

    public Personal(Dependencia depe) {
        this.depe = depe;
    }

    public Dependencia getDepe() {
        return depe;
    }

    public void setDepe(Dependencia depe) {
        this.depe = depe;
    }

    @Override
    public void registrarIngreso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registrarMovimiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registrarFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
