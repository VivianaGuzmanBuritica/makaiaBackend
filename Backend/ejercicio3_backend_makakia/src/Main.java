public class Main {
    public static void main(String[] args) {

        double identificacion =  Math.floor(Math.random()*1000000);
        Cuenta cuentaRetiro = new Cuenta("Viviana", 100.5, identificacion);
        Cuenta cuentaIngreso = new Cuenta("Daniel", 200.5, identificacion);
        System.out.println(cuentaRetiro.getDatosCuenta());
        System.out.println(cuentaIngreso.getDatosCuenta());

        // TRANSFERENCIA ENTRE CUENTAS

        double montoTransferir1= 60.0;
        double montoTransferir2= 150.0;

        Banco banco = new Banco();
        banco.validarDisponibilidad(cuentaRetiro, montoTransferir1);
        banco.validarDisponibilidad(cuentaRetiro, montoTransferir2);

        String transferencia1 = banco.transferir(cuentaIngreso, cuentaRetiro, montoTransferir1  );
        System.out.println(transferencia1);

        String transferencia2 = banco.transferir(cuentaIngreso, cuentaRetiro, montoTransferir2 );
        System.out.println(transferencia2);

    }
}