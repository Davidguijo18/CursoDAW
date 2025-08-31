package U4.Entregable;

import java.util.Arrays;

public class Festival {
    private Concierto[] conciertos = new Concierto[0];
    private int indice;

    public Festival() {
    }

    public Festival(Concierto[] conciertos) {
        this.conciertos = conciertos;
    }

    public Concierto[] getConciertos() {
        return conciertos;
    }

    public void setConciertos(Concierto[] conciertos) {
        this.conciertos = conciertos;
    }

    public void agregarConciertos(Concierto concierto){
        conciertos = Arrays.copyOf(conciertos,conciertos.length+1);
        conciertos[indice] = concierto;
        indice++;
    }

    @Override
    public String toString() {
        return "Festival{" +
                "conciertos=" + Arrays.toString(conciertos) +
                '}';
    }
}
