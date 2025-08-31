package U5.tarea2.Ejercicio3;

public class Circulo implements Figura {

    private int radio;

    public Circulo() {
        radio = 10;
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 3.14 * (radio * radio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
