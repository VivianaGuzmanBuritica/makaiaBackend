public class Main {
    public static void main(String[] args) {

        Capitan capitan1= new Capitan("Brian", "Villegas", 1234);
        Capitan capitan2 = new Capitan("Viviana", "Guzman", 5667);
        Yate yate = new Yate(capitan1, 100000.0, 20000.0, 2023, 170.5);
        System.out.println("precio: "+yate.calcularPrecio());
        System.out.println("El Yate es "+yate.comparar());
        Velero velero = new Velero(capitan2, 80000.0,20000.0, 2019, 100.5);
        System.out.println("precio: "+velero.calcularPrecio());
        System.out.println("El velero es "+velero.tamanio());
    }
}