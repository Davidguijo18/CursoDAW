package U3.EjerciciosRepaso.Examen2021_Tarde_GrupoB;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        construirArray(array);
        mostarArrays(array);

        System.out.println();
        int[] arrayNumeros4 = filtraCon4(array);
        System.out.print("\nLos numeros que tienen 4 del array son: ");
        mostarArrays(arrayNumeros4);
    }

    public static void construirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 901) + 100;
        }
    }

    public static int[] filtraCon4(int[] x) {
        int[] arrayNumerosCon4 = new int[0];
        int numeroReves, numGuardar, indice = 0;
        for (int i = 0; i < x.length; i++) {
            numGuardar = x[i];
            while (x[i] > 0) {
                numeroReves = x[i] % 10;
                if (numeroReves == 4) {
                    arrayNumerosCon4 = Arrays.copyOf(arrayNumerosCon4, arrayNumerosCon4.length + 1);
                    arrayNumerosCon4[indice] = numGuardar;
                    indice++;
                    break;
                }
                x[i] /= 10;
            }
        }

        if (arrayNumerosCon4.length == 0) {
            return new int[]{-1};
        }else{
            return arrayNumerosCon4;
        }
    }

    public static void mostarArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
