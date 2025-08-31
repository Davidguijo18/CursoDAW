package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioDibujarCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la altura del cuadrado");
            int altura = teclado.nextInt();
            
            for(int i = 1; i <= altura; i++){
                
                for(int j = 1; j <= altura; j++){
                    System.out.print(" * ");
                }
                
                System.out.println(" ");
            }
    }
}
