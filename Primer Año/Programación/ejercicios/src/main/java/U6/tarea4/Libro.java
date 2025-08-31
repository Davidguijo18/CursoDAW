package U6.tarea4;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) throws ExcepcionTituloConNumero {
        if (autor.matches(".*\\d.*")) {
            throw new ExcepcionTituloConNumero("El autor no puede contener numeros");
        }
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return titulo + ": " + autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return titulo.equals(libro.titulo) && autor.equals(libro.autor);
    }

    @Override
    public int compareTo(Libro otroLibro) {
        return titulo.compareTo(otroLibro.titulo);
    }


}
