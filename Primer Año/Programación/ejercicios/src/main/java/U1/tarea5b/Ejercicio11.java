package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String respuesta;
        int acertadas = 0;

        System.out.println("BIENVENIDO AL CUESTIONARIO");
        System.out.println("Para responder preguntas, debes introducir V (verdadero) o F (false)");
        System.out.println("Recuerda introducir las letras en mayuscula");
        System.out.println(" ");

        System.out.println("Java es un lenguaje de programacion");
        respuesta = teclado.nextLine();

        if (respuesta.equals("V")) {
            acertadas++;
        }

        System.out.println("HTML es un lenguaje de programacion");
        respuesta = teclado.nextLine();

        if (respuesta.equals("F")) {
            acertadas++;
        }

        System.out.println("Java es uno de los lenguajes de programacion mas utilizados en el mundo");
        respuesta = teclado.nextLine();

        if (respuesta.equals("V")) {
            acertadas++;
        }

        System.out.println("Las bases de datos no son algo importante a la hora de desarrollar una aplicacion");
        respuesta = teclado.nextLine();

        if (respuesta.equals("F")) {
            acertadas++;
        }

        System.out.println("Java es un lenguaje de programacion de alto nivel");
        respuesta = teclado.nextLine();

        if (respuesta.equals("V")) {
            acertadas++;
        }

        System.out.println("El lenguaje que entiende el ordenador es el codigo maquina (numeros binarios)");
        respuesta = teclado.nextLine();

        if (respuesta.equals("V")) {
            acertadas++;
        }

        System.out.println("Lenguaje de marcas es una asignatura enfocada a la cria de gallinas");
        respuesta = teclado.nextLine();

        if (respuesta.equals("F")) {
            acertadas++;
        }

        System.out.println("El hardware es la parte fisica del ordenador");
        respuesta = teclado.nextLine();

        if (respuesta.equals("V")) {
            acertadas++;
        }

        System.out.println("La memoria ram guarda datos de forma permanente");
        respuesta = teclado.nextLine();

        if (respuesta.equals("F")) {
            acertadas++;
        }

        System.out.println("El cerebro del ordenador es la CPU (procesador)");
        respuesta = teclado.nextLine();

        if (respuesta.equals("V")) {
            acertadas++;
        }

        System.out.println(" ");
        System.out.println("Enhorabuena, has finalizado el test");
        System.out.println("Has tenido un total de " + acertadas + " aciertos (" + acertadas + "/10)");

    }
}
