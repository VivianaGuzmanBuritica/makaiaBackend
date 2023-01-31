public class Cuenta {
    private String nombreTitular;
    private double saldo;
    private  double numero;

    public Cuenta(String nombreTitular, double saldo, double numero) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numero = numero;
    }

    public Cuenta() {
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        this.saldo = saldo;
        System.out.println("Saldo cuenta: "+saldo);
        return saldo;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setIngreso(double ingreso){
        double saldoInicial = getSaldo();
        saldoInicial += ingreso;
        setSaldo(saldoInicial);
        System.out.println("Saldo más el ingreso: "+saldoInicial);

    }

    public void setRetiro(double retiro){
        double saldoInicial = getSaldo();
        saldoInicial -= retiro;
        setSaldo(saldoInicial);
        System.out.println("Saldo menos el retiro: "+saldoInicial);

    }


    public String getDatosCuenta() {
        return "Cuenta{" +
                "nombreTitular='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
