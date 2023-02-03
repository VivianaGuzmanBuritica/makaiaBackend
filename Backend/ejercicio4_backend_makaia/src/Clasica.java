import java.time.LocalDate;

public class Clasica extends TarjetaCredito{
    public Clasica(String emisor, long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
