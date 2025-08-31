package U6.tarea4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class RegistroLibros {
    private Libro[] tabla;
    private int numLibrosRegistrados;

    public RegistroLibros(int tamanoMaximo) {
        tabla = new Libro[tamanoMaximo];
        numLibrosRegistrados = 0;
    }

    public boolean addLibro(String titulo, String autor) {
        if (numLibrosRegistrados < tabla.length) {
            try {
                Libro nuevoLibro = new Libro(titulo, autor);
                tabla[numLibrosRegistrados++] = nuevoLibro;
                return true;
            } catch (ExcepcionTituloConNumero e) {
                System.out.println("Error al anadir el libro: " + e.getMessage());
                return false;
            }
        } else {
            System.out.println("La tabla de libros esta llena, no se puede anadir mas.");
            return false;
        }
    }

    public boolean buscaLibro(String titulo) {
        for (Libro libro : tabla) {
            if (libro != null && libro.getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    public void cargarRegistroDesdeFichero(String nombreFichero) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null && numLibrosRegistrados < tabla.length) {
                String[] partes = linea.split(":");
                if (partes.length == 2) {
                    String titulo = partes[0].trim();
                    String autor = partes[1].trim();
                    addLibro(titulo, autor);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public void cargarRegistroDesdeFichero() {
        cargarRegistroDesdeFichero("registro.txt");
    }

    public void cargarRegistroAfichero(String nombreFichero) {
        try (FileWriter fw = new FileWriter(nombreFichero)) {
            for (Libro libro : tabla) {
                if (libro != null) {
                    fw.write(libro.toString() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    public void cargarRegistroAfichero() {
        cargarRegistroAfichero("registro.txt");
    }
}