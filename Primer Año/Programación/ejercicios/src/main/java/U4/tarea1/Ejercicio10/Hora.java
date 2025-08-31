package U4.tarea1.Ejercicio10;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() {
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void sumarSegundos(int segundosExtras) {
        segundos = segundos + segundosExtras;

        while (segundos >= 60) {
            minutos = minutos + 1;
            segundos = segundos - 60;
        }

        while (minutos >= 60) {
            horas = horas + 1;
            minutos = minutos - 60;
        }
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }


    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
