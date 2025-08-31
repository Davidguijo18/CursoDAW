package U3.tarea1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero");
        int numero2 = teclado.nextInt();

        if (amigos(numero1, numero2)) {
            System.out.println(numero1 + " y " + numero2 + " son numeros amigos.");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son numeros amigos.");
        }
    }

    public static int sumaDivisoresPropios(int numero) {
        int suma = 1;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static boolean amigos(int num1, int num2) {
        int sumaDivisoresNum1 = sumaDivisoresPropios(num1);
        int sumaDivisoresNum2 = sumaDivisoresPropios(num2);

        return (sumaDivisoresNum1 == num2 && sumaDivisoresNum2 == num1);
    }
}
