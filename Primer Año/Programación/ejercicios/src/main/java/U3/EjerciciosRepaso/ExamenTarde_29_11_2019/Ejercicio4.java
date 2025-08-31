package U3.EjerciciosRepaso.ExamenTarde_29_11_2019;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        int[] array = new int[longitud];
        rellenarArray(array);

        int[] arrayNumerosCapicua = filtraCapicuas(array);
        System.out.print("Los numeros capicua son: ");
        for (int i = 0; i < arrayNumerosCapicua.length; i++) {
            System.out.print(arrayNumerosCapicua[i] + " ");
        }
    }


    public static void rellenarArray(int[] array) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un numero: ");
            array[i] = teclado.nextInt();
        }
    }

    public static int[] filtraCapicuas(int[] x) {
        int[] arrayCapicuas = new int[0];
        int numNormal, numReves, contador = 0;
        for (int i = 0; i < x.length; i++) {
            numNormal = x[i];
            numReves = 0;
            int darVuelta = x[i];

            while (darVuelta > 0) {
                numReves = darVuelta % 10 + numReves * 10;
                darVuelta /= 10;
            }

            if (numNormal == numReves) {
                arrayCapicuas = Arrays.copyOf(arrayCapicuas, arrayCapicuas.length + 1);
                arrayCapicuas[contador] = numNormal;
                contador++;
            }
        }
        if (arrayCapicuas.length == 0) {
            return new int[]{-1};
        } else {
            return arrayCapicuas;
        }
    }
}
