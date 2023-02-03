import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LocalDate localDate = LocalDate.now();
        Clasica clasica = new Clasica("Visa",1000,"12345", 123, localDate);
        System.out.println("Clasica: "+(clasica.toString()));

        Dorada dorada = new Dorada("MasterCard",2000,"12345", 123, localDate);
        System.out.println("Dorada: "+(dorada.toString()));

        Platinum platinum = new Platinum("AmericaExpress",3000,"12345", 123, localDate);
        System.out.println("Platinum: "+(platinum.toString()));

        Black black = new Black("isa",4000,"12345", 123, localDate);
        System.out.println("black: "+(black.toString()));

 }
}