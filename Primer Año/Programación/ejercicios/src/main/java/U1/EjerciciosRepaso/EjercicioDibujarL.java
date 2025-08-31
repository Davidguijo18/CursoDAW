package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioDibujarL {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int altura;
        int longitudHorizontal;
        
        System.out.println("Introduce la altura de la letra L");
        altura = teclado.nextInt();
        
        longitudHorizontal = altura / 2 + 1;
        
        for(int i = 1; i <= altura; i++){
            if( i == altura){
                for(int j = 1; j <= longitudHorizontal; j++){
                    System.out.print("*");
                }
            }else{
                System.out.println("*");
            }
        }
    }
    
}
