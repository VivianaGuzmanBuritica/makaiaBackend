public class Yate extends Embacacion{

    private int cantCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
    }

    public String comparar(){
        String resultado = "";
        if(cantCamarotes > 7){
            resultado = "Lujoso";
        }else{
            resultado = "Estandar";
        }
        return resultado;
    }


}
