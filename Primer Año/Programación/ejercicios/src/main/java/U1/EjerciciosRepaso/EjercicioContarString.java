package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioContarString {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int contadorH = 0;
        int contadorP = 0;
        int contadorJ = 0;
        int contadorEspacios = 0;

        System.out.println("Introduce una frase");
        String frase = teclado.nextLine();

        frase = frase.toLowerCase();

        System.out.println("Vamos a ver cuantas a,b,c,h,p,j y espacios tiene tu frase");

        for (int i = 0; i<frase.length(); i++) {
            char caracter = frase.charAt(i);

            if(caracter == 'a'){
                contadorA++;
            }

            if(caracter == 'b'){
                contadorB++;
            }

            if(caracter == 'c'){
                contadorC++;
            }

            if(caracter == 'h'){
                contadorH++;
            }

            if(caracter == 'p'){
                contadorP++;
            }

            if(caracter == 'j'){
                contadorJ++;
            }

            if(caracter == ' '){
                contadorEspacios++;
            }
        }

        System.out.println("Resultados");
        System.out.println("Total de A: "+contadorA);
        System.out.println("Total de B: "+contadorB);
        System.out.println("Total de C: "+contadorC);
        System.out.println("Total de H: "+contadorH);
        System.out.println("Total de P: "+contadorP);
        System.out.println("Total de J: "+contadorJ);
        System.out.println("Total de espacios: "+contadorEspacios);
    }
}
