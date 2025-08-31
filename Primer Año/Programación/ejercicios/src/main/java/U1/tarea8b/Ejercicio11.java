package U1.tarea8b;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        do {
            System.out.println("Introduce la altura");
            altura = teclado.nextInt();

            if (altura % 2 == 1 && altura >= 3) {
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < altura; j++) {
                        if (i == j || i + j == altura - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("Debes introducir un numero impar mayor o igual que 3");
            }

        } while (altura % 2 == 0 || altura < 3);
    }
}
