package U1.U1_Entregable;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        do {

            System.out.println("Introduce la altura (Debes introducir un numero mayor de 3 e impar)");
            altura = teclado.nextInt();

            //Pinto las Z aqui
            if (altura > 3 && altura % 2 == 1) {

                for (int i = 1; i <= altura; i++) {
                    for (int figuras = 1; figuras <= 2; figuras++) {
                        for (int j = 1; j <= altura; j++) {
                            if (i == 1 || i == altura || j == altura - i + 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("   ");
                    }
                    System.out.println();
                }

            } else {

                System.out.println("El numero que has introducido no es mayor de 3 o bien es impar\n");
            }

        } while (altura <= 3 || altura % 2 == 0);
    }
}
