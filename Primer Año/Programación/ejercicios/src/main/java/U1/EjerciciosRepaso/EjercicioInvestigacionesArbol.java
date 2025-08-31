package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioInvestigacionesArbol {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int altura = 0;
        int contador = 1;
        int alturaMaxima = 0;
        int contadorArbolMaximo = 0;
        
        while(altura != -1){
            System.out.println("Introduce la altura del arbol en centimetros");
                altura = teclado.nextInt();
            
                if(altura != -1){
                    System.out.println("Altura del arbol "+contador+" ----> "+altura+" cm\n");
                }
                    
                if(altura > alturaMaxima){
                    alturaMaxima = altura;
                    contadorArbolMaximo = contador;
                }
                contador++;
                    
        }    
        
        System.out.println();
        System.out.println("El arbol mas alto es el "+contadorArbolMaximo+" con una altura de "+alturaMaxima+" centimetros");
    }
}
