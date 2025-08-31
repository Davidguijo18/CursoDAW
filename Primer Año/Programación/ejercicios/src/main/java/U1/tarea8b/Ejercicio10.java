package U1.tarea8b;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        System.out.print("Introduce la altura: ");
        altura = teclado.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i == altura) || (j == 1) || (j == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

