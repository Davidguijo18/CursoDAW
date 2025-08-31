package U3.EjerciciosRepaso.EjerciciosInternet;

import java.util.Scanner;

public class EjercicioCalcularLetraDNI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los numeros de su DNI: ");
        int dni = teclado.nextInt();

        String dniCompleto = completarDni(dni);
        System.out.println("El dni completo es: " + dniCompleto);

    }

    public static String completarDni(int dni) {
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int calcularLetra = dni % 23;
        String dniCompleto;

        dniCompleto = dni + letras[calcularLetra];

        return dniCompleto;
    }
}
