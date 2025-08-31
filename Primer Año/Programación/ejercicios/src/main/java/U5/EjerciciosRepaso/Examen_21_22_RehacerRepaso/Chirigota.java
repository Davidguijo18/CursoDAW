package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

public class Chirigota extends AgrupacionOficial implements Callejera {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipoDisfraz;
    private int numCumples;
    private int puntosObtenidos;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, int numCumples, int puntosObtenidos) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetra = autorLetra;
        this.tipoDisfraz = tipoDisfraz;
        this.numCumples = numCumples;
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetra() {
        return autorLetra;
    }

    public void setAutorLetra(String autorLetra) {
        this.autorLetra = autorLetra;
    }

    public String getTipoDisfraz() {
        return tipoDisfraz;
    }

    public void setTipoDisfraz(String tipoDisfraz) {
        this.tipoDisfraz = tipoDisfraz;
    }

    public int getNumCumples() {
        return numCumples;
    }

    public void setNumCumples(int numCumples) {
        this.numCumples = numCumples;
    }

    @Override
    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La chirigota" + nombre + "va caminito del falla");
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la chirigota con nombre" + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La chirigota" + nombre + "va de " + tipoDisfraz);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la chirigota " + nombre);
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", numCumples=" + numCumples +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
