package U5.tarea2.Ejercicio3;


public class Cuadrado extends PoligonoRegular {

    public Cuadrado() {
        super();
    }

    public Cuadrado(int lado, Colores color) {
        super(lado, color);
        contadorPoligonos++;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
