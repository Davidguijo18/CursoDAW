package U5.Entregable;

import java.util.Arrays;

public class PeladoresGambas extends Participante implements Pelar {
    private int peso;


    public PeladoresGambas(String nombreParticipante, int edad, int peso) {
        super(nombreParticipante, edad);
        this.peso = peso;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo" + nombreParticipante + ", como pelador, juro los valores deportivos mundiales");
    }


    @Override
    public String toString() {
        return "PeladoresGambas{" +
                "peso=" + peso +
                ", nombreParticipante='" + nombreParticipante + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void pelar() {
        System.out.println("Voy a pelar mis gambas");
    }
}
