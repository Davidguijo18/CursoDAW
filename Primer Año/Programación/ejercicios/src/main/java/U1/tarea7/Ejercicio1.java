package U1.tarea7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        int intercambio;

        System.out.println("Introduce el valor de la variable a");
        a = teclado.nextInt();
        System.out.println("El valor de a es " + a);
        System.out.println(" ");

        System.out.println("Introduce el valor de la variable b");
        b = teclado.nextInt();
        System.out.println("El valor de b es " + b);
        System.out.println(" ");

        intercambio = a;
        a = b;
        b = intercambio;

        System.out.println("El valor intercambiado de los numeros es --> a:" + a + " y b:" + b);
    }
}
