package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        do {
            System.out.println(" ");
            System.out.println("Introduce un numero para mostrar su tabla de multiplicar");
            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("TABLA DEL 1");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 1 = " + i * numero);
                    }
                    break;

                case 2:
                    System.out.println("TABLA DEL 2");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 2 = " + i * numero);
                    }
                    break;

                case 3:
                    System.out.println("TABLA DEL 3");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 3 = " + i * numero);
                    }
                    break;

                case 4:
                    System.out.println("TABLA DEL 4");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 4 = " + i * numero);
                    }
                    break;

                case 5:
                    System.out.println("TABLA DEL 5");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 5 = " + i * numero);
                    }
                    break;

                case 6:
                    System.out.println("TABLA DEL 6");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 6 = " + i * numero);
                    }
                    break;

                case 7:
                    System.out.println("TABLA DEL 7");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 7 = " + i * numero);
                    }
                    break;

                case 8:
                    System.out.println("TABLA DEL 8");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 8 = " + i * numero);
                    }
                    break;

                case 9:
                    System.out.println("TABLA DEL 9");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 9 = " + i * numero);
                    }
                    break;

                case 10:
                    System.out.println("TABLA DEL 10");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x 10 = " + i * numero);
                    }
                    break;

            }

        } while (numero >= 1 && numero <= 10);
        System.out.println("Has finalizado el programa");
    }
}
