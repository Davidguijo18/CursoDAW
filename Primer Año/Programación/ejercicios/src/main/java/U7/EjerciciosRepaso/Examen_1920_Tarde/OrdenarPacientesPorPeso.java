package U7.EjerciciosRepaso.Examen_1920_Tarde;

import java.util.Comparator;

public class OrdenarPacientesPorPeso implements Comparator<Paciente> {
    @Override
    public int compare(Paciente o1, Paciente o2) {
        if (o1.getPeso() > o2.getPeso()) {
            return 1;
        } else if (o1.getPeso() < o2.getPeso()) {
            return -1;
        }
        return 0;
    }
}
