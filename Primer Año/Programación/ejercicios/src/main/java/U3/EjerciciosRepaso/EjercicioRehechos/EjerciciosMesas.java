package U3.EjerciciosRepaso.EjercicioRehechos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjerciciosMesas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] mesas = new int[10];

        System.out.print("\nN de mesa: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        mostrarMesas(mesas);

        System.out.print("\n¿Cuantos son?(Introduzca -1 para salir del programa): ");
        int personas = teclado.nextInt();


        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0) {
                int mesaCorrecta = i + 1;
                System.out.println("Por favor, sientense en la mesa " + mesaCorrecta);
                break;
            }
        }

        if (personas == 4) {
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] >= 1) {
                    System.out.println("Lo sentimos, en estos momentos no tenemos sitio");
                    break;
                }
            }
        }

        if (personas == 3) {
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] >= 2) {
                    System.out.println("Lo sentimos, en estos momentos no tenemos sitio");
                    break;
                }
                if (mesas[i] == 1) {
                    int mesaCorrecta = i + 1;
                    System.out.println("Tendran que compartir mesa. Por favor, sientense en la mesa " + mesaCorrecta);
                    break;
                }
            }
        }

        if (personas == 2) {
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] >= 3) {
                    System.out.println("Lo sentimos, en estos momentos no tenemos sitio");
                    break;
                }
                if (mesas[i] <= 2) {
                    int mesaCorrecta = i + 1;
                    System.out.println("Tendran que compartir mesa. Por favor, sientense en la mesa " + mesaCorrecta);
                    break;
                }
            }
        }

        if (personas == 1) {
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] > 3) {
                    System.out.println("Lo sentimos, en estos momentos no tenemos sitio");
                    break;
                }
                if (mesas[i] <= 3) {
                    int mesaCorrecta = i + 1;
                    System.out.println("Tendran que compartir mesa. Por favor, sientense en la mesa " + mesaCorrecta);
                    break;
                }
            }
        }

    }

    public static void mostrarMesas(int[] array) {
        System.out.print("Ocupacion: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);

            System.out.print(array[i] + " | ");
        }
    }
}
