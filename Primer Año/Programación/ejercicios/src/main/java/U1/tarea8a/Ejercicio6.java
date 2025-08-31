package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Multiplos de 7: ");

        for (int n = 7; n < 100; n = n + 7) {
            System.out.print(n + " ");
        }
    }
}
