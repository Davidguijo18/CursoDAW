package U5.tarea1.Ejercicio9;

class Electrodomestico {

    public enum Color {
        ROJO, BLANCO, NEGRO, AZUL, GRIS
    }

    public enum ConsumoEnergetico {
        A, B, C, D, E, F
    }

    protected double precioBase;
    protected Color color;
    protected ConsumoEnergetico consumoEnergetico;
    protected double peso;

    private double precioFinal;

    public Electrodomestico() {
        color = Color.BLANCO;
        consumoEnergetico = ConsumoEnergetico.F;
        precioBase = 100;
        peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        color = Color.BLANCO;
        consumoEnergetico = ConsumoEnergetico.F;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioFinal() {
        precioFinal = precioBase;
        switch (consumoEnergetico) {
            case A -> precioFinal += 100;
            case B -> precioFinal += 80;
            case C -> precioFinal += 60;
            case D -> precioFinal += 50;
            case E -> precioFinal += 30;
            case F -> precioFinal += 10;
        }
        if (peso >= 0 && peso <= 29) {
            precioFinal += 10;
        } else if (peso >= 30 && peso <= 49) {
            precioFinal += 60;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 80;
        } else if (peso >= 80) {
            precioFinal += 100;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase: " + precioBase +
                ", color: " + color +
                ", consumoEnergetico: " + consumoEnergetico +
                ", peso: " + peso +
                ", precioFinal: " + precioFinal;
    }
}
