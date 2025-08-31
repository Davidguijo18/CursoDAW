package U1.ExamenesEstudio.Examen2_Tarde;
import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int altura;

            while (true) {
                System.out.print("Por favor, introduzca la altura del rombo (impar y mayor o igual a 3): ");
                altura = teclado.nextInt();

                if (altura >= 3 && altura % 2 == 1) {
                    break;
                } else {
                    System.out.println("La altura debe ser un número impar mayor o igual a 3. Inténtalo de nuevo.");
                }
            }

            int espacios = altura / 2;
            int asteriscos = 1;

            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= espacios; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= asteriscos; j++) {
                    if (j == 1 || j == asteriscos || i == 1 || i == altura) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if (i < altura / 2 + 1) {
                    espacios--;
                    asteriscos += 2;
                } else {
                    espacios++;
                    asteriscos -= 2;
                }

                System.out.println();
            }
        } 
}