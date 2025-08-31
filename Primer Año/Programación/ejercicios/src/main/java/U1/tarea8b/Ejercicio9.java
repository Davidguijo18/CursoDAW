package U1.tarea8b;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        System.out.print("Introduce la altura: ");
        altura = teclado.nextInt();

        int longiHori = altura / 2 + 1;

        for (int i = 1; i <= altura; i++) {
            if (i == altura) {
                for (int j = 1; j <= longiHori; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
