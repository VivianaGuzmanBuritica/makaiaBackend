public class Velero extends Embacacion{
    private int cantMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
    }

    public String tamanio(){
        if(cantMastiles > 4){
            return "Grande";
        }else{
            return "Pequeno";
        }
    }
}
