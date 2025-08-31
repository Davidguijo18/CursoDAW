package U3.tarea2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vidas = 15;

        System.out.println("Bienvenido juego introduce la contraseña");
        System.out.println("Introduce la contraseña que el segundo jugador tendra que adivinar");
        String contrasena = teclado.nextLine();
        char primerCaracter = contrasena.charAt(0);
        char segundoCaracter = contrasena.charAt(contrasena.length() - 1);

        System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");


        do {
            System.out.println("Palabra por la que empieza: " + primerCaracter);
            System.out.println("Palabra por la que termina: " + segundoCaracter);
            System.out.println("Vidas restantes: " + vidas + "\n");

            System.out.println("Introduce una contraseña (debera ser la misma que la introducida por el otro jugador sin importar mayusculas o minusculas)");
            String adivinar = teclado.nextLine();

            if (adivinar.equalsIgnoreCase(contrasena)) {
                System.out.println("\nHas ganado la partida!!");
                break;
            } else {
                System.out.println("\nIncorrecto.Intentalo de nuevo");
                if (contrasena.compareTo(adivinar) < 0) {
                    System.out.println("La contraseña que has introducido es mayor que la contraseña a adivinar\n");
                } else if (contrasena.compareTo(adivinar) == 0) {
                    System.out.println("La contraseña que has introducido tiene la misma logitud que la contraseña a adivinar\n");
                } else if (contrasena.compareTo(adivinar) > 0) {
                    System.out.println("La contraseña que has introducido es menor que la contraseña a adivinar\n");
                }
            }
            vidas--;

        } while (vidas != 0);

        if (vidas == 0) {
            System.out.println("Te has quedado vidas");
        } else {
            System.out.println("Enhorabuena!!");
        }
    }
}