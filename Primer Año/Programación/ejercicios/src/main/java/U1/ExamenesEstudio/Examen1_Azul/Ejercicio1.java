package U1.ExamenesEstudio.Examen1_Azul;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numVuelta = 0;
        int sucursal = 0;
        int sucursalCorrecta = 0;
        int entidad = 0;
        int entidadCorrecta = 0;
        int control = 0;
        int controlCorrecto = 0;
        
        System.out.println("Introduce el numero de la cuenta");
            int numeroCuenta = teclado.nextInt();
            
            while(numeroCuenta > 0){
                numVuelta = numeroCuenta % 10 + numVuelta * 10;
                numeroCuenta /= 10;
            }
            
            //En este bucle saco los 2 numeros de control
            
            for(int i = 1; i <= 2; i++){
                control = numVuelta % 10 + control * 10;
                numVuelta /= 10;
            }
            
                if(control == 44){
                    controlCorrecto = 1;
                }
            //--------------------------------------------------------- 
            
            //En este bucle saco los 4 numeros de la sucursal
            
            for(int i = 1; i <= 4; i++){
                sucursal = numVuelta % 10 + sucursal * 10;
                numVuelta /= 10;
            }
            
                if(sucursal == 3333){
                    sucursalCorrecta = 1;
                }
            //---------------------------------------------------------    
            
            
            //En este bucle saco los 4 primeros numeros de la entidad
            
            for(int i = 1; i <= 4; i++){
                entidad = numVuelta % 10 + entidad * 10;
                numVuelta /= 10;
            }
            
                if(entidad == 2222){
                    entidadCorrecta = 1;
                }
                
            //---------------------------------------------------

            
            //Compruebo que realmente sea correcto
            
            if(control == 44 && sucursal == 3333 && entidad == 2222 ){
                System.out.println("Numero de cuenta correcto");
            }else{
                System.out.println("Numero de cuenta incorrecto");
            }
    }
    
}
