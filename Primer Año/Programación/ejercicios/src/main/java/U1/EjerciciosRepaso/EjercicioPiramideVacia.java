package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioPiramideVacia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide (debe ser impar): ");
        int altura = teclado.nextInt();

        if (altura % 2 == 0) {
            System.out.println("La altura debe ser un número impar.");
            return;
        }

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= altura; i++) {
            System.out.print("* ");
        }
    }
}

