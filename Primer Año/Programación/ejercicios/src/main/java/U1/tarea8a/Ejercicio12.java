package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        int nota;
        int suspensos = 0;

        do {
            System.out.println(" ");
            System.out.println("Introduce la nota del alumno " + contador);
            nota = teclado.nextInt();
            contador++;

            if (nota < 5) {
                suspensos++;
            }

        } while (contador != 6);

        if (suspensos >= 1) {
            System.out.println(" ");
            System.out.println("Hay algun suspenso");
        } else {
            System.out.println(" ");
            System.out.println("No hay ningun suspenso");
        }
    }
}
