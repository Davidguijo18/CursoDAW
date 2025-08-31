package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;
        int anchura;
        float tamano;
        float precio;
        String bordado;
        String contieneEscudo = " ";
        float precioBordado = 0;
        float gastosEnvio = 3.25F;
        float total;

        System.out.println("Introduzca la altura (en cm) de su bandera");
        altura = teclado.nextInt();

        System.out.println("Introduzca la anchura (en cm) de su bandera");
        anchura = teclado.nextInt();
        teclado.nextLine();

        System.out.println("¿Quiere un escudo bordado? (si/no)");
        bordado = teclado.nextLine();

        System.out.println(" ");

        if (bordado.equals("si")) {
            contieneEscudo = "Con";
            precioBordado = 2.5F;
        }

        if (bordado.equals("no")) {
            contieneEscudo = "Sin";
            precioBordado = 0;
        }

        tamano = altura * anchura;
        precio = tamano * 0.01F;
        total = precio + precioBordado + gastosEnvio;

        System.out.println("TICKET DE COMPRA");
        System.out.println("Bandera de " + tamano + " cm2: " + precio + " €");
        System.out.println(contieneEscudo + " escudo: " + precioBordado + " €");
        System.out.println("Gastos de envio " + gastosEnvio + " €");
        System.out.println("TOTAL: " + total + " €");
    }
}
