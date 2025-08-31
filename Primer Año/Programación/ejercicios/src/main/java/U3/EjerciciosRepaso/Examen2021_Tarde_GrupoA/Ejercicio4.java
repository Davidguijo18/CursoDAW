package U3.EjerciciosRepaso.Examen2021_Tarde_GrupoA;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        construirArray(array);
        mostrarArray(array);

        String numero = convierteArrayEnString(array);
        System.out.println("\nEl array convertido en numero es: " + numero);
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
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static String convierteArrayEnString(int[] a) {
        String numero = "";

        for (int i = 0; i < a.length; i++) {
            numero = numero + a[i];
        }

        return numero;
    }
}
