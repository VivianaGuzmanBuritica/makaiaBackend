import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("filas");
        int filas = scanner.nextInt();
        System.out.println("columnas");
        int columnas = scanner.nextInt();
        int suma=0;
     int matriz [][]= new int[filas][columnas];

        for (int f = 0; f<filas; f++ ){
            for (int c =0 ; c<columnas ; c++){
                System.out.println("valor");
                matriz[f][c] = scanner.nextInt();
                suma = suma + matriz [f][c];
            }

        }
        System.out.println("total "+suma);
    }


}