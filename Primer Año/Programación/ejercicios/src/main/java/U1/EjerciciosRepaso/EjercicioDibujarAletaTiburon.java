package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioDibujarAletaTiburon {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura de la piramide");
        int altura = 7;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
