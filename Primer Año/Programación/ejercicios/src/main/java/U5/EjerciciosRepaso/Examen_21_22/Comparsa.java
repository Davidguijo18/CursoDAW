package U5.EjerciciosRepaso.Examen_21_22;

public class Comparsa extends AgrupacionOficial {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetras;
    private String tipoDisfraz;
    private String empresaAtrezzo;
    private int puntos;


    public Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, String empresaAtrezzo, int puntos) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipoDisfraz = tipoDisfraz;
        this.empresaAtrezzo = empresaAtrezzo;
        this.puntos = puntos;
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La comparsa " + nombre + " va caminito del falla");
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
        System.out.println("Cantando la presentación de la comparsa " + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La comparsa" + nombre + "va de " + tipoDisfraz);
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", empresaAtrezzo='" + empresaAtrezzo + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}