import java.time.LocalDate;

public class Dorada extends TarjetaCredito{
    public Dorada(String emisor, long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
