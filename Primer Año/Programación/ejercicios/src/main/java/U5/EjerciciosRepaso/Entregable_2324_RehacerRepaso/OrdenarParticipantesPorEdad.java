package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

import java.util.Comparator;

public class OrdenarParticipantesPorEdad implements Comparator<Participante> {
    @Override
    public int compare(Participante participante1, Participante participante2) {
        if (participante1.getEdad() > participante2.getEdad()) {
            return 1;
        } else if (participante1.getEdad() < participante2.getEdad()) {
            return -1;
        } else {
            return 0;
        }
    }
}
