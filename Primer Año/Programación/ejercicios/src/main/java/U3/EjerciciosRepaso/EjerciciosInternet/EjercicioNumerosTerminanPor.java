package U3.EjerciciosRepaso.EjerciciosInternet;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioNumerosTerminanPor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el numero de posiciones que tendra el array: ");
        int posiciones = teclado.nextInt();

        int[] array = new int[posiciones];
        crearArray(array);
        mostrarArray(array);

        System.out.print("\n\nIntroduce la cifra de los numeros: ");
        int cifra = teclado.nextInt();


        int[] arrayConNumero = crearArrayNumero(array, cifra);
        System.out.print("\nLos numeros que tienen " + cifra + " son: ");
        for (int i = 0; i < arrayConNumero.length; i++) {
            System.out.print(arrayConNumero[i] + " ");
        }

    }

    public static void crearArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) + 100;
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] crearArrayNumero(int[] array, int pasarNumero) {
        int[] arrayConNumero = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (contieneNumero(array[i], pasarNumero)) {
                arrayConNumero = Arrays.copyOf(arrayConNumero, arrayConNumero.length + 1);
                arrayConNumero[contador] = array[i];
                contador++;
            }
        }
        return arrayConNumero;
    }

    public static boolean contieneNumero(int numero, int comprobarNumero) {
        int numReves;
        while (numero > 0) {
            numReves = numero % 10;
            if (numReves == comprobarNumero) {
                return true;
            }
            numero /= 10;
        }
        return false;
    }
}
