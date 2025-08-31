package U4.tarea1.Ejercicio8;

import U4.tarea1.Ejercicio7.Sintonizador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Bombilla bombilla = new Bombilla();
        int opcion;

        System.out.println("-------- Bombillas --------");
        System.out.println("1 - Mostrar estado");
        System.out.println("2 - Encender interruptor general");
        System.out.println("3 - Apagar interruptor general");
        System.out.println("4 - Encender bombilla");
        System.out.println("5 - Apagar bombilla");
        System.out.println("6 - Salir del sistema");

        do {
            System.out.print("Introduce una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                   bombilla.mostrarEstado();
                    break;

                case 2:
                    bombilla.encenderGeneral();
                    break;

                case 3:
                    bombilla.apagarGeneral();
                    break;

                case 4:
                    bombilla.encenderBombilla();
                    break;

                case 5:
                    bombilla.apagarBombilla();
                    break;

                case 6:
                    System.out.println("\nSaliste del sistema");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (opcion != 6);
    }

}
