package U5.U4U5_Examen;

public class Pelicula extends Multimedia implements Reproducible {

    private String director;
    private int duracion;
    private String productora;
    private String pais;

    public Pelicula(String titulo, String director, int anoEstreno, int duracion, String productora, String pais) {
        super(titulo, anoEstreno);
        this.director = director;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public void dado_por_finalizado() {
        System.out.println(titulo + " ha finalizado");
    }

    //Estos metodos (play(),pause(),stop() han sido implementados a traves de la interfaz Reproducible)
    @Override
    public void play() {
        System.out.println("Reproduciendo película " + titulo);
    }

    @Override
    public void pause() {
        System.out.println("Pausando película " + titulo);
    }

    @Override
    public void stop() {
        System.out.println("Parando película " + titulo);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", anoEstreno=" + anoPublicacionEstreno +
                ", duracion=" + duracion +
                ", productora='" + productora + '\'' +
                ", pais='" + pais + '\'' +
                ", id ='" + id + '\'' +
                '}';
    }
}
