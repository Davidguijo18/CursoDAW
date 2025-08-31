package U8.EjerciciosEntregable.Entregable1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecorridoDom recorridoDom = new RecorridoDom();
        Scanner teclado = new Scanner(System.in);
        //recorridoDom.numNodoHijos();
        //recorridoDom.mostrarXMLDom();

        System.out.print("Introduce el nombre de la etiqueta: ");
        String nombreEtiqueta = teclado.nextLine();

        recorridoDom.mostrarContenidoEtiquetaString(nombreEtiqueta);
    }
}
