package U3.EjerciciosRepaso.Examen2021_Tarde_GrupoB;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        String numero = teclado.nextLine();

        int[] array = convierteArrayEnString(numero);
        mostrarArray(array);
    }

    public static int[] convierteArrayEnString(String a) {
        int contador = 0, numReves = 0, numBien;
        int[] array = new int[0];
        if (a.isEmpty()) {
            return new int[0];
        }

        int numero = Integer.parseInt(a);

        for (int i = 0; i < a.length(); i++) {
            while (numero > 0) {
                numReves = numero % 10 + numReves * 10;
                numero /= 10;
            }
            while (numReves > 0) {
                numBien = numReves % 10;
                array = Arrays.copyOf(array, array.length + 1);
                array[contador] = numBien;
                contador++;

                numReves /= 10;
            }
        }
        return array;
    }

    public static void mostrarArray(int[] array) {
        System.out.print("Array: { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("}");
    }
}
