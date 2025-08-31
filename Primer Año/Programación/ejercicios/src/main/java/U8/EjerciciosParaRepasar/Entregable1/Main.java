package U8.EjerciciosParaRepasar.Entregable1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        RecorridoDOM recorridoDOM = new RecorridoDOM();

        recorridoDOM.numNodoHijos();
        recorridoDOM.mostrarXMLDom();

        System.out.print("\nIntroduce el nombre de la etiqueta que deseas buscar: ");
        String nombreEtiqueta = teclado.nextLine();
        recorridoDOM.mostrarContenidoEtiquetaString(nombreEtiqueta);
    }
}
