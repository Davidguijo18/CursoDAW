package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

public class Cuarteto extends AgrupacionOficial implements Callejera {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipoDisfraz;
    private int numMiembros;
    private int puntosObtenidos;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, int numMiembros, int puntosObtenidos) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetra = autorLetra;
        this.tipoDisfraz = tipoDisfraz;
        this.numMiembros = numMiembros;
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

    public int getNumMiembros() {
        return numMiembros;
    }

    public void setNumMiembros(int numMiembros) {
        this.numMiembros = numMiembros;
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
        System.out.println("El cuarteto" + nombre + "va caminito del falla");
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del cuarteto con nombre" + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El cuarteto" + nombre + "va de " + tipoDisfraz);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el cuarteto " + nombre);
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", numMiembros=" + numMiembros +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
