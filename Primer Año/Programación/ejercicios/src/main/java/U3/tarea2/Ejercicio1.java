package U3.tarea2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase1 = teclado.nextLine();

        System.out.println("Introduce otra frase");
        String frase2 = teclado.nextLine();

        System.out.println();

        if (frase1.length() > frase2.length()) {
            System.out.println("La primera frase es mas larga que la segunda");
        } else {
            System.out.println("La segunda frase es mas larga que la primera");
        }
    }
}
