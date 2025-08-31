package U3.Entregable;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int tamano = teclado.nextInt();

        int[] array = new int[tamano];

        System.out.print("Array original: ");
        construirArray(array);

        int[] arrayParImpar = paresImpares(array, tamano);

        System.out.print("\nEl array de pares e impares es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(arrayParImpar[i] + " ");
        }
    }

    public static void construirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 47) + 18 + 1;
            System.out.print(array[i] + " ");
        }
    }

    public static int[] paresImpares(int[] array, int tamano) {
        int[] arrayParImpar = new int[tamano];
        int contadorPares = 0;
        int contadorImpares = 0;
        tamano = tamano - 1;

        for (int i = 0; i < array.length; i++) {
            if (comprobarParImpar(array[i])) {
                arrayParImpar[contadorPares] = array[i];
                contadorPares++;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (!comprobarParImpar(array[i])) {
                arrayParImpar[tamano - contadorImpares] = array[i];
                contadorImpares++;
            }
        }

        return arrayParImpar;
    }

    public static boolean comprobarParImpar(int numero) {
        boolean par = false;

        if (numero % 2 == 0) {
            par = true;
        }

        return par;
    }
}
