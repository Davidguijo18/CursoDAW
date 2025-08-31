package U3.EjerciciosRepaso.EjercicioRehechos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioGenerarArrayAleatorio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la cantidad de valores del array: ");
        int longitud = teclado.nextInt();
        int[] array = new int[longitud];

        System.out.print("Introduce la longitud inicial: ");
        int posInicial = teclado.nextInt();

        System.out.print("Introduce la longitud fnal: ");
        int posFinal = teclado.nextInt();

        arrayAleatorios(array, posInicial, posFinal);
        mostrarArrayAleatorios(array);

    }

    public static void arrayAleatorios(int[] array, int inicio, int fin) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (fin - inicio + 1.0)) + inicio;
        }
    }

    public static void mostrarArrayAleatorios(int[] array) {
        System.out.print("El array de numeros aleatorios es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
