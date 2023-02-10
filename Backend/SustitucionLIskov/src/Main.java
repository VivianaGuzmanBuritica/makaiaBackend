public class Main {
    public static void main(String[] args) {

        Adulto adulto = new Adulto("viviana", "guzman", 1234);
        Ninio ninio = new Ninio("leon", "amariles", adulto, 12133);
        System.out.println(ninio.pagarNinio());

    }
}