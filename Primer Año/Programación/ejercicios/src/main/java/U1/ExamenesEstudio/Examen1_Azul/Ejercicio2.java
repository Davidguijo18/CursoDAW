package U1.ExamenesEstudio.Examen1_Azul;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int darVuelta = 0;
        int contador = 0;
        int potencia10 = 1;
        int numTemporal = 0;
        int numeroFinal = 0;
        
        int numero;
        do {
            System.out.println("Introduce un número positivo");
            numero = teclado.nextInt();
        } while (numero <= 0);
            
        
        System.out.println("Introduce la variable inicial");
        int varInicial = teclado.nextInt();
            
        System.out.println("Introduce la variable final");
        int varFinal = teclado.nextInt();
        
        while (numero > 0) {
            darVuelta = numero % 10 + darVuelta * 10;
            numero /= 10;
        }
            
        while (darVuelta > 0) {
            int numBien = darVuelta % 10;
            
            if (contador < varInicial || contador > varFinal) {
                numTemporal = numTemporal + numBien * potencia10;
                potencia10 *= 10;
            }
                
            contador++;
            darVuelta /= 10;
        }
        
        while (numTemporal > 0) {
            numeroFinal = numTemporal % 10 + numeroFinal * 10;
            numTemporal /= 10;
        }
            
        System.out.println("El número resultante es: " + numeroFinal);
    }
}
