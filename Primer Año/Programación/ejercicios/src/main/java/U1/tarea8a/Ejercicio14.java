package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        System.out.println("Introduce el numero de de elementos de lado");
        numero = teclado.nextInt();

        for (int i = numero; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
