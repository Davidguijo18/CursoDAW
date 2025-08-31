package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            contador++;
            System.out.println(" ");
            System.out.println("TABLA DEL " + contador);
            for (int j = 0; j <= 10; j++) {
                System.out.println(contador + " x " + j + " = " + contador * j);
            }
        }
    }
}
