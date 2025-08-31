package U1.EjerciciosRepaso;
import java.util.Scanner;

public class RepasoCodigoMorse {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int reves = 0;
        int binario = 0;
        
        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

        while (numero > 0) {
            reves = numero % 10 + reves * 10;
            numero /= 10;
        }
        
        while (reves > 0){   
            binario = reves % 10;
            reves /=10;        

            for (int i = 1; i <= binario; i++) {
                System.out.print("*");
            } 

            System.out.print("-");
        }
    }
}
