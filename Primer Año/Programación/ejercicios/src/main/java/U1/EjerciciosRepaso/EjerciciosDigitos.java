package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjerciciosDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        long numero;
        int array[] = new int [10];
        
        System.out.print("Introduzca un numero: ");
            numero = teclado.nextLong();
            
        while(numero > 0){
            int numeros = (int) (numero % 10);
            array[numeros]++;
            numero /= 10;
        }
        
        System.out.print("Digitos que aparecen ---> ");
        
        for(int i = 1; i < 10; i++){
            if(array[i] > 0){
                System.out.print(i+" ");
            }
        }
        
        System.out.println();
        
        
        System.out.print("Numeros que no aparecen ---> ");
        
        for(int j = 1; j < 10; j++){
            if(array[j] == 0){
                System.out.print(j+" ");
            }
        }
    }
}
