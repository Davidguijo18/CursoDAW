package U3.EjerciciosRepaso.Examen_Manana_Rojo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del primer array: ");
        int long1 = teclado.nextInt();
        int[] array1 = new int[long1];

        System.out.print("Introduce la longitud del segundo array: ");
        int long2 = teclado.nextInt();
        int[] array2 = new int[long2];

        System.out.print("\nPrimer array: ");
        construirMostrarArray(array1);
        System.out.print("\nSegundo array: ");
        construirMostrarArray(array2);

        int[] arraySinRepetidos = unirSinRepetidos(array1, array2);
        System.out.print("\nEl array sin repetidos es: ");
        for (int i = 0; i < arraySinRepetidos.length; i++) {
            System.out.print(arraySinRepetidos[i] + " ");
        }

    }

    public static void construirMostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9) + 1;
            System.out.print(array[i] + "  ");
        }
    }

    public static int[] unirSinRepetidos(int[] v1, int[] v2) {
        int[] arraySinRepetidos = new int[0];
        int contador = 0;

        for (int i = 0; i < v1.length; i++) {
            if (esta(arraySinRepetidos, v1[i])) {
                arraySinRepetidos = Arrays.copyOf(arraySinRepetidos, arraySinRepetidos.length + 1);
                arraySinRepetidos[contador] = v1[i];
                contador++;
            }
        }

        for (int i = 0; i < v2.length; i++) {
            if (esta(arraySinRepetidos, v2[i])) {
                arraySinRepetidos = Arrays.copyOf(arraySinRepetidos, arraySinRepetidos.length + 1);
                arraySinRepetidos[contador] = v2[i];
                contador++;
            }
        }

        return arraySinRepetidos;
    }

    public static boolean esta(int[] vector, int num) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                return false;
            }
        }
        return true;
    }
}
