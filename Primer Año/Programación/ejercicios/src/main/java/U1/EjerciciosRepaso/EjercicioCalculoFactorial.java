package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioCalculoFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero = 0;
        int factorial = 1;
        
        System.out.println("Introduce un numero para calcular su factorial");
            numero = teclado.nextInt();
            
            for(int i = 1; i <= numero; i++){
                factorial = factorial * i;
                
                System.out.print(factorial+" ");
            }
            
            System.out.println("El factorial del numero es: "+factorial);
    }
}
