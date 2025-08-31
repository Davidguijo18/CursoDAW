package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioDibujarRombo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la altura del rombo");
            int altura = teclado.nextInt();
        
        for(int i = 0; i <= altura; i++){
            
            for(int j = 1; j <= altura - i; j++){
                System.out.print(" ");
            }
            
            for(int k = 1; k <= i * 2 - 1; k++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
