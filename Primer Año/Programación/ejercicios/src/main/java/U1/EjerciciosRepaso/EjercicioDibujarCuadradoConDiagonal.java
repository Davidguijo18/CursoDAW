package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioDibujarCuadradoConDiagonal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la altura del cuadrado");
            int altura = teclado.nextInt();
            
        //Hago la parte de arriba del cuadrado
        for(int i = 1; i <= altura; i++){
            System.out.print(" * ");
        }
        
        System.out.println();
        
        //Hago el cuerpo sin relleno
        for(int j = 1; j <= altura; j++){
            for(int k = 1; k <= altura; k++){
                if(k == altura || k == 1 || j == k){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            
            System.out.println();
        }
        
        //Hago la parte de abajo
        for(int a = 1; a <= altura; a++){
            System.out.print(" * ");
        }
    }
}