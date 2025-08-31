package U3.Examen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la palabra adivinar: ");
        String palabraAdivinar = teclado.nextLine();
        palabraAdivinar = palabraAdivinar.toLowerCase();

        String palabraJugada = "";
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            palabraJugada = palabraJugada.concat("-");
        }

        String palabraFinal;
        do {
            System.out.print("Introduce una letra: ");
            char letra = teclado.next().charAt(0);


            palabraFinal = palabraAhorcado(palabraAdivinar, palabraJugada, letra);
            System.out.println("Resultado: " + palabraFinal);

            if (palabraFinal.equalsIgnoreCase(palabraAdivinar)) {
                break;
            }

        } while (!palabraFinal.isEmpty());

    }


    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra) {
        String letraPasar = Character.toString(letra);
        for (char i = 0; i < cadena_a_adivinar.length(); i++) {
            if (letra == cadena_a_adivinar.charAt(i)) {
                resultado_parcial = cadena_a_adivinar;
                for (int j = 0; j < resultado_parcial.length();j++){
                    if(resultado_parcial.charAt(i) == letra){
                        //Me lo muestra al reves, es decir, me muestra todas las palabras excepto la que es
                        resultado_parcial = resultado_parcial.replace(letraPasar,"-");
                    }
                }
            }
        }
        return resultado_parcial;
    }

    public static boolean terminarEjecucion(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == '-') {
                return true;
            }
        }
        return false;
    }
}
