package U1.tarea7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        int nivel_de_estudios;
        int ingreso;
        boolean jasp;

        System.out.println("Introduce la edad");
        edad = teclado.nextInt();

        System.out.println("Introduce el nivel de estudios");
        nivel_de_estudios = teclado.nextInt();

        System.out.println("Introduce el ingreso");
        ingreso = teclado.nextInt();

        if (edad <= 28 && nivel_de_estudios > 3 && ingreso > 28000) {
            jasp = true;
        } else {
            jasp = false;
        }

        System.out.println("La respuesta de la variable jasp es: " + jasp);
    }
}
