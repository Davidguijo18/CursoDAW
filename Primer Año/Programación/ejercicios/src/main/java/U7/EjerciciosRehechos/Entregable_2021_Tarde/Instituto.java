package U7.EjerciciosRehechos.Entregable_2021_Tarde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Instituto {
    private String nombreInstituto;
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private Map<Unidad,ArrayList<Alumno>> mapaUnidadListaAlumnos = new HashMap<>();

    public Instituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }


}
