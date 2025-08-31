package U5.tarea2.Ejercicio3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];

        figuras[0] = new Circulo(30);
        figuras[1] = new Cuadrado(25, PoligonoRegular.Colores.ROJO);
        figuras[2] = new Cuadrado(30, PoligonoRegular.Colores.AMARILLO);
        figuras[3] = new Triangulo(20, PoligonoRegular.Colores.AZUL, 40);
        figuras[4] = new Triangulo(10, PoligonoRegular.Colores.VERDE, 30);

        for (Figura figura : figuras) {
            System.out.print(figura);
            System.out.println();
        }

        System.out.println();

        Triangulo[] triangulos = new Triangulo[4];
        triangulos[0] = new Triangulo(25, PoligonoRegular.Colores.AZUL, 60);
        triangulos[1] = new Triangulo(5, PoligonoRegular.Colores.AMARILLO, 15);
        triangulos[2] = new Triangulo(10, PoligonoRegular.Colores.VERDE, 20);
        triangulos[3] = new Triangulo(17, PoligonoRegular.Colores.ROJO, 34);

        Arrays.sort(triangulos);
        for (Triangulo triangulo : triangulos) {
            System.out.print(triangulo);
            System.out.println();
        }

        System.out.println();

        //Preguntar a chema porque eso sale desordenado
        Arrays.sort(triangulos, new CompararColorTriangulo());
        for (Triangulo triangulo : triangulos) {
            System.out.print(triangulo);
            System.out.println();
        }
    }
}
