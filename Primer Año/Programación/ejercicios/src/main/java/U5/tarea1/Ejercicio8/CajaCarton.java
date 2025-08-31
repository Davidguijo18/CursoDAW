package U5.tarea1.Ejercicio8;

public class CajaCarton extends Caja {

    public CajaCarton(double ancho, double alto, double fondo, Etiqueta etiqueta) {
        super(ancho, alto, fondo, etiqueta);
    }

    @Override
    public double getVolumen() {
        double volumenReal = super.getVolumen();

        double volumenCarton = volumenReal * 0.8;

        return volumenCarton;
    }

    public double getSuperficie() {
        double superficie = 2 * (getAncho() * getAlto() + getAncho() * getFondo() + getAlto() * getFondo());
        return superficie;
    }

    @Override
    public String toString() {
        return "CajaCarton{" +
                "ancho=" + getAncho() +
                ", alto=" + getAlto() +
                ", fondo=" + getFondo() +
                ", etiqueta=" + getEtiqueta() +
                '}';
    }
}
