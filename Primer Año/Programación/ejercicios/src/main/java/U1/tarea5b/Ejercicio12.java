package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Introduce el primer numero");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero");
        num2 = teclado.nextInt();

        System.out.println("Introduce el tercer numero");
        num3 = teclado.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.println("El orden de mayor a menor es: " + num1 + "," + num2 + "," + num3);
        }

        if (num1 > num3 && num3 > num2) {
            System.out.println("El orden de mayor a menor es: " + num1 + "," + num3 + "," + num2);
        }

        if (num2 > num1 && num1 > num3) {
            System.out.println("El orden de mayor a menor es: " + num2 + "," + num1 + "," + num3);
        }

        if (num2 > num3 && num3 > num1) {
            System.out.println("El orden de mayor a menor es: " + num2 + "," + num3 + "," + num1);
        }

        if (num3 > num2 && num2 > num1) {
            System.out.println("El orden de mayor a menor es: " + num3 + "," + num2 + "," + num1);
        }

        if (num3 > num1 && num1 > num2) {
            System.out.println("El orden de mayor a menor es: " + num3 + "," + num1 + "," + num2);
        }
    }
}
