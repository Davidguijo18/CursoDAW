package U6.EjerciciosRepaso.Tarea4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RegistroLibros {
    private Libro[] array;
    private static int contadorLibrosCreados = 0;

    public RegistroLibros(int numMaximoLibros) {
        array = new Libro[numMaximoLibros];
    }


    public boolean anadirLibro(Libro libro) {
        if (contadorLibrosCreados < array.length) {
            array[contadorLibrosCreados] = libro;
            contadorLibrosCreados++;
            return true;
        }
        return false;
    }

    public boolean buscarLibro(String titulo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    public void cargarRegistroDeFichero(String nombreFichero) {
        String rutaInicial = "C:\\ficheros\\";
        try (BufferedReader br = new BufferedReader(new FileReader(rutaInicial + nombreFichero))) {
            String linea;
            while (((linea = br.readLine()) != null && contadorLibrosCreados < array.length)) {
                String[] partes = linea.split(":");
                if (partes.length == 2) {
                    String titulo = partes[0].trim();
                    String autor = partes[1].trim();
                    Libro libro = new Libro(titulo, autor);
                    anadirLibro(libro);
                }
            }
        } catch (IOException | ExcepcionStringConNumero e) {
            System.out.println(e.getMessage());
        }
    }
}
