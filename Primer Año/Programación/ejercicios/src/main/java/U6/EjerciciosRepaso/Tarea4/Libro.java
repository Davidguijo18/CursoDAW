package U6.EjerciciosRepaso.Tarea4;

import java.util.Objects;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) throws ExcepcionStringConNumero {
        this.titulo = titulo;
        this.autor = autor;

        for (int i = 0; i < titulo.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                if (titulo.charAt(i) == j) {
                    throw new ExcepcionStringConNumero("El titulo contiene un numero");
                }
            }
        }
        for (int i = 0; i < autor.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                if (autor.charAt(i) == j) {
                    throw new ExcepcionStringConNumero("El autor contiene un numero");
                }
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro --> " + titulo + ":" + autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }


    /*public void excepcionString(String texto) throws ExcepcionStringConNumero {
        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                if (texto.charAt(i) == j) {
                    throw new ExcepcionStringConNumero("Este string contiene un numero");
                }
            }
        }
    }*/

    @Override
    public int compareTo(Libro libro) {
        return this.titulo.compareTo(libro.titulo);
    }
}
