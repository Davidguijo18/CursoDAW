package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioDibujarX {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int altura;
        
            
        do{
            
        System.out.println("Introduce la altura de la letra X");
            altura = teclado.nextInt(); 
            
            if(altura >= 3 && altura % 2 == 1){
                
                for(int i = 0; i < altura; i++){
                    for(int j = 0; j < altura; j++){
                        if((i == j) || (i + j == altura - 1)){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }   
            }
            
        }while(altura < 3 || altura % 2 == 0);    
    }
}
