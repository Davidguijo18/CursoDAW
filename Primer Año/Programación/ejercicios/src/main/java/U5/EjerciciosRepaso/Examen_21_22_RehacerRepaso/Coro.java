package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

public class Coro extends AgrupacionOficial {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipoDisfraz;
    private int numBandurrias;
    private int numGuitarras;
    private int puntosObtenidos;

    public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, int numBandurrias, int numGuitarras, int puntosObtenidos) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetra = autorLetra;
        this.tipoDisfraz = tipoDisfraz;
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
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

    public int getNumBandurrias() {
        return numBandurrias;
    }

    public void setNumBandurrias(int numBandurrias) {
        this.numBandurrias = numBandurrias;
    }

    public int getNumGuitarras() {
        return numGuitarras;
    }

    public void setNumGuitarras(int numGuitarras) {
        this.numGuitarras = numGuitarras;
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
        System.out.println("El coro" + nombre + "va caminito del falla");
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del coro con nombre" + nombre);
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
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", numBandurrias=" + numBandurrias +
                ", numGuitarras=" + numGuitarras +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
