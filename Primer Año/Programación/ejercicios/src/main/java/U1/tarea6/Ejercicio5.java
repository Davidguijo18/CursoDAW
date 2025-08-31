package U1.tarea6;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float radio;

        System.out.println("-----MENU PRINCIPAL-----");
        System.out.println("1-Calcular diametro");
        System.out.println("2-Calcular  perimetro");
        System.out.println("3-Calcular area");
        System.out.println(" ");

        System.out.println("Introduzca una opcion");
        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Introduzca el radio de la circunferencia");
                radio = teclado.nextFloat();
                float diametro = 2 * radio;
                System.out.println("El diametro de la circunferencia es : " + diametro);
                break;

            case 2:
                System.out.println("Introduzca el radio de la circunferencia");
                radio = teclado.nextFloat();
                float perimetro = 2 * 3.1415926F * radio;
                System.out.println("El perimetro de la circuenferencia es : " + perimetro);
                break;

            case 3:
                System.out.println("Introduzca el area de la circunferencia");
                radio = teclado.nextFloat();
                float area = 3.1415926F * radio * radio;
                System.out.println("El area de la circunferencia es : " + area);
                break;

            default:
                System.out.println("La opcion introducida no es valida");
                break;
        }
    }
}
