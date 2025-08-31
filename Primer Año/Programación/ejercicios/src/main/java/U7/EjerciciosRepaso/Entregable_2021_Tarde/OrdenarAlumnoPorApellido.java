package U7.EjerciciosRepaso.Entregable_2021_Tarde;

import java.util.Comparator;

public class OrdenarAlumnoPorApellido implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getApellidos().compareTo(o2.getApellidos());
    }
}