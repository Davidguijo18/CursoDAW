package U1.ExamenesEstudio.Examen3_TardeA;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
            int numero = teclado.nextInt();
            
            String cadena = String.valueOf(numero);
            
            for(int i = 1; i <= numero; i++){
                for(int j = 1; j<= numero - i; j++){
                    System.out.print(" ");
                }
                
                for(int k = 1; k <= i; k++){
                    System.out.print(k);  
                }
                
                for(int t = i - 1; t >= 1 ;t--){
                    System.out.print(t);
                }
              
                System.out.println("");
            }
    }
}
