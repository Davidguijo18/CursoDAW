package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double base;
        double precioIva;
        double precioConIva;
        String iva;
        int ivaPorcentaje = 0;
        String codPromo;
        double descuento = 0;

        System.out.println("Introduzca la base imponible");
        base = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("Introduzca el tipo de iva (general,reducido, superreducido)");
        iva = teclado.nextLine();

        if (iva.equals("general")) {
            ivaPorcentaje = 21;
        }

        if (iva.equals("reducido")) {
            ivaPorcentaje = 10;
        }

        if (iva.equals("superreducido")) {
            ivaPorcentaje = 4;
        }

        precioIva = (base * ivaPorcentaje) / 100;
        precioConIva = base + precioIva;

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc)");
        codPromo = teclado.nextLine();

        if (codPromo.equals("nopro")) {
            descuento = precioConIva;
        }

        if (codPromo.equals("mitad")) {
            descuento = precioConIva / 2;
        }

        if (codPromo.equals("meno5")) {
            descuento = precioConIva - 5;
        }

        if (codPromo.equals("5porc")) {
            descuento = (precioConIva * 5) / 100;
        }

        double total = precioConIva - descuento;

        System.out.println(" ");
        System.out.println("BASE IMPONIBLE");
        System.out.println("Porcentaje de IVA (" + ivaPorcentaje + ")");
        System.out.println("Precio base --> " + base);
        System.out.println("Precio del  IVA --> " + precioIva);
        System.out.println("Precio base + IVA --> " + precioConIva);
        System.out.println("Codigo promocional (" + codPromo + "): " + descuento);
        System.out.println("TOTAL ------> " + total);
    }
}
