import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static void main(String[] args) {
        //imprimir todos nombres que contengan la letra a y m
        List<String> words = List.of("mateo", "maria", "pepe", "sofia", "clara");

        words.stream()
                .filter(nombre -> nombre.startsWith("m") || nombre.startsWith("p"))
                .collect(Collectors.toList())
                .forEach(nombre -> System.out.println(nombre));

        // filtrar los numeros pares
        System.out.println("numeros pares");
        List<Integer> numbers = List.of(6, 5, 7, 8, 9,10);
        numbers.stream()
                .filter(number -> (number%2 == 0))
                .collect(Collectors.toList())
                .forEach(number -> System.out.println(number));
|
        //Despues ordenarlos de menor a mayor.
        System.out.println("ordenar de menor a mayor");
        numbers.stream()
                .sorted(Comparator.comparingInt(number -> number))
                .collect(Collectors.toList())
                .forEach(number -> System.out.println(number));

        // despues cada numero multiplicarlo por dos
        System.out.println("cada numero multiplicarlo por dos");
        numbers.stream()
                .map(number -> number *2)
                .collect(Collectors.toList())
                .forEach(number -> System.out.println(number));
        //Nota: usar filter, map, sorted.

    }
}
