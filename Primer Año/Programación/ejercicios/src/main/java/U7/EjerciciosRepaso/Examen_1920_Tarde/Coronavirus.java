package U7.EjerciciosRepaso.Examen_1920_Tarde;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Coronavirus {
    private ArrayList<Paciente> listaInfectados = new ArrayList<>();
    private Map<Character, ArrayList<Paciente>> mapaCepaListaPacientes = new HashMap<>();
    private String nombreVirus;
    private String localidad;

    public Coronavirus(String nombreVirus, String localidad) {
        this.nombreVirus = nombreVirus;
        this.localidad = localidad;
    }

    public String getNombreVirus() {
        return nombreVirus;
    }

    public void setNombreVirus(String nombreVirus) {
        this.nombreVirus = nombreVirus;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void addPaciente(Character nombreCepa, Paciente paciente) {
        if (mapaCepaListaPacientes.containsKey(nombreCepa)) {
            if (paciente.getCepa().equals(nombreCepa)) {
                ArrayList<Paciente> lista = mapaCepaListaPacientes.get(nombreCepa);
                listaInfectados.add(paciente);
                lista.add(paciente);
                mapaCepaListaPacientes.put(nombreCepa, lista);
            } else {
                System.out.println("El paciente introducido no tiene dicha cepa");
            }
        } else {
            System.out.println("La cepa que has introducido (" + nombreCepa + ") no existe");
        }
    }

    public void darDeAltaPaciente(Paciente paciente) {
        if (mapaCepaListaPacientes.containsKey(paciente.getCepa())) {
            ArrayList<Paciente> lista = mapaCepaListaPacientes.get(paciente.getCepa());
            Iterator<Paciente> iterator = lista.iterator();
            while (iterator.hasNext()) {
                Paciente p = iterator.next();
                if (p.equals(paciente)) {
                    iterator.remove();
                    listaInfectados.remove(p);
                    break;
                }
            }
            mapaCepaListaPacientes.put(paciente.getCepa(), lista);
        } else {
            System.out.println("No se ha encontrado el paciente");
        }
    }

    public void pacientesDeUnDoctor(int numColegiado) {
        ArrayList<Paciente> listaPacientesDeUnDoctor = new ArrayList<>();
        for (Paciente p : listaInfectados) {
            if (p.getMedico().getNumColegiado() == numColegiado) {
                listaPacientesDeUnDoctor.add(p);
            }
        }

        if (listaPacientesDeUnDoctor.isEmpty()) {
            System.out.println("Este doctor no tiene pacientes");
        } else {
            System.out.println("Pacientes del doctor con numero de colegiado " + numColegiado + " : " + listaPacientesDeUnDoctor);
        }
    }

    public void pacientesPorPeso(Character nombreCepa) {
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        if (mapaCepaListaPacientes.containsKey(nombreCepa)) {
            listaPacientes = mapaCepaListaPacientes.get(nombreCepa);
        } else {
            System.out.println("Esa cepa no existe");
        }

        listaPacientes.sort(new OrdenarPacientesPorPeso());
        System.out.println("Los pacientes ordenados por peso de la cepa " + nombreCepa + " son :");
        System.out.println(listaPacientes);
    }

    public void pacientesPorEdad(Character nombreCepa) {
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        if (mapaCepaListaPacientes.containsKey(nombreCepa)) {
            listaPacientes = mapaCepaListaPacientes.get(nombreCepa);
        } else {
            System.out.println("Esa cepa no existe");
        }

        listaPacientes.sort(new OrdenarPacientesPorEdad());
        System.out.println("Los pacientes ordenados por edad de la cepa " + nombreCepa + " son :");
        System.out.println(listaPacientes);
    }

    public void cargarPacientes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pacientes.dat"))) {
            listaInfectados = (ArrayList<Paciente>) ois.readObject();

            for (Paciente p : listaInfectados) {
                Character cepa = p.getCepa();
                if (!mapaCepaListaPacientes.containsKey(cepa)) {
                    mapaCepaListaPacientes.put(cepa, new ArrayList<>());
                }
                mapaCepaListaPacientes.get(cepa).add(p);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void guardarPacientes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pacientes.dat"))) {
            oos.writeObject(listaInfectados);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
