package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioFiltrarPrimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        crearArray(array);
        mostrarArray(array);

        int[] arrayPrimos = arrayNumerosPrimos(array);
        System.out.print("\nEl array de numeros primos es: ");
        for (int i = 0; i < arrayPrimos.length; i++) {
            System.out.print(arrayPrimos[i] + " ");
        }


    }

    public static void crearArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.print("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] arrayNumerosPrimos(int[] array) {
        int[] arrayPrimos = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                arrayPrimos = Arrays.copyOf(arrayPrimos, arrayPrimos.length + 1);
                arrayPrimos[contador] = array[i];
                contador++;
            }
        }
        return arrayPrimos;
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
