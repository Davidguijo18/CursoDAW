package U4.tarea1.Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mensajeFinal;

        System.out.print("Introduce el limite maximo de palabras: ");
        long limitePalabras = teclado.nextLong();

        teclado.nextLine();

        System.out.print("\nIntroduce el mensaje que quieras: ");
        String mensaje = teclado.nextLine();

        Texto texto = new Texto(limitePalabras, mensaje);

        System.out.print("\nIntroduce el caracter que quieres poner delante de la cadena: ");
        char caracterDelante = teclado.next().charAt(0);
        mensajeFinal = texto.anadirCaracterPrincipio(caracterDelante);

        System.out.println(mensajeFinal);

        System.out.print("\nIntroduce el caracter que quieres poner detras de la cadena: ");
        char caracterDetras = teclado.next().charAt(0);
        mensajeFinal = texto.anadirCaracterFinal(caracterDetras);

        System.out.println(mensajeFinal);
        teclado.nextLine();

        System.out.print("\nIntroduce el mensaje que quieres poner delante de la cadena: ");
        String cadenaPrincipio = teclado.nextLine();
        mensajeFinal = texto.anadirCadenaPrincipio(cadenaPrincipio);

        System.out.println(mensajeFinal);

        System.out.print("\nIntroduce el mensaje que quieres poner detras de la cadena: ");
        String cadenaDetras = teclado.nextLine();
        mensajeFinal = texto.anadirCadenaFinal(cadenaDetras);

        System.out.println(mensajeFinal);

        System.out.println();
        texto.contarMayusculasMinusculas(mensaje);
    }
}
