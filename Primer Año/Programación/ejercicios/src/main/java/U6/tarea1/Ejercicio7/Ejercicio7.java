package U6.tarea1.Ejercicio7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int LINEAS_POR_PAGINA = 24;
        final String RUTA_FICHERO = "C:\\ficheros\\";
        int numeroLineas = 0;
        int paginaActual = 1;

        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivo = teclado.nextLine();

        try {
            BufferedReader in = new BufferedReader(new FileReader(RUTA_FICHERO + nombreArchivo));
            String linea;

            while ((linea = in.readLine()) != null) {
                System.out.println(linea);
                numeroLineas++;

                if (numeroLineas % LINEAS_POR_PAGINA == 0) {
                    System.out.print("\n--- Página " + paginaActual);
                    teclado.nextLine();
                    paginaActual++;
                }
            }
            in.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
