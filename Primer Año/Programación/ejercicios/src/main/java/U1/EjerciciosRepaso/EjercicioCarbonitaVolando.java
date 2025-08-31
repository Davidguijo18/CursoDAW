package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioCarbonitaVolando {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float precio = 0;
        
        System.out.print("Introduzca el peso de su figura en gramos: ");
            int peso = teclado.nextInt();
            
        System.out.print("Introduzca el tipo de materia de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
            int tipoMat = teclado.nextInt();
            
            if(tipoMat == 1){
                precio = (float) (peso * 0.2);
            }else if(tipoMat == 2){
                precio = (float) (peso * 0.3);
            }else if(tipoMat == 3){
                precio = (float) (peso * 0.5);
            }else if(tipoMat == 4){
                precio = (float) (peso * 0.7);
            }else{
                System.out.println("Debes introducir una opcion correcta");
            }
            
            teclado.nextLine();
            
        System.out.print("¿Quiere posprocesado? (si / no): ");    
            String respuesta = teclado.nextLine();
            
            if(respuesta.equalsIgnoreCase("si")){
                precio = precio + 3;
            }else if(respuesta.equalsIgnoreCase("no")){
                precio = precio;
            }else{
                System.out.println("Debes introducir si o no");
            }
        
        System.out.print("¿Pertenece a Enjuto3D Premium? (si / no): ");
            String respuesaEnjunto = teclado.nextLine();
                precio = precio + 2;
            if(respuesaEnjunto.equalsIgnoreCase("si")){
                precio = precio;
            }else if (respuesaEnjunto.equalsIgnoreCase("no")){
                System.out.println("Debes introducir si o no");
            }
            
        System.out.println("El coste total es de: "+precio+" €");    
    }
}
