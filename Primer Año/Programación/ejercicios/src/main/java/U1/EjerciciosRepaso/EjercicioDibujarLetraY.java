package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioDibujarLetraY {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int altura = teclado.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i == j && i <= altura / 2 + 1) || (i + j == altura + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
