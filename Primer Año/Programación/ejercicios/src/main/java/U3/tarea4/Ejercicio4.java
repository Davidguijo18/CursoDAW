package U3.tarea4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la posicion del alfil: ");
        String posicionAlfil = teclado.nextLine();

        String[] movimientos = obtenerMovimientosAlfil(posicionAlfil);

        System.out.println("El alfil puede moverse a las siguientes posiciones:");
        for (String movimiento : movimientos) {
            System.out.print(movimiento + " ");
        }
    }

    public static String[] obtenerMovimientosAlfil(String posicion) {
        String[] movimientos = new String[27]; // 27 es el número máximo de movimientos posibles

        char columna = posicion.charAt(0);
        int fila = Character.getNumericValue(posicion.charAt(1));

        int indice = 0;

        // Movimientos en diagonal superior izquierda
        for (int i = 1; columna - i >= 'a' && fila + i <= 8; i++) {
            movimientos[indice++] = "" + (char) (columna - i) + (fila + i);
        }

        // Movimientos en diagonal superior derecha
        for (int i = 1; columna + i <= 'h' && fila + i <= 8; i++) {
            movimientos[indice++] = "" + (char) (columna + i) + (fila + i);
        }

        // Movimientos en diagonal inferior izquierda
        for (int i = 1; columna - i >= 'a' && fila - i >= 1; i++) {
            movimientos[indice++] = "" + (char) (columna - i) + (fila - i);
        }

        // Movimientos en diagonal inferior derecha
        for (int i = 1; columna + i <= 'h' && fila - i >= 1; i++) {
            movimientos[indice++] = "" + (char) (columna + i) + (fila - i);
        }

        // Ajustar el tamaño del array al número real de movimientos
        String[] resultado = new String[indice];
        System.arraycopy(movimientos, 0, resultado, 0, indice);

        return resultado;
    }
}