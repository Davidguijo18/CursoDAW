package U3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la cantidad de valores que quieres que tenga tu arrray: ");
        int cantidad = teclado.nextInt();

        int[] array = new int[cantidad];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + " del array: ");
            array[i] = teclado.nextInt();
        }

        int[] arraySinRepetidos = sinRepetidos(array);

        System.out.println("\nEl array sin elementos repetidos es: " + Arrays.toString(arraySinRepetidos));
    }

    public static int[] sinRepetidos(int[] array) {
        int[] arrayUnico = new int[array.length];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            boolean estaRepetido = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    estaRepetido = true;
                    break;
                }
            }
            if (!estaRepetido) {
                arrayUnico[contador++] = array[i];
            }
        }

        return Arrays.copyOf(arrayUnico, contador);
    }
}