package U1.Examen;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);

        System.out.println("Introduce la altura");
            int altura = teclado.nextInt();

            for(int i = 1; i <= altura; i++){
                for(int j = 1; j <= altura; j++){
                    if(j == 1 || j ==  altura || i == altura  - j){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}
