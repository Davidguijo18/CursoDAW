package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioTrianguloReves {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            
            for(int i = 1; i <= numero; i++){
                
                for(int j = 1; j <= numero - i; j++){
                    
                    System.out.print("*");
                }
                System.out.println(" ");
            }
    }
}
