package U1.tarea8a;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        int nota;
        int suspensos = 0;
        int condicionados = 0;
        int aprobados = 0;

        do {
            System.out.println(" ");
            System.out.println("Introduce la nota del alumno " + contador);
            nota = teclado.nextInt();
            contador++;

            if (nota < 4) {
                suspensos++;
            } else if (nota == 4) {
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            }
        } while (contador != 7);

        System.out.println(" ");
        System.out.println("CALIFICACIONES");
        System.out.println("Alumnos aprobados ---> " + aprobados);
        System.out.println("Alumnos condicionados ---> " + condicionados);
        System.out.println("Alumnos suspensos ---> " + suspensos);
    }
}
