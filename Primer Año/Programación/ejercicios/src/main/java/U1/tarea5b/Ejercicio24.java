package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String turnoJug1;
        String turnoJug2;

        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera)");
        turnoJug1 = teclado.nextLine();

        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera)");
        turnoJug2 = teclado.nextLine();

        if (!turnoJug1.equals("papel") && !turnoJug1.equals("piedra") && !turnoJug1.equals("tijera")) {
            System.out.println("EL jugador 1 debe de introducir una opcion valida");
        } else if (!turnoJug2.equals("papel") && !turnoJug2.equals("piedra") && !turnoJug2.equals("tijera")) {
            System.out.println("EL jugador 2 debe de introducir una opcion valida");
        } else {


            if (turnoJug1.equals(turnoJug2)) {
                System.out.println("Empate");
            }

            if (turnoJug1.equals("piedra") && turnoJug2.equals("papel")) {
                System.out.println("Gana el jugador 2");
            }

            if (turnoJug1.equals("papel") && turnoJug2.equals("piedra")) {
                System.out.println("Gana el jugador 1");
            }

            if (turnoJug1.equals("tijera") && turnoJug2.equals("papel")) {
                System.out.println("Gana el jugador 1");
            }

            if (turnoJug1.equals("papel") && turnoJug2.equals("tijera")) {
                System.out.println("Gana el jugador 2");
            }

            if (turnoJug1.equals("piedra") && turnoJug2.equals("tijera")) {
                System.out.println("Gana el jugador 1");
            }

            if (turnoJug1.equals("tijera") && turnoJug2.equals("piedra")) {
                System.out.println("Gana el jugador 2");
            }
        }
    }
}
