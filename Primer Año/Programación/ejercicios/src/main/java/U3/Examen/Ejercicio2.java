package U3.Examen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una posicion: ");
        int posicion = teclado.nextInt();

        System.out.print("Introduce la longitud del primer array: ");
        int longitudArray1 = teclado.nextInt();

        System.out.print("Introduce la longitud del segundo array: ");
        int longitudArray2 = teclado.nextInt();

        int[] array1 = new int[longitudArray1];
        rellenarMostrarPrimerArray(array1);
        int[] array2 = new int[longitudArray2];
        rellenarMostrarSegundoArray(array2);

        int[] arrayInsertado = insertarEnVector(array1, array2, posicion);
        System.out.println("\n\nResultado: ");
        for (int i = 0; i < arrayInsertado.length; i++) {
            System.out.print(arrayInsertado[i] + " ");
        }

    }

    public static void rellenarMostrarPrimerArray(int[] array) {
        System.out.print("Primer array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
    }

    public static void rellenarMostrarSegundoArray(int[] array) {
        System.out.print("\nSegundo array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
    }

    public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
        int longitud = v1.length + v2.length;
        int[] arrayInsertado = new int[longitud];
        int contador = 0;

        if (pos < 0) {
            return v1;
        }
        if (pos > v1.length) {
            return v2;
        }

        if (pos == v1.length) {
            for (int i = 0; i < v1.length; i++) {
                arrayInsertado[contador] = v1[i];
                contador++;
            }
            for (int i = 0; i < v2.length; i++) {
                arrayInsertado[contador] = v2[i];
                contador++;
            }
            return arrayInsertado;
        }

        for (int i = 0; i < pos; i++) {
            arrayInsertado[contador] = v1[i];
            contador++;
        }

        for (int i = 0; i < v2.length; i++) {
            arrayInsertado[contador] = v2[i];
            contador++;
        }

        for (int i = pos; i < v1.length; i++) {
            arrayInsertado[contador] = v1[i];
            contador++;
        }

        return arrayInsertado;
    }
}
