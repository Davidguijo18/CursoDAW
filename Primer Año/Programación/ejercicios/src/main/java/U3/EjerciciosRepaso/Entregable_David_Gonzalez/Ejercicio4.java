package U3.EjerciciosRepaso.Entregable_David_Gonzalez;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una serie de numeros para covertirlos en array: ");
        String numeros = teclado.nextLine();

        int[] array = convierteArrayEnString(numeros);

        System.out.print("Array: { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("}");

    }

    public static int[] convierteArrayEnString(String a) {
        if (a.isEmpty()) {
            return new int[0];
        }
        
        int numero = Integer.parseInt(a);
        int numReves = 0, numBien;
        int contador = 0;

        for (int i = 0; i < a.length(); i++) {
            contador++;
        }

        int[] array = new int[contador];
        contador = 0;

        while (numero > 0) {
            numReves = numero % 10 + numReves * 10;
            numero /= 10;
        }

        while (numReves > 0) {
            numBien = numReves % 10;
            array[contador] = numBien;
            contador++;

            numReves /= 10;
        }

        return array;
    }
}
