package U3.tarea1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primero numero");
        int num1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = teclado.nextInt();

        System.out.println(numeroMayor(num1, num2));

    }

    public static String numeroMayor(int num1, int num2) {
        String mensaje;
        if (num1 > num2) {
            mensaje = "El numero " + num1 + " es mayor que " + num2;
        } else {
            mensaje = "El numero " + num2 + " es mayor que " + num1;
        }

        return mensaje;
    }
}
