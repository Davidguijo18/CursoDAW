package U3.tarea1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el numero de veces que se mostrara el mensaje echo: ");
        int numero = teclado.nextInt();

        funcion(numero);

    }

    public static void funcion(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.println("Eco");
        }
    }
}
