package U3.tarea4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int minimo;
        int maximo;
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 500) + 1;
            if (i % 20 == 0) {
                System.out.println();
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + " ");
            }
        }

        System.out.print("\n¿Que quiere destacar? (1 – minimo, 2 – maximo): ");
        int opcion = teclado.nextInt();

        if (opcion == 2) {
            maximo = array[0];

            for (int i = 0; i < array.length; i++) {
                if (maximo <= array[i]) {
                    maximo = array[i];
                }
            }

            for (int i = 0; i < array.length; i++) {
                if (i % 20 == 0) {
                    if (array[i] == maximo) {
                        System.out.print("**" + array[i] + "** ");
                    } else {
                        System.out.println();
                        System.out.print(array[i] + " ");
                    }
                } else {
                    if (array[i] == maximo) {
                        System.out.print("**" + array[i] + "** ");
                    } else {
                        System.out.print(array[i] + " ");
                    }
                }
            }
        } else if (opcion == 1) {
            minimo = array[0];
            for (int i = 0; i < array.length; i++) {
                if (minimo >= array[i]) {
                    minimo = array[i];
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (i % 20 == 0) {
                    if (array[i] == minimo) {
                        System.out.print("**" + array[i] + "** ");
                    } else {
                        System.out.println();
                        System.out.print(array[i] + " ");
                    }
                } else {
                    if (array[i] == minimo) {
                        System.out.print("**" + array[i] + "** ");
                    } else {
                        System.out.print(array[i] + " ");
                    }
                }
            }
        }
    }
}
