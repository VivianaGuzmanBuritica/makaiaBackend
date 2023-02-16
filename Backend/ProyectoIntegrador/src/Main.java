import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(123456789, "Viviana", "Guzman", "318459450", "vivi@mail.com", "calle 123", "Cali");
        System.out.println(cliente.toString());

        Empleado empleado = new Empleado(123244, "Dani", "Garcia", "34565678", "dani@mail.com", "avenida 245", "Cali", 1.4, "O+", "COORDINADOR");
        System.out.println(empleado.toString());

        Paquete paquete = new Paquete("LIVIANO", 1.5, 50.000);
        System.out.println(paquete.toString());
        Paquete paquete1 = new Paquete("MEDIANO", 2.5, 90.000);
        System.out.println(paquete1.toString());

        Envio envio = new Envio("a3nf568f", cliente, "Cali", "Bogota","avenida 345-24", "Luz", "338459", "1:00pm", "RECIBIDO", 10.500, paquete);
        System.out.println(envio.toString());

    }
}