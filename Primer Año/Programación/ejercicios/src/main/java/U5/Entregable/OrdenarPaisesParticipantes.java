package U5.Entregable;

import java.util.Comparator;

public class OrdenarPaisesParticipantes implements Comparator<Pais> {
    @Override
    public int compare(Pais pais1, Pais pais2) {
        if (pais1.getNumParticipantes() > pais2.getNumParticipantes()){
            return -1;
        } else if (pais1.getNumParticipantes() < pais2.getNumParticipantes()) {
            return 1;
        }
        return 0;
    }
}
