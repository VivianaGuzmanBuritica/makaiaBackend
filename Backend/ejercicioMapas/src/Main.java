import java.sql.Array;
import java.util.*;
//
//1) La diferencia de un par de elementos en el array a esta definida como a[j] – a[i] donde i < j y
//        a[i]< a[j]
//        Complete el método maximaDiferencia que recibirá un array a de enteros y calculara la
//        máxima diferencia para ese array.
//        Si no puede calcular la máxima diferencia (por ejemplo, si a esta en orden descante) retornar -
//        Dado el array [15, 3, 6, 10], las diferencias que tiene son:
//        • 6-3 = 3
//        • 10-3 = 7
//        • 10-6 = 4
//        Por lo tanto la máxima diferencia será : 7


public class Main {
    public static void main(String[] args) {
        int[] array = {15, 3, 6, 10};
        int resultadoIncial = 0;
        System.out.println("______________Ejericicio 1________________");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int resultado = array[j] - array[i];
                    if (resultadoIncial < resultado) {
                        resultadoIncial = resultado;
                    }
                    System.out.println(array[j] + " - " + array[i] + " = " + resultado);

                }
            }
        }
        System.out.println("La maxima diferencia es de  " + resultadoIncial);
        System.out.println("______________Ejericicio 2________________");
//2) Ejercicio Mapas.
//        Implementa el control de acceso para una empresa de seguridad información . Se debe pedir
//        un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el
//        programa dirá "Ha accedido aceptado". El usuario tendrá un máximo de 4 oportunidades. Si se
//        agotan las oportunidades el programa dirá "Lo siento, no tiene acceso al área restringida". Los
//        nombres de usuario con sus correspondientes contraseñas que son permitidas deben estar
//        almacenados en una estructura de la clase HasMap.


        Map<String, Integer> map = new HashMap<>();

        map.put("Paquita", 12345);
        map.put("Leon", 67890);
        System.out.println("Mapa");
        for (Map.Entry entry : map.entrySet()) {

            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

        String nombre = "Paquita";
        Integer contrasenia = 12345;

        String nombre2 = "Vivi";
        Integer contrasenia2 = 12345;

        System.out.println("ejemplo 1:");
        if (map.containsKey(nombre) && map.containsValue(contrasenia)) {
            System.out.println("el usuario con el nombre "+nombre+" tiene el acceso permitido");
        } else {
            System.out.println("el usuario con el nombre "+nombre+" tiene el acceso deneagado");
        }
        System.out.println("ejemplo 2:");
        if (map.containsKey(nombre2) && map.containsValue(contrasenia2)) {
            System.out.println("el usuario con el nombre "+nombre2+" tiene el acceso permitido");
        } else {
            System.out.println("el usuario con el nombre "+nombre2+" tiene el acceso deneagado");
        }
//3) Suma Elementos en una Lista.
//Dada una lista A de N enteros y un numero K, determinar si existe un PAR de elementos en la
//lista cuya suma de exactamente K.
//Por ejemplo, dado la lista {1, 3, 7} y k=8, la respuesta es “SI”, pero dada K=6 la respuesta es
//”NO”
//3) ArrayList
        System.out.println("______________Ejericicio 3________________");
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(7);

        for (int i = 0; i < lista.size(); i++) {
            int k = 8;
            for (int j = 1; j < (lista.size()); j++) {

                int total = lista.get(i) + lista.get(j);
                System.out.println(lista.get(i) + " + " + lista.get(j) + " = " + total);

                if (total == k) {
                    System.out.println("si");
                } else {
                    System.out.println("no");
                }
            }
        }


    }
}