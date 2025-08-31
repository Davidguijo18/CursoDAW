package U1.ExamenesEstudio.Examen3_TardeA;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        char caracter;
        
        
        
        for(int i = 1; i <= 10; i++){
            int longitudAleatoria = (int)(Math.random()*40) + 1;
           
            for(int j = 0; j < longitudAleatoria; j++){
                int caracterAleatorio = (int)(Math.random()*6) + 1;
                
                switch(caracterAleatorio){
                    case 1:
                        caracter = '*';
                        System.out.print(caracter);
                        break;
                        
                    case 2:
                        caracter = '-';
                        System.out.print(caracter);
                        break;
                        
                    case 3:
                        caracter = '=';
                        System.out.print(caracter);
                        break;
                        
                    case 4:
                        caracter = '.';
                        System.out.print(caracter);
                        break;
                        
                    case 5:
                        caracter = '|';
                        System.out.print(caracter);
                        break;
                        
                    case 6:
                        caracter = '@';
                        System.out.print(caracter);
                        break;    
                        
                }
            } 
            
            System.out.println("");
        }
        
    }
}
