public class Main {
    public static void main(String[] args) {

        Camion camion = new Camion();
        camion.construirFotoMulta(40,"CAMION");

        Carro carro = new Carro();
        carro.construirFotoMulta(80, "CARRO");

        Mula mula = new Mula();
        mula.construirFotoMulta(200, "MULA");
        mula.construirFotoMulta(400, "AVION");

  }
}