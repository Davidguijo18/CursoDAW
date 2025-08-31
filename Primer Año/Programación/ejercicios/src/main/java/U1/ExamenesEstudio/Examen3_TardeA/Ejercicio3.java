package U1.ExamenesEstudio.Examen3_TardeA;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        long darVueltaNum1 = 0;
        long darVueltaNum2 = 0;
        String numerosPares = "";
        String numerosImpares = "";
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
            long numero1 = teclado.nextLong();
            
        System.out.println("Introduce otro numero");
            long numero2 = teclado.nextLong();
            
            while(numero1 > 0 && numero2 > 0){
                darVueltaNum1 = numero1 % 10 + darVueltaNum1 * 10;
                numero1 /= 10;
                
                darVueltaNum2 = numero2 % 10 + darVueltaNum2 * 10;
                numero2 /= 10;
            }
            
            while(darVueltaNum1 > 0 && darVueltaNum2 > 0){
                long numDef1 = darVueltaNum1 % 10;
                
                    if(numDef1 % 2 == 0){
                        numerosPares = numerosPares+""+numDef1;
                    }else{
                        numerosImpares = numerosImpares+""+numDef1;
                    }
                    
                    darVueltaNum1 /= 10;
                
                long numDef2 = darVueltaNum2 % 10;
                
                    if(numDef2 % 2 == 0){
                        numerosPares = numerosPares+""+numDef2;
                    }else{
                        numerosImpares = numerosImpares+""+numDef2;
                    }
                    
                    darVueltaNum2 /= 10;
            }
            
            System.out.println("El numero formado por digitos pares es: "+numerosPares);
            System.out.println("El numero formado por digitos impares es: "+numerosImpares);
    }
}
