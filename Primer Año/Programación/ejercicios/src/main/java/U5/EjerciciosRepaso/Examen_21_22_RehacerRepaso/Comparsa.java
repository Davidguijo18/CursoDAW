package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

public class Comparsa extends AgrupacionOficial {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipoDisfraz;
    private String empresaAtrezzo;
    private int puntosObtenidos;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, String empresaAtrezzo, int puntosObtenidos) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetra = autorLetra;
        this.tipoDisfraz = tipoDisfraz;
        this.empresaAtrezzo = empresaAtrezzo;
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

    public String getEmpresaAtrezzo() {
        return empresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        this.empresaAtrezzo = empresaAtrezzo;
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
        System.out.println("La comparsa" + nombre + "va caminito del falla");
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la comparsa con nombre" + nombre);
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
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", empresaAtrezzo='" + empresaAtrezzo + '\'' +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
