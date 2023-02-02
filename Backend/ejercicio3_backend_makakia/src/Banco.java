public class Banco {

private Cuenta cuenta;
private double montoTransferir;


    public Banco() {
    }

    public Boolean validarDisponibilidad(Cuenta cuentaRetiro, double montoTransferir){
        if(cuentaRetiro.getSaldo() > montoTransferir){
            return true;
        }
        return false;
    }

    public String transferir(Cuenta cuentaIngreso, Cuenta cuentaRetiro,  double montoTransferir){
        String respuesta= "";

        if(!validarDisponibilidad(cuentaRetiro, montoTransferir)) {
            respuesta ="Saldo insuficiente, no se puede realizar el retiro";

        }else{
            cuentaRetiro.setRetiro(montoTransferir);
            cuentaIngreso.setIngreso(montoTransferir);

            respuesta = "Su saldo  en la cuenta de " + cuentaIngreso.getNombreTitular() +" donde ingreso la tranaferencia es de " + cuentaIngreso.getSaldo() +
                    ", y su saldo en la cuenta de " + cuentaRetiro.getNombreTitular() +" donde realizo el retiro es de " + cuentaRetiro.getSaldo();
        }

        return respuesta;
    }


}

