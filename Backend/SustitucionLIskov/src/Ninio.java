public class Ninio extends Persona{

    private Adulto adulto;
    private int tarjeta;
    public Ninio(String nombre, String apellido, Adulto adulto, int tarjeta) {
        super(nombre, apellido);
        this.adulto = adulto;
        this.tarjeta = tarjeta;
    }


    public String pagarNinio() {
       return adulto.pagar();
    }
}
