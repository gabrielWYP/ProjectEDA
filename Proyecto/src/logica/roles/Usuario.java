
package logica.roles;

public class Usuario implements Fun_Usu {
    
    private boolean ulima;

    public Usuario(boolean ulima) {
        this.ulima = ulima;
    }

    public boolean isUlima() {
        return ulima;
    }

    public void setUlima(boolean ulima) {
        this.ulima = ulima;
    }
    

    @Override
    public void observarTramite(int UID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
