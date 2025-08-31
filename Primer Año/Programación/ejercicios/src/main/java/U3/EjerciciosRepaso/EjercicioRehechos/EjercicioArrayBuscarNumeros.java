package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrayBuscarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        int[] array = new int[longitud];

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        construirMostrarArray(array);
        int[] arrayFinal = construirArray(array, numero);
        System.out.println("\nEl array de numeros que contiene" + numero + " es: ");
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.print(arrayFinal[i] + " ");
        }
    }

    public static void construirMostrarArray(int[] array) {
        System.out.println("\nArray original: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 900) + 100;
            System.out.print(array[i] + " ");
        }
    }

    public static int[] construirArray(int[] array, int num) {
        int[] arrayNumero = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (numeroEsta(array[i], num)) {
                arrayNumero = Arrays.copyOf(arrayNumero, arrayNumero.length + 1);
                arrayNumero[contador] = array[i];
                contador++;
            }
        }
        return arrayNumero;
    }

    public static boolean numeroEsta(int numero, int n) {
        int numReves;
        while (numero > 0) {
            numReves = numero % 10;
            if (numReves == n) {
                return true;
            }
            numero /= 10;
        }
        return false;
    }
}
