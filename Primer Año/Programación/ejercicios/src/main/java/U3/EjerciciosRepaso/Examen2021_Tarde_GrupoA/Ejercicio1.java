package U3.EjerciciosRepaso.Examen2021_Tarde_GrupoA;

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
        rellenarMostrarArray(array1);
        System.out.print("\nSegundo array: ");
        rellenarMostrarArray(array2);

        System.out.print("\n\nEl array mezclado es: ");
        int[] mezcla = mezcla(array1, array2);
        for (int i = 0; i < mezcla.length; i++) {
            System.out.print(mezcla[i] + " ");
        }

    }

    public static void rellenarMostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9) + 1;
            System.out.print(array[i] + " ");
        }
    }

    public static int[] mezcla(int[] a, int[] b) {
        int[] arrayMezcla = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            arrayMezcla[k++] = a[i++];
            arrayMezcla[k++] = b[j++];
        }

        while (i < a.length) {
            arrayMezcla[k++] = a[i++];
        }

        while (j < b.length) {
            arrayMezcla[k++] = b[j++];
        }

        return arrayMezcla;
    }
}
