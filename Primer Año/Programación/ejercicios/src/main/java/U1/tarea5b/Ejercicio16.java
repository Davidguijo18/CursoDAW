package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduzca un numero");
        numero = teclado.nextInt();

        System.out.println("La ultima cifra del numero es " + numero % 10);

    }
}
