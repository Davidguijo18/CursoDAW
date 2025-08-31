package U1.ExamenesEstudio.Examen3_TardeA;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       
        int melodiaAleatoria = (int)((Math.random()*7) + 1);
        String nota;      
        
        for(int i = 1; i<= melodiaAleatoria; i++){
            
            for(int j = 1; j <= 4; j++){
                
                int notaAleatoria = (int)(Math.random()*7) + 1;
                switch(notaAleatoria){
                    case 1:
                        nota = "do";
                        System.out.print(nota+" ");
                        break;

                    case 2:
                        nota = "re";
                        System.out.print(nota+" ");
                        break;

                    case 3:
                        nota = "mi";
                        System.out.print(nota+" ");
                        break;

                    case 4:
                        nota = "fa";
                        System.out.print(nota+" ");
                        break;

                    case 5:
                        nota = "sol";
                        System.out.print(nota+" ");
                        break;

                    case 6:
                        nota = "la";
                        System.out.print(nota+" ");
                        break;

                    case 7:
                        nota = "si";
                        System.out.print(nota+" ");
                        break;
                }
            } 
            
            if(i == melodiaAleatoria){
                    System.out.print(" || ");
                }else{
                    System.out.print("  |  ");
                } 
        }
    }
}