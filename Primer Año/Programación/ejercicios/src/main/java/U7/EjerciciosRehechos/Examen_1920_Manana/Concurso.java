package U7.EjerciciosRehechos.Examen_1920_Manana;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concurso {
    private String nombreConcurso;
    private String localidad;
    private ArrayList<Perro> listaPerros = new ArrayList<>();
    private Map<String, ArrayList<Perro>> mapaRazaListaPerros = new HashMap<>();

    public Concurso(String nombreConcurso, String localidad) {
        this.nombreConcurso = nombreConcurso;
        this.localidad = localidad;
    }

    public void addDog(String raza, Perro perro) {
        ArrayList<Perro> listaPerro;
        if (mapaRazaListaPerros.containsKey(raza)) {
            if (raza.equalsIgnoreCase(perro.getRaza())) {
                listaPerro = mapaRazaListaPerros.get(raza);
                mapaRazaListaPerros.put(raza, listaPerro);
                listaPerros.add(perro);
            } else {
                System.out.println("Conflicto (las razas del perro y la introducida no coinciden)");
            }
        } else {
            mapaRazaListaPerros.put(raza, listaPerros);
            listaPerros.add(perro);
        }
    }

    public void disqualifyDog(Perro perro) {
        if (listaPerros.contains(perro)) {
            listaPerros.remove(perro);

            ArrayList<Perro> listaPerro = mapaRazaListaPerros.get(perro.getRaza());
            listaPerro.remove(perro);
            mapaRazaListaPerros.put(perro.getRaza(), listaPerro);

            System.out.println("Perro eliminado conn exito");
        } else {
            System.out.println("Perro no inscrito");
        }
    }

    public void ownerDogs(int numSociedadCanina) {
        ArrayList<Perro> listaPerrosDeUnDueno = new ArrayList<>();
        for (Perro perro : listaPerros) {
            if (numSociedadCanina == perro.getPropietario().getNumSocio()) {
                listaPerrosDeUnDueno.add(perro);
            }
        }

        if (listaPerrosDeUnDueno.isEmpty()) {
            System.out.println("Este dueno no tiene ningun perro");
        } else {
            System.out.println(listaPerrosDeUnDueno);
        }
    }

    public void perrosPorPeso(String raza) {
        if (mapaRazaListaPerros.containsKey(raza)) {
            ArrayList<Perro> lista = mapaRazaListaPerros.get(raza);
            lista.sort(new OrdenarPerrosPorPeso());

            System.out.println(lista);
        } else {
            System.out.println("No existe ningunn perro con esta raza");
        }
    }

    public void perrosPorEdad(String raza) {
        if (mapaRazaListaPerros.containsKey(raza)) {
            ArrayList<Perro> lista = mapaRazaListaPerros.get(raza);
            lista.sort(new OrdenarPerrosPorEdad());

            System.out.println(lista);
        } else {
            System.out.println("No existe ningunn perro con esta raza");
        }
    }

    public void cargarPerros() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"))) {
            ArrayList<Perro> lista = (ArrayList<Perro>) ois.readObject();

            for (Perro perro : lista) {
                String raza = perro.getRaza();

                if (!mapaRazaListaPerros.containsKey(raza)) {
                    mapaRazaListaPerros.put(raza, new ArrayList<>());
                }

                ArrayList<Perro> listaPerro = mapaRazaListaPerros.get(raza);
                listaPerro.add(perro);
            }
            listaPerros.addAll(lista);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    public void guardarPerros() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"))) {
            oos.writeObject(listaPerros);
        } catch (IOException e) {
            System.out.println("Error al guardar el arhivo" + e.getMessage());
        }
    }
}
