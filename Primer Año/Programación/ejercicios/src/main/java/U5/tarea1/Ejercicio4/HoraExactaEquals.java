package U5.tarea1.Ejercicio4;

import U5.tarea1.Ejercicio1.Hora;

import java.util.Objects;

public class HoraExactaEquals extends Hora {
    private int segundos;

    public HoraExactaEquals(int horas, int minutos, int segundos) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraExactaEquals that = (HoraExactaEquals) o;
        return super.equals(o) && segundos == that.segundos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(segundos);
    }
}