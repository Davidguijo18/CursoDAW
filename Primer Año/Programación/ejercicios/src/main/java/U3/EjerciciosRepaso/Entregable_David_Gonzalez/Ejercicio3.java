package U3.EjerciciosRepaso.Entregable_David_Gonzalez;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        rellenarArray(array);
        System.out.print("El array es original es: ");
        mostrarArray(array);
        int[] arrayDe8 = filtraCon8(array);
        System.out.print("\nEl array de numeros que contienen el 8 es: ");
        mostrarArray(arrayDe8);

    }

    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000) + 1;
        }
    }

    public static int[] filtraCon8(int[] x) {
        int contador = 0;
        for (int i = 0; i < x.length; i++) {
            if (comprobarNumero8(x[i])) {
                contador++;
            }
        }
        int[] arrayNumeros8 = new int[contador];
        contador = 0;

        for (int i = 0; i < x.length; i++) {
            if (comprobarNumero8(x[i])) {
                arrayNumeros8[contador] = x[i];
                contador++;
            }
        }
        return arrayNumeros8;
    }

    public static boolean comprobarNumero8(int numero) {
        int numReves;
        boolean estado = false;

        while (numero > 0) {
            numReves = numero % 10;
            if (numReves == 8) {
                estado = true;
                break;
            }
            numero /= 10;
        }
        return estado;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
