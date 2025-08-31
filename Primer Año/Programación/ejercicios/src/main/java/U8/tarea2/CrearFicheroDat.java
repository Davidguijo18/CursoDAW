package U8.tarea2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CrearFicheroDat {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pepe", 14));
        personas.add(new Persona("María", 51));
        personas.add(new Persona("Raul", 22));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FichPersona.dat"))) {
            oos.writeObject(personas);
            System.out.println("Objetos Persona guardados en FichPersona.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
