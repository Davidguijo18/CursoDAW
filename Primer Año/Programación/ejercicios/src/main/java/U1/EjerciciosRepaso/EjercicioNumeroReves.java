package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioNumeroReves {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int numeroReves = 0;
        
        System.out.println("Introduce un numero");
            numero = teclado.nextInt();
        
        while(numero > 0){
            numeroReves = numero % 10 + numeroReves * 10;
            numero = numero/10;
        }    
        
        System.out.println("El numero dado la vuelta es "+numeroReves);
        
        /*EXPLICACION:
          1- En la primera vuelta tenemos el numero(ej) 357
                - numReves = 357%10 (esto siempre nos devolvera la ultima cifra, en este caso 7) + 0
                - El numero lo dividimos e igualamos entre 10, es decir, ahora es 35
          2- En la segunda vuelta tenemos el numero 35
                - numReves 35%10 (nos devolvera 5) --> 5 + 70 (en este caso, nuestro numReves anterior era 7, al multiplicarlo por 10 obtenemos 70) --> 75 (sumamos 70 + 5)
                -El numero vuelve a estar dividio e igualado entre 10, asi que pasa de 35 a 3
          3- En la ultima vuelta (en este ejemplo) el numero es 3
                - numReves 3%10 --> 3 + 750 (el numReves era 75, pero al multplicarlo por 10 el numero se convierte en 750) --> 753 (sumamos 750 + 3)
                -En este caso finalizaria aqui la ejecucion, seria correcto, ya que 357 al reves es 753
        */
    }
}
