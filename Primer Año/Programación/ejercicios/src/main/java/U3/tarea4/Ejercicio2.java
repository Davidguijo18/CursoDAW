package U3.tarea4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el array para almacenar las 8 palabras
        String[] palabras = new String[8];

        // Pedir al usuario que ingrese 8 palabras
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese la palabra #" + (i + 1) + ": ");
            palabras[i] = scanner.next().toLowerCase(); // Convertir a minúsculas para hacer la comparación más flexible
        }

        // Array con los colores conocidos
        String[] coloresConocidos = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

        // Array auxiliar para almacenar todas las palabras con colores al principio
        String[] palabrasOrdenadas = new String[8];

        // Contadores para las posiciones en el array auxiliar
        int contadorColores = 0;
        int contadorNoColores = 0;

        // Agregar palabras con colores al principio del array
        for (String palabra : palabras) {
            if (esColorConocido(palabra, coloresConocidos)) {
                palabrasOrdenadas[contadorColores] = palabra;
                contadorColores++;
            } else {
                palabrasOrdenadas[7 - contadorNoColores] = palabra; // Agregar al final para que aparezcan después de los colores
                contadorNoColores++;
            }
        }

        // Imprimir todas las palabras con colores al principio
        System.out.println("\nPalabras con colores al principio:");
        imprimirArray(palabrasOrdenadas);
    }

    // Función para verificar si una palabra es un color conocido
    private static boolean esColorConocido(String palabra, String[] coloresConocidos) {
        for (String color : coloresConocidos) {
            if (palabra.equals(color)) {
                return true;
            }
        }
        return false;
    }

    // Función para imprimir un array
    private static void imprimirArray(String[] array) {
        for (String palabra : array) {
            System.out.print(palabra + " ");
        }
        System.out.println();
    }
}
