package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioJuntarDosNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce otro numero: ");
        int numero2 = teclado.nextInt();

        int[] juntos = juntarNumeros(numero1, numero2);
        System.out.println("\nLos dos numeros juntos son: ");
        for (int i = 0; i < juntos.length; i++) {
            System.out.print(juntos[i]);
        }
    }

    public static int[] juntarNumeros(int num1, int num2) {
        int[] arrayJuntos = new int[0];
        int contador = 0;
        int numReves1 = 0, numReves2 = 0;
        int numBien1, numBien2;

        while (num1 > 0 && num2 > 0) {
            numReves1 = num1 % 10 + numReves1 * 10;
            numReves2 = num2 % 10 + numReves2 * 10;

            num1 /= 10;
            num2 /= 10;
        }

        while (numReves1 > 0) {
            numBien1 = numReves1 % 10;
            arrayJuntos = Arrays.copyOf(arrayJuntos, arrayJuntos.length + 1);
            arrayJuntos[contador] = numBien1;
            contador++;

            numReves1 /= 10;
        }

        while (numReves2 > 0) {
            numBien2 = numReves2 % 10;
            arrayJuntos = Arrays.copyOf(arrayJuntos, arrayJuntos.length + 1);
            arrayJuntos[contador] = numBien2;
            contador++;

            numReves2 /= 10;
        }

        return arrayJuntos;
    }
}
