package U1.ExamenesEstudio.Examen2_Tarde;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        int contadorEspacios = 0;
        int contadorHaches = 0;
        int contadorVocalesAbiertas = 0;

        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == ' ') {
                contadorEspacios++;
            } else if (caracter == 'h') {
                contadorHaches++;
            } else if (caracter == 'a' || caracter == 'e' || caracter == 'o') {
                contadorVocalesAbiertas++;
            }
        }

        System.out.println("La cantidad de espacios, haches y vocales abiertas es " + (contadorEspacios + contadorHaches + contadorVocalesAbiertas));
    }
}
