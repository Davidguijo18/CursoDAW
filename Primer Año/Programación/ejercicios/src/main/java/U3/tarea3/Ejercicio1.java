package U3.tarea3;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un numero:  ");
            array[i] = teclado.nextInt();
        }

        System.out.print("\nLos numeros introducidos son: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
