package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

public class Romancero extends Agrupacion implements Callejera {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipoDisfraz;
    private String tematicaCartelon;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, String tematicaCartelon) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetra = autorLetra;
        this.tipoDisfraz = tipoDisfraz;
        this.tematicaCartelon = tematicaCartelon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public String getTematicaCartelon() {
        return tematicaCartelon;
    }

    public void setTematicaCartelon(String tematicaCartelon) {
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del romancero con nombre" + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El romancero" + nombre + "va de " + tipoDisfraz);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el romancero " + nombre);
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", tematicaCartelon='" + tematicaCartelon + '\'' +
                '}';
    }
}
