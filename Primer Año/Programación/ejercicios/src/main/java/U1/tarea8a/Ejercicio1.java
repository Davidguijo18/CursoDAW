package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El numero introducido es par");
                System.out.println("Su cuadrado es " + numero * numero);
                System.out.println(" ");
            } else {
                System.out.println("El numero introducido es impar");
                System.out.println("Su cuadrado es " + numero * numero);
                System.out.println(" ");
            }
        } while (numero != 0);

        System.out.println("Has finalizado el programa");
    }
}
