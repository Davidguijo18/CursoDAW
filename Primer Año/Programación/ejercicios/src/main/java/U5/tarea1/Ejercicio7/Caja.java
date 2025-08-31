package U5.tarea1.Ejercicio7;

public class Caja {

    private final double ancho;
    private final double alto;
    private final double fondo;
    private final Etiqueta etiqueta;


    public Caja(double ancho, double alto, double fondo, Etiqueta etiqueta) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.etiqueta = etiqueta;
    }

    public double getVolumen() {
        return ancho * alto * fondo;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", etiqueta=" + etiqueta +
                '}';
    }
}

