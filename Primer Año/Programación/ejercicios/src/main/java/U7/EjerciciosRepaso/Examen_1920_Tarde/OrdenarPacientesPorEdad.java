package U7.EjerciciosRepaso.Examen_1920_Tarde;

import java.util.Comparator;

public class OrdenarPacientesPorEdad implements Comparator<Paciente> {
    public int compare(Paciente o1, Paciente o2) {
        if (o1.getEdad() > o2.getEdad()) {
            return 1;
        } else if (o1.getEdad() < o2.getEdad()) {
            return -1;
        }
        return 0;
    }
}
