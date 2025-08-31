package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioCartasFrancesas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String continuar;
        int numEjemplos = 1;
        
        do{
            int palo = (int)(Math.random()*4) + 1;
            String tipoPalo = null;

            int numero = (int)(Math.random()*13) + 1;
            String tipoNumero = null;
            
            switch(palo){
                case 1:
                    tipoPalo = "Picas";
                    break;       

                case 2:
                    tipoPalo = "Corazones";
                    break;  

                case 3:
                    tipoPalo = "Diamantes";
                    break;  

                case 4:
                    tipoPalo = "Treboles";
                    break;      
            }

            switch(numero){
                case 1:
                    tipoNumero = "A";
                    break;

                case 2:
                    tipoNumero = "2";
                    break;

                case 3:
                    tipoNumero = "3";
                    break;

                case 4:
                    tipoNumero = "4";
                    break;

                case 5:
                    tipoNumero = "5";
                    break;

                case 6:
                    tipoNumero = "6";
                    break;

                case 7:
                    tipoNumero = "7";
                    break;

                case 8:
                    tipoNumero = "8";
                    break;

                case 9:
                    tipoNumero = "9";
                    break;

                case 10:
                    tipoNumero = "10";
                    break;

                case 11:
                    tipoNumero = "J";
                    break;

                case 12:
                    tipoNumero = "Q";
                    break;

                case 13:
                    tipoNumero = "K";
                    break;
            }

            System.out.println("Generar Cartas Aleatoria");
            System.out.println("EJEMPLO "+numEjemplos);
            System.out.println("Palo de su carta ---> "+tipoPalo); 
            System.out.println("Carta : "+tipoNumero+"\n"+"\n");
            
            numEjemplos++;
            
            System.out.println("Desea continuar generando ejemplos?. Introduzca si o no");
                continuar = teclado.nextLine();
                
                System.out.println("\n"+"\n");
                
                if(continuar.equalsIgnoreCase("no")){
                    break;
                }
            
        }while(continuar.equalsIgnoreCase("si"));
    }
}
