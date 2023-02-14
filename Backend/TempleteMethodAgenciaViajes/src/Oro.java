public class Oro extends Venta{
    public Oro(double tarifa, int edad) {
        super(tarifa, edad);
    }

    @Override
    public double calcularRecargo() {
        return this.getTarifa() * 0.05;
    }

    @Override
    public double calcularIva(double total) {
        return this.getTarifa() * 0.05;
    }
}
