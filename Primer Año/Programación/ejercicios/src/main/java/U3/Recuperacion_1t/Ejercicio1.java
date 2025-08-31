package U3.Recuperacion_1t;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        int[] array = new int[longitud];

        construirArray(array);
        mostrarArray(array);

        int numAleatorio = aleatorioDeArray(array);
        System.out.println("\nEl numero aleatorio generado del array es: " + numAleatorio);

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
        System.out.print("\nArray: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static int aleatorioDeArray(int[] a) {
        int numAleatorio = (int) (Math.random() * (a.length));


        return a[numAleatorio];
    }
}
