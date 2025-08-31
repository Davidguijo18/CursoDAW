package U8.EjerciciosParaRepasar.tarea2;

import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CrearFicheroDat {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        Persona persona1 = new Persona("Juan", 3);
        Persona persona2 = new Persona("Damian", 86);
        Persona persona3 = new Persona("Pedro", 11);
        Persona persona4 = new Persona("Enrique", 72);
        Persona persona5 = new Persona("Gustavo", 35);
        Persona persona6 = new Persona("Ramiro", 90);

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        listaPersonas.add(persona6);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\tarea2\\FichPersona.dat"))) {
            oos.writeObject(listaPersonas);
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }
}
