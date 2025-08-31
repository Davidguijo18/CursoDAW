package U3.EjerciciosRepaso.ExamenTarde_29_11_2019;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        long num1 = teclado.nextLong();

        System.out.print("Introduce otro numero: ");
        long num2 = teclado.nextLong();

        long numerosJuntos = juntaNumeros(num1, num2);
        System.out.println("El resultado de unir los dos numeros introducidos es: " + numerosJuntos);
    }

    public static long juntaNumeros(long a, long b) {
        String numerosJuntos = a + "" + b;

        return Long.parseLong(numerosJuntos);
    }
}
