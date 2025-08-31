package U1.ExamenesEstudio.Examen1_Azul;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
        
        while (true) {
            System.out.print("Introduce la altura de la flecha (impar y mayor o igual a 3): ");
            altura = teclado.nextInt();
            
            if (altura >= 3 && altura % 2 == 1) {
                break;
            } else {
                System.out.println("La altura debe ser un número impar mayor o igual a 3. Inténtalo de nuevo.");
            }
        }
        
         for (int i = 0; i < altura / 2; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
