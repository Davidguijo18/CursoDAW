package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100);
        int numero = 0;

        while (numero != -1) {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();

            if (numero > numeroSecreto && numero >= 0) {
                System.out.println("El numero es menor que el que has introducido");
                System.out.println(" ");
            } else if (numero == numeroSecreto && numero >= 0) {
                System.out.println("Has ganado la partida");
                break;
            } else {
                System.out.println("El numero es mayor que el que has introducido");
                System.out.println(" ");
            }

        }
        if (numero == -1) {
            System.out.println("Te has rendido");
        }
    }
}
