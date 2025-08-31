package U7.EjerciciosRehechos.Examen_1920_Tarde;

import java.util.Comparator;

public class OrdenarPacientesPorEdad implements Comparator<Paciente> {
    @Override
    public int compare(Paciente p1, Paciente p2) {
        if (p1.getEdad() > p2.getEdad()) {
            return -1;
        } else if (p1.getEdad() < p2.getEdad()) {
            return 1;
        }
        return 0;
    }
}
