package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioDibujarU {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int altura;
        
        System.out.println("Introduce la altura de la letra U");
            altura = teclado.nextInt();
        
        for(int i = 1; i <= altura; i++){
            for(int j = 1; j <= altura; j++){
                if(j == 1 || j == altura || i == altura){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
