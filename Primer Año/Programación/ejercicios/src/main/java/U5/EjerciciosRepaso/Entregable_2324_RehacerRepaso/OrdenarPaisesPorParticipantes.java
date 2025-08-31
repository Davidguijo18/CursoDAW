package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

import java.util.Comparator;

public class OrdenarPaisesPorParticipantes implements Comparator<Pais> {
    @Override
    public int compare(Pais pais1, Pais pais2) {
        if (pais1.getNumParticipantes() > pais2.getNumParticipantes()) {
            return 1;
        } else if (pais1.getNumParticipantes() < pais2.getNumParticipantes()) {
            return -1;
        } else {
            return 0;
        }
    }
}
