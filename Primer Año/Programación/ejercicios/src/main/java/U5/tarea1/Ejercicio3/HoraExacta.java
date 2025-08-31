package U5.tarea1.Ejercicio3;

import U5.tarea1.Ejercicio1.Hora;

public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int horas, int minutos, int segundos) {
        super(horas, minutos);
        if (segundos < 60) {
            this.segundos = segundos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos > 59) {
            minutos++;
            this.segundos = segundos - 59;
            if (minutos >= 60) {
                super.inc();
            }
        }
    }

    public void horaExacta() {
        System.out.println(super.toString() + " : " + segundos);
    }

    @Override
    public void inc() {
        if (segundos < 59) {
            segundos++;
        } else {
            minutos++;
            segundos -= 59;

            if (minutos >= 60) {
                super.inc();
            }
        }
    }
}