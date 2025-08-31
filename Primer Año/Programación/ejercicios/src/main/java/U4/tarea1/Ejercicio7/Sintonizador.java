package U4.tarea1.Ejercicio7;

public class Sintonizador {
    private double frecuenciaMaxima;
    private double frecuenciaMinima;

    private double frecuencia;

    public Sintonizador() {
        frecuenciaMinima = 80.00;
        frecuenciaMaxima = 108.00;
        frecuencia = 80.00;
    }

    public void subirFrecuencia() {
        frecuencia = frecuencia + 0.5;
        if (frecuencia > frecuenciaMaxima) {
            frecuencia = frecuenciaMinima;
            System.out.println("\nLa frecuencia actual es de: " + frecuencia + " MHz");
        } else if (frecuencia < frecuenciaMinima) {
            frecuencia = frecuenciaMaxima;
            System.out.println("\nLa frecuencia actual es de: " + frecuencia + " MHz");
        } else {
            System.out.println("\nLa frecuencia actual es de: " + frecuencia + " MHz");
        }
    }

    public void bajarFrecuencia() {
        frecuencia = frecuencia - 0.5;
        if (frecuencia < frecuenciaMinima) {
            frecuencia = frecuenciaMaxima;
            System.out.println("\nLa frecuencia actual es de: " + frecuencia + " MHz");
        } else if (frecuencia > frecuenciaMaxima) {
            frecuencia = frecuenciaMinima;
            System.out.println("\nLa frecuencia actual es de: " + frecuencia + " MHz");
        } else {
            System.out.println("\nLa frecuencia actual es de: " + frecuencia + " MHz");
        }
    }

    public void mostrarFrecuencia() {
        System.out.println("\nFrecuencia sintonizada: " + frecuencia + " MHz");
    }
}
