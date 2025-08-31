package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumerosCapicua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        int[] array = new int[longitud];

        rellenarArray(array);
        mostrarArray(array);

        int[] arrayCapicuas = arrayCapicuas(array);
        System.out.print("\nEl array de capicuas es: ");
        for (int i = 0; i < arrayCapicuas.length; i++) {
            System.out.print(arrayCapicuas[i] + " ");
        }
    }

    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99999);
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.print("Array normal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] arrayCapicuas(int[] array) {
        int[] arrayCapicuas = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (esCapicua(array[i])) {
                arrayCapicuas = Arrays.copyOf(arrayCapicuas, arrayCapicuas.length + 1);
                arrayCapicuas[contador] = array[i];
                contador++;
            }
        }

        return arrayCapicuas;
    }

    public static boolean esCapicua(int numero) {
        int numReves = 0;
        int numeroInicial = numero;

        while (numero > 0) {
            numReves = numero % 10 + numReves * 10;
            numero /= 10;
        }

        if (numeroInicial == numReves) {
            return true;
        }
        return false;

    }
}
