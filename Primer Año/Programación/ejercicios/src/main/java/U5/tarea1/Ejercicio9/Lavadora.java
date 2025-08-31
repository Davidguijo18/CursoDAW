package U5.tarea1.Ejercicio9;

import java.util.Objects;

public class Lavadora extends Electrodomestico implements Comparable {

    private int carga;
    private double precioFinal = getPrecioBase();

    public Lavadora(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        carga = 5;
    }

    public Lavadora(double precio, double peso) {
        super(precio, peso);
        carga = 5;
    }

    public Lavadora(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double getPrecioFinal() {
        precioFinal = super.getPrecioFinal();
        if (carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "carga: " + carga +
                "precioFinal: " + precioFinal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lavadora lavadora = (Lavadora) o;
        return precioFinal == lavadora.precioFinal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precioFinal);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o || o == null) return 0;
        Lavadora l = (Lavadora) o;
        if (carga > l.getCarga()) {
            return 1;
        } else if (carga < l.getCarga()) {
            return -1;
        }
        return 0;
    }
}
