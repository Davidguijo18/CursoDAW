package U6.tarea1.Ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclado = new Scanner(System.in);
        final String rutaFicheros = "C:\\ficheros\\";

        System.out.println("Introduce el nombre del fichero: ");
        String nombreFichero = teclado.nextLine();
        String texto = "";

        try {
            FileReader in = new FileReader(rutaFicheros.concat(nombreFichero));
            int c = in.read();
            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);
    }
}
