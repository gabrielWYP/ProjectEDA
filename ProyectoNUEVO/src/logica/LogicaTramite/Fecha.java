
package logica.LogicaTramite;

import java.time.*;

public class Fecha {
    LocalDateTime ahora = LocalDateTime.now();

    public Fecha() {
        
    }

    public LocalDateTime getAhora() {
        return ahora;
    }

    public void setAhora(LocalDateTime ahora) {
        this.ahora = ahora;
    }
    //Arrieta: Corregir clase fecha para obtener formato
    
    
}
