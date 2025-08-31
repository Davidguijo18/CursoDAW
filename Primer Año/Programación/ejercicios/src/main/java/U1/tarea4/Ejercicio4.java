package U1.tarea4;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float numero;
        int numeroRedondear;

        System.out.println("Introduce un numero decimal para redondearlo");
            numero = teclado.nextFloat();

            numeroRedondear = (int)(numero);

            if(numeroRedondear < numero && numero <= numeroRedondear + 0.5){
                System.out.println("El numero redondeado es "+numeroRedondear);
            }

            if(numeroRedondear + 0.5 < numero && numero <numeroRedondear + 1){
                numeroRedondear = numeroRedondear + 1;
                System.out.println("El numero redondeado es "+numeroRedondear);

            }

    }
}
