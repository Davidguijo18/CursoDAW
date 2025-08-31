package U4.tarea2.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la capacidad de la pila: ");
        int capacidadPila = teclado.nextInt();

        PilaTabla pila = new PilaTabla(capacidadPila);

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(5);

        pila.mostrarPila();
        System.out.println();

        pila.desapilar();
        pila.desapilar();
        pila.desapilar();

        pila.mostrarPila();
        System.out.println();

        pila.apilar(7);
        pila.apilar(8);
        pila.apilar(9);

        pila.mostrarPila();
        System.out.println();

        pila.desapilar();

        pila.mostrarPila();
        pila.cima();
    }
    }
