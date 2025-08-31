package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioContarOcurrenciasLugar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int contador = 0;
        int apariciones = 0;
        int darVuelta = 0;
        
        System.out.println("Introduce un numero");
            int numero = teclado.nextInt();
            
        System.out.println("Introduce una cifra");    
            int cifra = teclado.nextInt();
            
            System.out.print("Posiciones en las que aparece la cifra "+cifra+" son: ");
            
            while(numero > 0){
                darVuelta = numero % 10 + darVuelta * 10;
                numero /= 10;
            }
            
            while(darVuelta > 0){
                int numDefinitivo = darVuelta % 10;
                apariciones++;
                
                if(numDefinitivo == cifra){
                    contador++;
                    System.out.print(apariciones+" ");
                }
                
                darVuelta /= 10;
            }
            System.out.println("");
            System.out.println("La cifra introducida "+cifra+" aparece un total de "+contador+" veces");
    }
}
