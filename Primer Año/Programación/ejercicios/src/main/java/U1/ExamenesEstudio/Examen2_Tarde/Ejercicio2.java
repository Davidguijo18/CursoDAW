package U1.ExamenesEstudio.Examen2_Tarde;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numPares = 0;
        int numImpares = 0;
        long numero = 0;
        
        System.out.println("Introduzca un numero entero positivo");
            numero = teclado.nextLong();
            
            long numInicial = numero;
            
            while(numero > 0){
                long numeros = numero % 10;
                
                if(numeros % 2 == 0){
                    numPares++;
                }else{
                    numImpares++;
                }
                        
                numero /= 10;
            }
            
            System.out.println("El "+numInicial+" contiene "+numPares+" digitos pares y "+numImpares+" digitos impares");
    }
}
