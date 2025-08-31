package U7.tarea5;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalificacionPruebas {
    private ArrayList<Integer> id;
    private Map<Integer, ArrayList<Integer>> mapa;

    public CalificacionPruebas() {
        mapa = new HashMap<>();
    }

    public void introducirNotas() {
        Scanner teclado = new Scanner(System.in);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\ficheros\\ids_aspirantes.dat"))) {
            id = (ArrayList<Integer>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for (Integer aspiranteId : id) {
            System.out.println("Introduce las calificaciones para el aspirante con ID " + aspiranteId + ":");

            System.out.print("Introduce la nota del primer trimestre: ");
            int primerTrimestre = teclado.nextInt();

            System.out.print("Introduce la nota del segundo trimestre: ");
            int segundoTrimestre = teclado.nextInt();

            System.out.print("Introduce la nota del tercer trimestre: ");
            int tercerTrimestre = teclado.nextInt();

            ArrayList<Integer> listaNotas = new ArrayList<>();
            listaNotas.add(primerTrimestre);
            listaNotas.add(segundoTrimestre);
            listaNotas.add(tercerTrimestre);

            mapa.put(aspiranteId, listaNotas);
        }
    }

    public void guardarFichero() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ficheros\\calificaciones.dat"))) {
            oos.writeObject(mapa);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
