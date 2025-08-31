package U8.EjerciciosParaRepasar.tarea3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre del fichero: ");
        String nombreFichero = teclado.nextLine();

        ArbolDomPersonas arbolDomPersonas = new ArbolDomPersonas(nombreFichero);
        arbolDomPersonas.mostrarContenido();

        arbolDomPersonas.modificacionDePersona("Pepe");

        arbolDomPersonas.guardarDocumento(nombreFichero);
    }
}
