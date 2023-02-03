import java.time.LocalDate;

public class TarjetaCredito {
    private String emisor;
    private long cupo;
    private String numeroTarjeta;
    private Integer cvv;
    private LocalDate fechaVencimiento;

    public TarjetaCredito(String emisor, long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public TarjetaCredito() {
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "emisor='" + emisor + '\'' +
                ", cupo=" + cupo +
                ", numeroTarjeta=" + numeroTarjeta +
                ", cvv=" + cvv +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }

}
