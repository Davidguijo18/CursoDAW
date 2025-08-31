package U5.EjerciciosRepaso.Examen_21_22;

public class Coro extends AgrupacionOficial {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetras;
    private String tipoDisfraz;
    private int numBandurrias;
    private int numGuitarras;
    private int puntos;

    public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, int numBandurrias, int numGuitarras, int puntos) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipoDisfraz = tipoDisfraz;
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
        this.puntos = puntos;
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El coro " + nombre + " va caminito del falla");
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
        System.out.println("Cantando la presentación del coro " + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El coro" + nombre + "va de " + tipoDisfraz);
    }

    @Override
    public String toString() {
        return "Coro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", numBandurrias=" + numBandurrias +
                ", numGuitarras=" + numGuitarras +
                ", puntos=" + puntos +
                '}';
    }
}