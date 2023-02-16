public class Main {
    public static void main(String[] args) {
        ImpresoraSingleton impresora1 = ImpresoraSingleton.getInstance();
        System.out.println(impresora1);
        ImpresoraSingleton impresora2 = ImpresoraSingleton.getInstance();
        System.out.println(impresora1);

        Empleado empleado = new Empleado(impresora1, "Vivi");
        Empleado empleado2= new Empleado(impresora1, "Brian");
        System.out.println(empleado.imprimir());
        System.out.println(empleado.imprimir());
        System.out.println(empleado.imprimir());

        System.out.println(empleado2.imprimir());
        System.out.println(empleado2.imprimir());
        System.out.println(empleado2.imprimir());


    }


}