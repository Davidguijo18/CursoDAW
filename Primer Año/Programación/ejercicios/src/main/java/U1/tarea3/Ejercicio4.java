package U1.tarea3;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float millas;
        float kilometros;
        float equivalenciaKilometros = 1.609F;

        System.out.println("Introduzca el numero de millas");
        millas = teclado.nextFloat();

        kilometros = millas * equivalenciaKilometros;

        System.out.println(millas+" millas equivalen a "+kilometros+" kilometros");
    }
}
