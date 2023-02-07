public class Main {
    public static void main(String[] args) {

        Capitan capitan1= new Capitan("Brian", "Villegas", 1234);
        Capitan capitan2 = new Capitan("Viviana", "Guzman", 5667);
        Yate yate1 = new Yate(capitan1, 100000.0, 20000.0, 2023, 170.5, 8);
        System.out.println("precio: "+yate1.calcularPrecio());
        System.out.println("El Yate1 es "+yate1.comparar());
        Velero velero1 = new Velero(capitan2, 80000.0,20000.0, 2019, 100.5, 5);
        System.out.println("precio: "+velero1.calcularPrecio());
        System.out.println("El velero1 es "+velero1.tamanio());

        Yate yate2 = new Yate(capitan1, 90000.0, 20000.0, 2023, 170.5, 6);
        System.out.println("precio: "+yate2.calcularPrecio());
        System.out.println("El Yate2 es "+yate2.comparar());
        Velero velero2 = new Velero(capitan2, 180000.0,20000.0, 2019, 100.5, 3);
        System.out.println("precio: "+velero2.calcularPrecio());
        System.out.println("El velero2 es "+velero2.tamanio());

    }
}