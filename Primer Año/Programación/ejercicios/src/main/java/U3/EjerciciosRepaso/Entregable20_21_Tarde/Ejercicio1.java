package U3.EjerciciosRepaso.Entregable20_21_Tarde;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }


        int[] numerosPrimos = filtraPrimos(array);

        System.out.print("Los numeros primos son: ");
        for (int numerosPrimo : numerosPrimos) {
            System.out.print(numerosPrimo + " ");
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] filtraPrimos(int[] array) {
        int contadorNumerosPrimos = 0;
        for (int j : array) {
            if (esPrimo(j)) {
                contadorNumerosPrimos++;
            }
        }

        int[] arrayPrimos = new int[contadorNumerosPrimos];

        int contador = 0;
        for (int j : array) {
            if (esPrimo(j)) {
                arrayPrimos[contador] = j;
                contador++;
            }
        }

        if (contadorNumerosPrimos < 1) {
            arrayPrimos = new int[]{-1};
        }


        return arrayPrimos;
    }
}
