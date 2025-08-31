package U8.EjerciciosEntregable.Entregable_2122_Manana;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AlumnoDOM alumnoDOM = new AlumnoDOM();
        ArrayList<Alumno> listaAlumnos = alumnoDOM.parse();

        for (Alumno a: listaAlumnos){
            System.out.println(a);
        }
    }
}
