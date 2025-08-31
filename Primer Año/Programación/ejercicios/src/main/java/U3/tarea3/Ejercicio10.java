package U3.tarea3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int contadorImpares = 0;

        System.out.print("Introduce la cantidad de numeros que quieres introducir: ");
        int numeros = teclado.nextInt();
        int array[] = new int[numeros];

        do {
            if (contador != array.length) {
                System.out.print("Introduce un numero: ");
                int numero = teclado.nextInt();
                if (numero % 2 == 0) {
                    array[contador] = numero;
                } else {
                    contadorImpares++;
                }
            } else {
                break;
            }
            contador++;

        } while (contador > 0);

        System.out.print("\nArray de numeros pares: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nEl total de numeros impares es de: " + contadorImpares);
    }
}
