package U1.tarea6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int parImpar;

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            parImpar = 1;
        } else {
            parImpar = 0;
        }

        switch (parImpar) {
            case 1:
                System.out.println("El numero es par");
                break;

            case 0:
                System.out.println("El numero es impar");
                break;
        }
    }
}