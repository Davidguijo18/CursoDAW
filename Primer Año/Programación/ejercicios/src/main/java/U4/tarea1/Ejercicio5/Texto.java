package U4.tarea1.Ejercicio5;

public class Texto {
    private long longitudMaxima;
    private String cadena;

    public Texto(long longitud, String cadena) {
        this.longitudMaxima = longitud;
        this.cadena = cadena;
    }


    public String anadirCaracterPrincipio(char caracter) {
        String mensaje;
        mensaje = caracter + this.cadena;
        if (mensaje.length() > longitudMaxima) {
            mensaje = "El mensaje supera la longitud maxima permitida";
        }
        return mensaje;
    }

    public String anadirCaracterFinal(char caracter) {
        String mensaje;
        mensaje = this.cadena + caracter;
        if (mensaje.length() > longitudMaxima) {
            mensaje = "El mensaje supera la longitud maxima permitida";
        }
        return mensaje;
    }

    public String anadirCadenaPrincipio(String cadena) {
        String mensaje;
        mensaje = cadena.concat(this.cadena);
        if (mensaje.length() > longitudMaxima) {
            mensaje = "El mensaje supera la longitud maxima permitida";
        }
        return mensaje;
    }

    public String anadirCadenaFinal(String cadena) {
        String mensaje;
        mensaje = this.cadena.concat(cadena);
        if (mensaje.length() > longitudMaxima) {
            mensaje = "El mensaje supera la longitud maxima permitida";
        }
        return mensaje;
    }

    public void contarMayusculasMinusculas(String mensaje) {
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'A') {
                contadorMayusculas++;
            } else if (cadena.charAt(i) == 'E') {
                contadorMayusculas++;
            } else if (cadena.charAt(i) == 'I') {
                contadorMayusculas++;
            } else if (cadena.charAt(i) == 'O') {
                contadorMayusculas++;
            } else if (cadena.charAt(i) == 'U') {
                contadorMayusculas++;
            } else if (cadena.charAt(i) == 'a') {
                contadorMinusculas++;
            } else if (cadena.charAt(i) == 'e') {
                contadorMinusculas++;
            } else if (cadena.charAt(i) == 'i') {
                contadorMinusculas++;
            } else if (cadena.charAt(i) == 'o') {
                contadorMinusculas++;
            } else if (cadena.charAt(i) == 'u') {
                contadorMinusculas++;
            }
        }

        System.out.println("\nHay un total de " + contadorMayusculas + " vocales mayusculas en el mensaje inicial");
        System.out.println("Hay un total de " + contadorMinusculas + " vocales minusculas en el mensaje inicial");
    }
}
