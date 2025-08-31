package U5.tarea1.Ejercicio2;

import U5.tarea1.Ejercicio1.Hora;

public class Hora12 extends Hora {

    private Mediodia mediodia;

    public Hora12(int hora, int minutos) {
        super(hora, minutos);
        this.mediodia = mediodia;
    }

    @Override
    public void setHora(int hora) {
        if (hora < 12) {
            super.setHora(hora);
            this.mediodia = Mediodia.AM;
        } else if (hora > 12 && hora < 24) {
            super.setHora(hora - 12);
            this.mediodia = Mediodia.PM;
        } else {
            this.mediodia = Mediodia.AM;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + mediodia;
    }

    public enum Mediodia {
        AM,
        PM
    }
}