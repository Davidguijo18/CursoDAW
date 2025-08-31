package U3.EjerciciosRepaso.Entregable_David_Gonzalez;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        System.out.print("Introduce el numero incial del intervalo: ");
        int numInicial = teclado.nextInt();

        System.out.print("Introduce el numero final del intervalo: ");
        int numFinal = teclado.nextInt();

        int[] arrayFinal = aleatorioDeArray(numInicial, numFinal, longitud);

        System.out.print("\nEl array es: ");
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.print(arrayFinal[i] + " ");
        }
    }

    public static int[] aleatorioDeArray(int a, int b, int cantidad) {
        int[] array = new int[cantidad];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1.0)) + a;
        }
        return array;
    }
}
