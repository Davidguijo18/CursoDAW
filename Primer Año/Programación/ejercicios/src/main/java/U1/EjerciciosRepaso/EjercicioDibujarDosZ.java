package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioDibujarDosZ {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la altura de las dos Z");
            int altura = teclado.nextInt();
            
            for(int i = 1; i <= altura; i++){
                for(int espacio = 1; espacio <= 2; espacio++){
                    for(int j = 1; j<= altura; j++){
                        if(i == 1 || i == altura || j == altura - i + 1){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("   ");
                } 
                System.out.println("");
            }
        }
}
