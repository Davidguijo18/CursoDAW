package U1.ExamenesEstudio.Examen2_Tarde;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int posicion = 0;
        int vueltasPosicion = 1;
        int numeroCambio;
        int numeroVuelta = 0;
        int numeroCorrecto = 0;
        String ponerNumero = null;
        
        System.out.println("Introduce un numero entero positivo");
            numero = teclado.nextInt();
            
        System.out.println("Introduce el numero que quieres insertar");
            numeroCambio = teclado.nextInt();
            
        System.out.println("Introduce la posicion en la que quieres insertar el numero");
            posicion = teclado.nextInt();
            
        while(numero > 0){
            numeroVuelta = numero % 10 + numeroVuelta * 10;
            numero /= 10;
        }    
        
        while(numeroVuelta > 0){
            numeroCorrecto = numeroVuelta % 10 + numeroCorrecto * 10;
            
            if(posicion  - 1 == vueltasPosicion){
                ponerNumero = numeroCorrecto + "" + numeroCambio;
                numeroCorrecto = 0;
            }
            //406783
            vueltasPosicion++;
            numeroVuelta /= 10;
        }
        
        System.out.println("El numero resultante es "+ponerNumero+numeroCorrecto);
    }
}
