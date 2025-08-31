package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class FiltrarNumerosCon8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce las dimensiones del array: ");
        int dimensiones = teclado.nextInt();

        int[] array = new int[dimensiones];
        construirArray(array);
        System.out.print("Array original: ");
        mostrarArray(array);

        System.out.print("\n\nLos numeros del array que contienen 8 son: ");
        int[] arrayNumeros8 = crearArrayNumero8(array);
        for (int i = 0; i < arrayNumeros8.length; i++) {
            System.out.print(arrayNumeros8[i] + " ");
        }
    }

    public static void construirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 900) + 100;
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] crearArrayNumero8(int[] array) {
        int[] arrayNumeros8 = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (comprobarNumero8(array[i])) {
                arrayNumeros8 = Arrays.copyOf(arrayNumeros8, arrayNumeros8.length + 1);
                arrayNumeros8[contador] = array[i];
                contador++;
            }
        }
        return arrayNumeros8;
    }

    public static boolean comprobarNumero8(int numero) {
        int numReves;
        boolean numeroCon8 = false;

        while (numero > 0) {
            numReves = numero % 10;
            if (numReves == 8) {
                numeroCon8 = true;
            }
            numero /= 10;
        }
        return numeroCon8;
    }
}
