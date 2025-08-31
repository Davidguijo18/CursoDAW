package U7.tarea6;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] piezas = {"Dama", "Torre", "Alfil", "Caballo", "Peón"};
        int[] valores = {9, 5, 3, 2, 1};
        int[] maxPiezas = {1, 2, 2, 2, 8};
        int[] capturas = new int[5];
        Random rand = new Random();
        int totalCapturas = rand.nextInt(16);
        int totalPuntos = 0;

        for (int i = 0; i < totalCapturas; i++) {
            int piezaIndex;
            do {
                piezaIndex = rand.nextInt(piezas.length);
            } while (capturas[piezaIndex] >= maxPiezas[piezaIndex]);

            capturas[piezaIndex]++;
            totalPuntos += valores[piezaIndex];
        }

        System.out.println("Fichas capturadas por el jugador:");
        for (int i = 0; i < capturas.length; i++) {
            for (int j = 0; j < capturas[i]; j++) {
                System.out.println(piezas[i] + " (" + valores[i] + " peones)");
            }
        }
        System.out.println("Puntos totales: " + totalPuntos + " peones.");
    }
}
