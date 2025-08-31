package U1.Recuperacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String resultado;

        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Introduce la nota del segundo examen: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Introduce la nota del tercer examen: ");
        double nota3 = teclado.nextDouble();

        double notaMedia = (nota1 + nota2 + nota3) / 3;
        teclado.nextLine();

        if (notaMedia < 5) {
            resultado = "Suspenso";

            System.out.print("Cual ha sido el resultado de la recuperacion? (apto/no apto): ");
            String recuperacion = teclado.nextLine();

            if (recuperacion.equalsIgnoreCase("apto")) {
                resultado = "Suficiente";
                notaMedia = 5;
            } else if (recuperacion.equalsIgnoreCase("no apto")) {
                resultado = "Suspenso";
            }

        } else if (notaMedia >= 5 && notaMedia < 6) {
            resultado = "Suficiente";
        } else if (notaMedia >= 6 && notaMedia < 7) {
            resultado = "Bien";
        } else if (notaMedia >= 7 && notaMedia < 9) {
            resultado = "Notable";
        } else {
            resultado = "Sobresaliente";
        }

        System.out.println("\nTu nota de programacion es " + notaMedia + " - " + resultado);
    }
}
