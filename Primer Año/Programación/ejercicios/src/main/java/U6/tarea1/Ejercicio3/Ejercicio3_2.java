package U6.tarea1.Ejercicio3;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        final String rutaFicheros = "C:\\ficheros\\";
        String texto = "";

        System.out.print("Introduce el nombre del fichero que quieres copiar: ");
        String fichero = teclado.nextLine();

        try {
            FileReader in = new FileReader(rutaFicheros.concat(fichero));
            int c = in.read();
            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            FileWriter out = new FileWriter(rutaFicheros.concat("copia de " + fichero));
            out.write(texto);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
