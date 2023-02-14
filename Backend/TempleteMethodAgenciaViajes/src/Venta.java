public abstract class Venta {
    private double tarifa;
    private int edad;

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Venta(double tarifa, int edad) {
        this.tarifa = tarifa;
        this.edad = edad;
    }

    public double obtenerCobro(){
        double total;
        if(edad>18){
           double recargo = calcularRecargo();
           total= tarifa + recargo;
           total += calcularIva(total);
           return total;
        }
        else{
            return tarifa;
        }

    }

public abstract double calcularRecargo();
public abstract double calcularIva(double total);


}
