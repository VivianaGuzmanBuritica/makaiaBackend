public class Main {
    public static void main(String[] args) {
       Estandar estandar = new Estandar(100.0, 19);
        System.out.println(estandar.obtenerCobro());
        Estandar estandar1 = new Estandar(100.0, 16);
        System.out.println(estandar1.obtenerCobro());

        Premiun premiun = new Premiun(200.0, 20);
        System.out.println(premiun.obtenerCobro());
        Premiun premiun1 = new Premiun(200.0, 15);
        System.out.println(premiun1.obtenerCobro());

        Oro oro = new Oro(300, 21);
        System.out.println(oro.obtenerCobro());
        Oro oro1 = new Oro(300, 10);
        System.out.println(oro1.obtenerCobro());
    }
}