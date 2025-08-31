package U7.tarea5;
import java.io.*;
import java.util.*;

public class Aprobados {
    private Map<Integer, Aspirante> aspirantesMap;
    private Map<Integer, ArrayList<Integer>> calificacionesMap;
    private Map<Integer, Double> calificacionesMediasMap;

    public Aprobados() {
        aspirantesMap = new HashMap<>();
        calificacionesMap = new HashMap<>();
        calificacionesMediasMap = new HashMap<>();
    }

    public void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\ficheros\\aspirantes.dat"))) {
            aspirantesMap = (Map<Integer, Aspirante>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos de aspirantes: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\ficheros\\calificaciones.dat"))) {
            calificacionesMap = (Map<Integer, ArrayList<Integer>>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar las calificaciones: " + e.getMessage());
        }
    }

    private double calcularMedia(int aspiranteId) {
        ArrayList<Integer> calificaciones = calificacionesMap.get(aspiranteId);
        if (calificaciones == null || calificaciones.isEmpty()) {
            return 0.0;
        }
        int suma = 0;
        for (int nota : calificaciones) {
            suma += nota;
        }
        return (double) suma / calificaciones.size();
    }

    public void calcularCalificacionesMedias() {
        for (Map.Entry<Integer, Aspirante> entry : aspirantesMap.entrySet()) {
            int aspiranteId = entry.getKey();
            double media = calcularMedia(aspiranteId);
            calificacionesMediasMap.put(aspiranteId, media);
        }
    }

    public void generarInforme() {
        System.out.println("Nombre\t\tDNI\t\tCalificación Media");
        System.out.println("----------------------------------------------");
        List<Map.Entry<Integer, Aspirante>> listaAspirantes = new ArrayList<>(aspirantesMap.entrySet());
        listaAspirantes.sort(Comparator.comparing(a -> a.getValue().getNombre()));
        for (Map.Entry<Integer, Aspirante> entry : listaAspirantes) {
            int aspiranteId = entry.getKey();
            Aspirante aspirante = entry.getValue();
            double media = calificacionesMediasMap.get(aspiranteId);
            System.out.printf("%s\t\t%s\t\t%.2f%n", aspirante.getNombre(), aspirante.getDni(), media);
        }
    }
}
