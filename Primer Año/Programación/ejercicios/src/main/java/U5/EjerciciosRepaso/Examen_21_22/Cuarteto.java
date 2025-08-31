package U5.EjerciciosRepaso.Examen_21_22;

public class Cuarteto extends AgrupacionOficial implements Callejera {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetras;
    private String tipoDisfraz;
    private int numMiembros;
    private int puntos;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, int numMiembros, int puntos) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipoDisfraz = tipoDisfraz;
        this.numMiembros = numMiembros;
        this.puntos = puntos;
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el cuarteto " + nombre);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El cuarteto " + nombre + " va caminito del falla");
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
    public String toString() {
        return "Cuarteto{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", numMiembros=" + numMiembros +
                ", puntos=" + puntos +
                '}';
    }
}

