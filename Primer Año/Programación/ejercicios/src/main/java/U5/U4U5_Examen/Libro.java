package U5.U4U5_Examen;

public class Libro extends Multimedia {
    private String autor;
    private String editorial;
    private String identificadorISBN;
    private int numPaginas;

    public Libro(String titulo, String autor, int anoPublicacion, String editorial, String identificadorISBN, int numPaginas) {
        super(titulo, anoPublicacion);
        this.autor = autor;
        this.editorial = editorial;
        this.identificadorISBN = identificadorISBN;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdentificadorISBN() {
        return identificadorISBN;
    }

    public void setIdentificadorISBN(String identificadorISBN) {
        this.identificadorISBN = identificadorISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void dado_por_finalizado() {
        System.out.println(titulo + " ha finalizado");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacion=" + anoPublicacionEstreno +
                ", editorial='" + editorial + '\'' +
                ", identificadorISBN='" + identificadorISBN + '\'' +
                ", numPaginas=" + numPaginas +
                ", id ='" + id + '\'' +
                '}';
    }
}
