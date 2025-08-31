package U1.tarea5;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float gravedad = 9.8F;
        float tiempo;
        float velocidad;

        System.out.println("Introduce el tiempo");
            tiempo = teclado.nextFloat();

            if(tiempo <= 0){
                System.out.println("Tiempo incorrecto");
            }else{
                velocidad = gravedad * tiempo;

                System.out.println("La velocidad es "+velocidad);
            }
    }
}
