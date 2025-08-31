package U1.EjerciciosRepaso;
import java.util.Scanner;

public class RepasoContarVocales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int contadorDeA = 0;
        int contadorDeI = 0;
        int contadorDeE = 0;
        int contadorDeO = 0;
        int contadorDeU = 0;
        
        System.out.println("Introduce una frase");
            String frase = teclado.nextLine();
            frase = frase.toLowerCase();
            
            for(int i =0; i < frase.length(); i++){
                char caracter = frase.charAt(i);
                
                if(caracter == 'a'){
                    contadorDeA++;
                }else if(caracter == 'e'){
                    contadorDeE++;
                }else if(caracter == 'i'){
                    contadorDeI++;
                }else if(caracter == 'o'){
                    contadorDeO++;
                }else if(caracter == 'u'){
                    contadorDeU++;
                }
            }
            
            System.out.println("Total de vocales");
            System.out.println("Numero de A: "+contadorDeA);
            System.out.println("Numero de E: "+contadorDeE);
            System.out.println("Numero de I: "+contadorDeI);
            System.out.println("Numero de O: "+contadorDeO);
            System.out.println("Numero de U: "+contadorDeU);
    }
}
