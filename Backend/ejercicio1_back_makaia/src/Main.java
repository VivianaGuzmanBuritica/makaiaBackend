import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("Hello world!");

        int num1=9;
        int num2=16;
        System.out.println("valor inicial num1: "+num1);
        System.out.println("valor inicial num2: "+num2);

//        Intercambiar valores, en este caso num1 pasará de valer 9 a valer 16 y num2 pasará
//        de valer 16 a valer 9.Imprimir los valores en consola tanto antes como después del intercambio.

        num1=num2;
        num2=9;

        System.out.println("valor final num1: "+num1);
        System.out.println("valor final num2: "+num2);

//
//        Realizar las siguientes operaciones con ambas variables:

//        Suma, resta, multiplicación, división, elevar al cuadrado la variable num1, sacar raíz
//        cuadrada a la variable num 1, calcular el factorial de la variable num1.
//        Para el caso de la división verificar si el denominador es diferente de cero.

         int suma = num1 + num2;
         System.out.println("valor suma: "+suma);

        int resta = num1 - num2;
        System.out.println("valor resta: "+resta);

        int multiplicacion = num1 * num2;
        System.out.println("valor multiplicacion: "+multiplicacion);

        float num3= 16;
        float num4=9;
        float division = num3 / num4;
        System.out.println("valor division: "+division);

        if (division != 0){
            System.out.println("el denominador es diferente de cero");
        }else{
            System.out.println("el denominador es igual a cero");
        }

        double elevarCuadrado =Math.pow(num1, 2.0);
        System.out.println("El cuadrado de "+num1+" es igual a "+elevarCuadrado);

        double raizCuadrada = Math.sqrt(num1);
        System.out.println("La raiz cuadrada de "+num1+" es igual a "+ raizCuadrada);

        double factorial = 1;
        while(num1 != 0){
            factorial = factorial * num1;
            num1--;
            System.out.println(num1);
        }
        System.out.println("el factorial de num1 es: " + factorial);
    }

    static Scanner sc = new Scanner(System.in);
    String nombre = sc.nextLine();
}