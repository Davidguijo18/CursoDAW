package U3.tarea3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cantidad de numeros que quiere introducir");
        int numeros = teclado.nextInt();

        int[] array = new int[numeros];
        int contadorCero = 0;
        double mediaPositiva = 0;
        double mediaNegativa = 0;
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un numero: ");
            array[i] = teclado.nextInt();

            if (array[i] == 0) {
                contadorCero++;
            } else if (array[i] > 0 && array[i] != 0) {
                mediaPositiva = (mediaPositiva + array[i]);
                numerosPositivos++;
            } else if (array[i] < 0 && array[i] != 0) {
                mediaNegativa = (mediaNegativa + array[i]);
                numerosNegativos++;
            }
        }

        mediaPositiva = mediaPositiva / numerosPositivos;
        mediaNegativa = mediaNegativa / numerosNegativos;

        System.out.println("\nEl numero total de 0 es " + contadorCero);
        System.out.println("La media de los numeros positivos es " + mediaPositiva);
        System.out.println("La media de los numeros negativos es " + mediaNegativa);

    }
}
