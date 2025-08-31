package U3.Recuperacion_1t;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        int[] array = new int[longitud];

        construirArray(array);

        System.out.print("Introduce el valor que deseas introducir: ");
        int valor = teclado.nextInt();

        System.out.print("Introduce la posicion donde quieres introducir el valor: ");
        int posicion = teclado.nextInt();

        if (posicion > array.length) {
            System.out.print("\nError. La posicion introducida es mayor que el tamano del array");
            mostrarArray(array);
        } else if (posicion < 1) {
            System.out.print("\nError. La posicion introducida es menor que el tamano del array");
            mostrarArray(array);
        } else {

            mostrarArray(array);

            int[] vectorFinal = insertarValor(array, valor, posicion);
            System.out.print("\nEl array final es: ");
            for (int i = 0; i < vectorFinal.length; i++) {
                System.out.print(vectorFinal[i] + " ");
            }
        }
    }

    public static void construirArray(int[] array) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int valor = i + 1;
            System.out.print("Introduce el numero " + valor + " : ");
            array[i] = teclado.nextInt();
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.print("\nArray original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] insertarValor(int[] vector, int valor, int posicion) {
        int[] vectorFinal = new int[0];
        int contador = 0;

        for (int i = 0; i < vector.length; i++) {
            vectorFinal = Arrays.copyOf(vectorFinal, vectorFinal.length + 1);
            vectorFinal[contador] = vector[i];
            contador++;

            if (posicion == i + 1) {
                vectorFinal = Arrays.copyOf(vectorFinal, vectorFinal.length + 1);
                vectorFinal[contador] = valor;
                contador++;
            }
        }
        return vectorFinal;
    }
}
