public class Premiun extends Venta{
    public Premiun(double tarifa, int edad) {
        super(tarifa, edad);
    }

    @Override
    public double calcularRecargo() {
        return this.getTarifa() * 0.10;
    }

    @Override
    public double calcularIva(double total) {
        return this.getTarifa() * 0.03;
    }
}
