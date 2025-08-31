package U5.tarea1.Ejercicio9;

public class Television extends Electrodomestico {
    private boolean sintonizadorTV;
    private double resolucion;
    private double precioFinal;

    public Television() {
        resolucion = 20;
        sintonizadorTV = false;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, Electrodomestico.Color color, Electrodomestico.ConsumoEnergetico consumoEnergetico, double peso, boolean sintonizadorTV, double resolucion) {
        super(precioBase, color, consumoEnergetico, peso);
        this.sintonizadorTV = sintonizadorTV;
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTV() {
        return sintonizadorTV;
    }

    public double getResolucion() {
        return resolucion;
    }

    @Override
    public double getPrecioFinal() {
        if (resolucion > 40) {
            precioFinal = getPrecioFinal() + ((getPrecioFinal() * 30) / 100);
        }

        if (sintonizadorTV) {
            precioFinal = precioFinal + 50;
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sintonizadorTV=" + sintonizadorTV +
                ", resolucion=" + resolucion +
                ", precioFinal=" + precioFinal +
                '}';
    }
}

