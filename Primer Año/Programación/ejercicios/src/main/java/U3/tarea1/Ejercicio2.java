package U3.tarea1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.print("Los numeros comprendidos entre " + num1 + " y " + num2 + " son: ");
        numerosComprendidos(num1, num2);
    }

    public static void numerosComprendidos(int num1, int num2) {
        for (int i = num1 + 1; i < num2; i++) {
            System.out.print(i + ", ");
        }
    }
}
