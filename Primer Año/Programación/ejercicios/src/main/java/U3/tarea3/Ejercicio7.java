package U3.tarea3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 1;

        int[] primerTrimestre = new int[5];
        for (int i = 0; i < primerTrimestre.length; i++) {
            System.out.print("Introduce la nota del primer trimestre del alumno " + contador + ": ");
            primerTrimestre[i] = teclado.nextInt();
            contador++;
        }

        contador = 1;
        System.out.println();

        int[] segundoTrimestre = new int[5];
        for (int i = 0; i < segundoTrimestre.length; i++) {
            System.out.print("Introduce la nota del segundo trimestre del alumno " + contador + ": ");
            segundoTrimestre[i] = teclado.nextInt();
            contador++;
        }

        contador = 1;
        System.out.println();

        int[] tercerTrimestre = new int[5];
        for (int i = 0; i < tercerTrimestre.length; i++) {
            System.out.print("Introduce la nota del tercer trimestre del alumno " + contador + ": ");
            tercerTrimestre[i] = teclado.nextInt();
            contador++;
        }

        contador = 1;
        System.out.println("\nNOTAS FINALES");
        for (int i = 0; i < 5; i++) {
            int media = (primerTrimestre[i] + segundoTrimestre[i] + tercerTrimestre[i]) / 3;
            System.out.println("Media del alumno " + contador + ": " + media);
            contador++;
        }
    }
}
