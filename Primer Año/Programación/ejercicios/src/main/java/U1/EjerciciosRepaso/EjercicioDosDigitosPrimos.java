package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioDosDigitosPrimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
            int numero = teclado.nextInt();
            
        while(numero > 0){
            int numeroPares = numero % 100;
            
             for (int i = 2; i < numeroPares; i++) {

                if (numeroPares % i == 0) {
                    System.out.println("El numero "+numeroPares+" no es primo");
                    break;
                }else{
                    System.out.println("El numero "+numeroPares+" es primo");
                    break;                
                }
        }
            numero /= 100;
        }    
    }
}
