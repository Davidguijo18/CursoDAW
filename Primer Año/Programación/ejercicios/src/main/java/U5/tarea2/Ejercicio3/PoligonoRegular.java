package U5.tarea2.Ejercicio3;

public abstract class PoligonoRegular implements Figura {

    protected int lado;
    public Colores color;
    protected int contadorPoligonos;

    public PoligonoRegular() {
        lado = 10;
        color = Colores.AZUL;
    }

    public PoligonoRegular(int lado, Colores color) {
        this.lado = lado;
        this.color = color;
    }


    @Override
    public double getArea() {
        return 0;
    }

    public enum Colores {
        AZUL,
        ROJO,
        VERDE,
        AMARILLO
    }

    @Override
    public String toString() {
        return "PoligonoRegular{" +
                "lado=" + lado +
                ", color=" + color +
                '}';
    }
}
