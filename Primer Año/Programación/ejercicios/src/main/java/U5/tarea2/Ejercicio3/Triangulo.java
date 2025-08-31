package U5.tarea2.Ejercicio3;

public class Triangulo extends PoligonoRegular implements Comparable<Triangulo> {
    private int altura;

    public Triangulo() {
        super();
        altura = 10;
    }

    public Triangulo(int lado, Colores color, int altura) {
        super(lado, color);
        contadorPoligonos++;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (double) (lado * altura) / 2;
    }

    @Override
    public int compareTo(Triangulo triangulo) {
        if (this.lado < triangulo.lado) {
            return -1;
        } else if (this.lado > triangulo.lado) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "altura=" + altura +
                '}';
    }
}
