public class Estandar extends Venta{


    public Estandar(double tarifa, int edad) {
        super(tarifa, edad);
    }

    @Override
    public double calcularRecargo() {
        return this.getTarifa() * 0.18;
    }

    @Override
    public double calcularIva(double total) {
        return getTarifa() * 0.02;
    }
}
