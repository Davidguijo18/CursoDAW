package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);

        System.out.println("Introduzca la longitud de la flecha");
            int longitud = 5;

        for(int i = 1; i <= longitud / 2; i++) {

            for (int j = 1; j <= longitud - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
