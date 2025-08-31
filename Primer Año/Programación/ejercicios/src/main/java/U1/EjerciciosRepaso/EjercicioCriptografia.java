package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioCriptografia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int darVuelta = 0;
        int numFinal = 0;
        int darVueltaAleatorio = 0;
        int suma = 0;
        
        System.out.println("Introduce un numero");
            int numero = teclado.nextInt();
            
            while(numero > 0){
                darVuelta = numero % 10 + darVuelta * 10;
                numero /= 10;
            }
            
            while(darVuelta > 0){
                numFinal = darVuelta % 10;
                int aleatorio = (int)(Math.random()*9000) + 1000;
                    System.out.println("La clave criptografica generada para el numero "+numFinal+" es: "+aleatorio);
                
                    while(aleatorio > 0){
                        darVueltaAleatorio = aleatorio % 10 + darVueltaAleatorio * 10;
                        aleatorio /= 10;
                    }
                    
                    System.out.print("La suma de las cifras totales para "+numFinal+" es: ");
                    
                    while(darVueltaAleatorio > 0){
                        int darVueltaFinal = darVueltaAleatorio% 10;
                        suma = darVueltaFinal + suma;
                        System.out.print(darVueltaFinal+" +");
                        
                        darVueltaAleatorio /= 10;
                    }
                    
                    System.out.println(" = "+suma);
                    suma = 0;
                    
                    System.out.println();
                    
            darVuelta /= 10;        
            }                        
    }
}
