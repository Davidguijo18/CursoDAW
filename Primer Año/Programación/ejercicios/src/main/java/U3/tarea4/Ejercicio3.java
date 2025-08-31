package U3.tarea4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] mesas = new int[10];

        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = (int) (Math.random() * 5);
        }

        System.out.print("Numero de mesa: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " |");
        }

        System.out.println();

        System.out.print("Ocupacion:      ");
        for (int i = 0; i < mesas.length; i++) {
            System.out.print(mesas[i] + " |");
        }

        System.out.print("\n\n¿Cuantas personas son?: ");
        int cantPersonas = teclado.nextInt();

        if (cantPersonas >= 5) {
            System.out.println("Lo siento, no admitimos grupos de " + cantPersonas + ", haga grupos de 4 personas como máximo e intente de nuevo");
            System.exit(0);
        }

        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0) {
                int j = i + 1;
                System.out.println("Por favor, sientese en la mesa numero " + j);
                System.exit(0);
            }
        }
        if (cantPersonas == 1) {
            for (int i = 0; i < mesas.length; i++) {
                if (4 - cantPersonas >= mesas[i]) {
                    int j = i + 1;
                    System.out.println("Tendras que compartir mesa. Por favor, sientate en la mesa " + j);
                    break;
                }
            }
        } else if (cantPersonas == 2) {
            for (int i = 0; i < mesas.length; i++) {
                if (4 - cantPersonas >= mesas[i]) {
                    int j = i + 1;
                    System.out.println("Tendran que compartir mesa. Por favor, sientense en la mesa " + j);
                    break;
                }
            }
        } else if (cantPersonas == 3) {
            for (int i = 0; i < mesas.length; i++) {
                if (4 - cantPersonas >= mesas[i]) {
                    int j = i + 1;
                    System.out.println("Tendran que compartir mesa. Por favor, sientense en la mesa " + j);
                    break;
                }
            }
        } else if (cantPersonas == 4) {
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] == 0) {
                    int j = i + 1;
                    System.out.println("Por favor, sientense en la mesa " + j);
                    break;
                }
            }
        } else if (cantPersonas == -1) {
            System.out.println("Gracias. Hasta pronto");
        }
    }
}