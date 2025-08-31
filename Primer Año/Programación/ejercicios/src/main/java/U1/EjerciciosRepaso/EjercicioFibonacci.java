package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioFibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = 0;
        int b = 1;
        int numero;
        
        System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            
            System.out.print("Fibonacci: "+a);
            
            for(int i = 1; i <= numero; i++){
                System.out.print(", "+b);
                
                int resultado = a + b;
                a = b;
                b = resultado;
            }
    }
}
