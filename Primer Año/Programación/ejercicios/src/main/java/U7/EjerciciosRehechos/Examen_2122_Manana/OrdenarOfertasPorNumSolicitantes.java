package U7.EjerciciosRehechos.Examen_2122_Manana;

import java.util.Comparator;

public class OrdenarOfertasPorNumSolicitantes implements Comparator<Oferta> {
    @Override
    public int compare(Oferta o1, Oferta o2) {
        if (o1.getTrabajadoresSolicitantes().size() > o2.getTrabajadoresSolicitantes().size()) {
            return 1;
        } else if (o1.getTrabajadoresSolicitantes().size() < o2.getTrabajadoresSolicitantes().size()) {
            return -1;
        }
        return 0;
    }
}
