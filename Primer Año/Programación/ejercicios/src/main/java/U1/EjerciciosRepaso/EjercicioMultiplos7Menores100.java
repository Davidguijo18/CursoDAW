package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioMultiplos7Menores100 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Los multiplos de 7 son: ");
        for(int i = 1; i<= 13; i++){
            System.out.print( 7*i+" ");
        }
    }
}
