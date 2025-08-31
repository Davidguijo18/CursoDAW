package U4.tarea1.Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Sintonizador sintonizador = new Sintonizador();
        int opcion;

        System.out.println("-------- Radio --------");
        System.out.println("1 - Mostrar frecuencia");
        System.out.println("2 - Subir frecuencia");
        System.out.println("3 - Bajar frecuencia");
        System.out.println("4 - Apagar radio");

        do {
            System.out.print("Introduce una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    sintonizador.mostrarFrecuencia();
                    break;

                case 2:
                    sintonizador.subirFrecuencia();
                    break;

                case 3:
                    sintonizador.bajarFrecuencia();
                    break;

                case 4:
                    System.out.println("\nApagaste la radio");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (opcion != 4);

    }
}
