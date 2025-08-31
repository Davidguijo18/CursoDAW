package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioDibujarPiramideVacia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        System.out.println("Introduce la altura de la piramide");
        altura = teclado.nextInt();

        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            if (i == altura || i == 1) {
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int d = 1; d <= i * 2 - 3; d++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
