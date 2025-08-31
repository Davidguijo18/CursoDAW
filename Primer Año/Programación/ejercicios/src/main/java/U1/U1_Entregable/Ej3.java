package U1.U1_Entregable;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double precio_base = 8;
        int numEntradas = 0;
        double descuento = 0;
        double precioFinal = 0;

        System.out.println("Bienvenido a la venta de entradas");

        System.out.print("Introduzca el numero de entradas: ");
        numEntradas = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Introduzca el dia de la semana: ");
        String dia = teclado.nextLine();


        System.out.print("Dispone de tarjeta CineCampa (si/no)?: ");
        String respuesta = teclado.nextLine();

        if (dia.equalsIgnoreCase("miercoles")) {
            precio_base = 5 * numEntradas;
        } else if (dia.equalsIgnoreCase("jueves")) {
            if (numEntradas % 2 == 0) {
                precio_base = 11 * (numEntradas / 2);
            } else {
                precio_base = (11 * (numEntradas / 2)) + 8;
            }

        } else {
            precio_base = 8 * numEntradas;
        }
        if (respuesta.equalsIgnoreCase("si")) {
            descuento = precio_base / 10;
            precioFinal = precio_base - descuento;

        } else if (respuesta.equalsIgnoreCase("no")) {
            descuento = 0;
            precioFinal = precio_base;
        }

        System.out.println();
        System.out.println();
        System.out.println("Aqui tiene sus entradas, gracias por su compra");

        if (dia.equalsIgnoreCase("miercoles")) {
            System.out.println("Entradas individales: " + numEntradas);
            System.out.println("Precio a pagar por cada entrada: 5€");
            System.out.println("Total: " + precio_base + " €");
            System.out.println("Descuento: " + descuento + " €");
            System.out.println("A pagar: " + precioFinal + " €");
        } else if (dia.equalsIgnoreCase("jueves")) {
            System.out.println("Entradas de pareja: " + numEntradas / 2);
            System.out.println("Precio a pagar por entrada: 11€");
            System.out.println("Total: " + precio_base + " €");
            System.out.println("Descuento: " + descuento + " €");
            System.out.println("A pagar: " + precioFinal + " €");
        } else {
            System.out.println("Entradas individuales: " + numEntradas);
            System.out.println("Precio a pagar por entrada: 8€");
            System.out.println("Total: " + precio_base + " €");
            System.out.println("Descuento: " + descuento + " €");
            System.out.println("A pagar: " + precioFinal + " €");
        }
    }
}
