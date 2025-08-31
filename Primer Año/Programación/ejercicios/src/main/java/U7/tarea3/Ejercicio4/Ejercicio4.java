package U7.tarea3.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero: ");
        String fichero = teclado.nextLine();

        Traductor traductor = new Traductor(fichero);
        System.out.print("\nIntroduce una palabra: ");
        String palabra = teclado.nextLine();
        traductor.traduccionPalabra(palabra);
    }
}
