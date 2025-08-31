package U5.EjerciciosRepaso.Examen_21_22;

public class Chirigota extends AgrupacionOficial implements Callejera {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetras;
    private String tipoDisfraz;
    private int numCuples;
    private int puntos;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, int numCuples, int puntos) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipoDisfraz = tipoDisfraz;
        this.numCuples = numCuples;
        this.puntos = puntos;
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la chirigota " + nombre);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La chirigota " + nombre + " va caminito del falla");
    }

    @Override
    public int getPuntos() {
        return puntos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la chirigota " + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La comparsa" + nombre + "va de " + tipoDisfraz);
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", numCuples=" + numCuples +
                ", puntos=" + puntos +
                '}';
    }
}