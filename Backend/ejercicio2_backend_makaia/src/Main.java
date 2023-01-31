public class Main {
    public static void main(String[] args) {

        double identificacion =  Math.floor(Math.random()*1000000);
        Cuenta cuenta1 = new Cuenta("Viviana", 100.5, identificacion);
        System.out.println(cuenta1.getDatosCuenta());

        cuenta1.setIngreso(200.0);
        System.out.println(cuenta1.getDatosCuenta());

        cuenta1.setRetiro(50.0);
        cuenta1.getSaldo();
    }
}