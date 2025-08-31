package U7.EjerciciosRepaso.Examen_1920_Manana;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concurso {
    private ArrayList<Perro> listaCompletaPerros = new ArrayList<>();
    private Map<String, ArrayList<Perro>> clasificacionPorRazas = new HashMap<>();
    private String nombreConcurso;
    private String localidad;

    public Concurso(String nombreConcurso, String localidad) {
        this.nombreConcurso = nombreConcurso;
        this.localidad = localidad;
    }

    public void addDog(String raza, Perro perro) {
        // Obtener la raza del perro en minúsculas para comparación
        String razaPerroLowerCase = perro.getRazaPerro().toLowerCase();

        // Convertir la raza proporcionada a minúsculas para comparación
        String razaLowerCase = raza.toLowerCase();

        if (clasificacionPorRazas.containsKey(razaPerroLowerCase) && razaPerroLowerCase.equals(razaLowerCase)) {
            ArrayList<Perro> perros = clasificacionPorRazas.get(razaPerroLowerCase);
            perros.add(perro);
            clasificacionPorRazas.put(razaPerroLowerCase, perros);
            listaCompletaPerros.add(perro);
        } else {
            System.out.println("No puedes añadir un perro en una raza que no le corresponde");
        }
    }


    public void disqualifyDog(Perro perro) {
        ArrayList<Perro> lista;
        lista = clasificacionPorRazas.get(perro.getRazaPerro());

        if (lista == null || !lista.contains(perro)) {
            System.out.println("Este perro no esta inscrito");
        } else {
            listaCompletaPerros.remove(perro);
            lista.remove(perro);
            clasificacionPorRazas.put(perro.getRazaPerro(), lista);
        }
    }

    public void ownerDogs(Integer numSocioSociedadCanina) {
        ArrayList<Perro> lista = new ArrayList<>();
        for (Perro p : listaCompletaPerros) {
            if (numSocioSociedadCanina == p.getPropietario().getNumSocio()) {
                lista.add(p);
            }
        }
        if (lista.isEmpty()) {
            System.out.println("Este propietario no tiene perros inscritos");
        } else {
            System.out.println("Perros del socio con numero " + numSocioSociedadCanina + " : " + lista);
        }
    }


    public void perrosPorPeso(String razaPerro) {
        ArrayList<Perro> lista = clasificacionPorRazas.get(razaPerro);
        lista.sort(new OrdenarPerroPorPeso());

        System.out.println(lista);
    }

    public void perrosPorEdad(String razaPerro) {
        ArrayList<Perro> lista = clasificacionPorRazas.get(razaPerro);
        lista.sort(new OrdenarPerroPorEdad());

        System.out.println(lista);
    }

    public void cargarPerros() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"))) {
            ArrayList<Perro> listaPerros = (ArrayList<Perro>) ois.readObject();

            for (Perro perro : listaPerros) {
                String raza = perro.getRazaPerro();

                if (!clasificacionPorRazas.containsKey(raza)) {
                    clasificacionPorRazas.put(raza, new ArrayList<>());
                }

                clasificacionPorRazas.get(raza).add(perro);
                listaCompletaPerros.add(perro);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    public void guardarPerros() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"))){
            oos.writeObject(listaCompletaPerros);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
