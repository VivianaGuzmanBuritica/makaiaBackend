import java.time.LocalDate;

public class Platinum extends TarjetaCredito{

    public Platinum(String emisor, long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
