package U5.EjerciciosRepaso.Examen_21_22;

public class Romancero extends Agrupacion implements Callejera {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetras;
    private String tipoDisfraz;
    private String tematicaCartelon;


    public Romancero(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, String tematicaCartelon) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipoDisfraz = tipoDisfraz;
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el romancero " + nombre);
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero " + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El romancero" + nombre + "va de " + tipoDisfraz);
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", tematicaCartelon='" + tematicaCartelon + '\'' +
                '}';
    }
}
