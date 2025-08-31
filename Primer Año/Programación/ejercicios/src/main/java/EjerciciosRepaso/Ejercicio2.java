package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numReves = 0;
        int numBien = 0;
        int contador = 0;
        String ponerNumero = "";

        System.out.println("Introduce el numero");
            int num = teclado.nextInt();

        System.out.println("Introduce la posicion inicial");
            int posInicial = teclado.nextInt();

        System.out.println("Introduce la posicion final");
            int posFinal = teclado.nextInt();

            while (num > 0){
                numReves = num % 10 + numReves * 10;
                num /= 10;
            }

            while(numReves > 0){

                numBien = numReves % 10;

                if(contador < posInicial || contador > posFinal){
                    ponerNumero =  ponerNumero + numBien + "";
                }else{

                }

                contador++;
                numReves /= 10;
            }

        System.out.println("El numero final es: "+ponerNumero);
    }
}
