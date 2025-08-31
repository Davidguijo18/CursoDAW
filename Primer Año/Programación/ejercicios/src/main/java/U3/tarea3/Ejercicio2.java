package U3.tarea3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce cuantos numeros desea introducir");
        int numeros = teclado.nextInt();

        int[] array = new int[numeros];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un numero: ");
            array[i] = teclado.nextInt();
        }

        System.out.print("\nLos numeros introducidos en orden inverso son: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }
    }
}
