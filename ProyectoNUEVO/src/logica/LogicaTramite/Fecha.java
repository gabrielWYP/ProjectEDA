
package logica.LogicaTramite;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Fecha {
    LocalDateTime ahora = LocalDateTime.now();

    public Fecha() {
        this.ahora = LocalDateTime.now();
    }

    public LocalDateTime getAhora() {
        return ahora;
    }

    public void setAhora(LocalDateTime ahora) {
        this.ahora = ahora;
    }
    
    public String FechaFormateada(String formato)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return ahora.format(formatter);
    }
}
