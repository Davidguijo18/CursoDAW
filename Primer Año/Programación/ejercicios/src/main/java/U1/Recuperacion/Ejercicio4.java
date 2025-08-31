package U1.Recuperacion;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        do {
            System.out.print("Introduce la altura: ");
            altura = teclado.nextInt();

            if (altura % 2 == 0 || altura < 3) {
                System.out.println("Error. El numero introducido no es correcto");
            }

        } while (altura % 2 == 0 || altura < 3);

        for (int i = 0; i < altura; i++) {
            //Lo de los espacios no me sale bien :(
            for (int espacios = 1; espacios <= 2; espacios++) {
                for (int j = 0; j < altura; j++) {
                    if (i + j == (altura - 1) / 2 || i + 1 - j == (altura + 1) / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
