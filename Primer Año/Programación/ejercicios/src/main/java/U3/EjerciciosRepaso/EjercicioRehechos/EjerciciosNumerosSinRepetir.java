package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosNumerosSinRepetir {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        int[] array = new int[longitud];

        rellenarArray(array);
        mostrarArray(array);

        int[] arraySinRepetidos = arraySinRepetidos(array);
        System.out.print("\nArray sin repetidos: ");
        for (int i = 0; i < arraySinRepetidos.length; i++) {
            System.out.print(arraySinRepetidos[i] + " ");
        }

    }

    public static void rellenarArray(int[] array) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un numero: ");
            array[i] = teclado.nextInt();
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.print("\nArray normal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] arraySinRepetidos(int[] array) {
        int[] arraySinRepetidos = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (estaRepetido(array[i], arraySinRepetidos)) {
                arraySinRepetidos = Arrays.copyOf(arraySinRepetidos, arraySinRepetidos.length + 1);
                arraySinRepetidos[contador] = array[i];
                contador++;
            }
        }
        return arraySinRepetidos;
    }

    public static boolean estaRepetido(int numero, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                return false;
            }
        }

        return true;
    }
}
