import java.time.LocalDate;

public class Black extends TarjetaCredito{
    public Black(String emisor, long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
