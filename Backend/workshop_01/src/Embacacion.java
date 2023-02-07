public class Embacacion {
    private Capitan capitan;
    protected double precioBase;
    protected double valorAdicional;
    private int anioFabricacion;
    private double eslora;

    public Embacacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }


    public double calcularPrecio(){
        if(anioFabricacion > 2020){
           return precioBase += valorAdicional;
        }else {
           return precioBase;
        }

    };



}
