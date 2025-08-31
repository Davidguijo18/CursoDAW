package U5.tarea2.Ejercicio3;

import java.util.Comparator;

public class CompararColorTriangulo implements Comparator<Triangulo> {
    @Override
    public int compare(Triangulo triangulo1, Triangulo triangulo2) {
        return triangulo1.color.compareTo(triangulo2.color);
    }
}
