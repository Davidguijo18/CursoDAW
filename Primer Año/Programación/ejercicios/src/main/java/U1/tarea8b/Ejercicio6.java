package U1.tarea8b;

import com.sun.source.doctree.ValueTree;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        String caracter;

        System.out.println("Introduce la altura de la piramide");
        numero = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Introduce el caracter de la piramide");
        caracter = teclado.nextLine();

        for (int i = 1; i < numero; i++) {
            if (i != 1) {
                for (int j = 1; j <= numero - i; j++) {
                    System.out.print(" ");
                }
                System.out.print(caracter);

                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(caracter);

            } else if (i == 1) {
                for (int j = 1; j <= numero; j++) {
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }
            System.out.println();
        }
        for (int j = 1; j <= 2 * numero - 1; j++) {
            System.out.print(caracter);
        }
    }
}