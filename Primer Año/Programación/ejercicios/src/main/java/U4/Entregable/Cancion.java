package U4.Entregable;


public class Cancion {
    private String titulo;
    private int duracion;
    private Cantante cantante;
    private Genero genero;


    public enum Genero {
        TRAP, NEOPERREO, EMORAP
    }

    public Cancion() {
    }

    public Cancion(String titulo, int duracion, Cantante cantante, Genero genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.cantante = cantante;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Cantante getCantante() {
        return cantante;
    }

    public void setCantante(Cantante cantante) {
        this.cantante = cantante;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Duracion: " + duracion + " segundos");
        System.out.println("Genero: " + genero);
        System.out.println("Autor: " + cantante);
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", genero=" + genero +
                '}';
    }
}
