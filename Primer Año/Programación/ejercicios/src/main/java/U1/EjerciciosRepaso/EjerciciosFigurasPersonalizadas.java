package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjerciciosFigurasPersonalizadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double abs = 0.2;
        double pla = 0.3;
        double madera = 0.5;
        double materialFlexible = 0.7;
        double precio = 0;

        System.out.print("Introduzca el peso de su figura en gramos: ");
        double peso = teclado.nextDouble();

        System.out.print("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
        int material = teclado.nextInt();
        switch (material) {
            case 1:
                precio = peso * abs;
                break;

            case 2:
                precio = peso * pla;
                break;

            case 3:
                precio = peso * madera;
                break;

            case 4:
                precio = peso * materialFlexible;
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }

        System.out.print("¿Quiere posprocesado?(1 = si / 2 = no): ");
        int postProcesado = teclado.nextInt();
        if (postProcesado == 1) {
            precio = precio + 3;
        }

        System.out.print("¿Pertenece a Enjuto3D Premium? (1=si, 2=no): ");
        int programa = teclado.nextInt();
        if (programa == 2) {
            precio = precio + 2;
        }

        System.out.println("\nEl coste total es de: " + precio + " €");
    }
}
