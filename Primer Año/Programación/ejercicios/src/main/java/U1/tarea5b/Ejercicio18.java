package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double notaControl1;
        double notaControl2;
        String resultadoRecuperacion = "";

        System.out.println("Introduce la nota del primer control: ");
        notaControl1 = teclado.nextDouble();

        System.out.println("Introduce la nota del segundo control: ");
        notaControl2 = teclado.nextDouble();

        double media = (notaControl1 + notaControl2) / 2;

        teclado.nextLine();

        if (media >= 5) {
            System.out.println("Enhorabuena, has aprobado la asignatura. Tu nota final es " + media);
        } else {
            System.out.println("Has aprobado el examen de recuperacion? Introduzca si o no");
            resultadoRecuperacion = teclado.next();

            if (resultadoRecuperacion.equals("si")) {
                System.out.println("Tu nota de programacion es 5");
            } else if (resultadoRecuperacion.equals("no")) {
                System.out.println("Tu nota de programacion es " + media);
            } else {
                System.out.println("Has introducido un valor incorrecto");
            }
        }
    }
}
