package U7.EjerciciosRehechos.Examen_1920_Tarde;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Coronavirus {
    private ArrayList<Paciente> listaInfectados = new ArrayList<>();
    private Map<String, ArrayList<Paciente>> mapaCodigoPacientes = new HashMap<>();
    private String nombreVirus;
    private String localidad;

    public Coronavirus(String nombreVirus, String localidad) {
        this.nombreVirus = nombreVirus;
        this.localidad = localidad;
    }

    public void addPaciente(String cepa, Paciente paciente) {
        if (!mapaCodigoPacientes.containsKey(cepa)) {
            mapaCodigoPacientes.put(cepa, new ArrayList<Paciente>());
        }

        ArrayList<Paciente> listaPacientes = mapaCodigoPacientes.get(cepa);
        if (cepa.equalsIgnoreCase(paciente.getNombreCepa())) {
            listaPacientes.add(paciente);
            listaInfectados.add(paciente);
        } else {
            System.out.println("La cepa introducida no coincide con la del paciente");
        }
    }


    public void darDeAltaPaciente(Paciente paciente) {
        if (listaInfectados.contains(paciente)) {
            ArrayList<Paciente> lista = mapaCodigoPacientes.get(paciente.getNombreCepa());
            lista.remove(paciente);
            listaInfectados.remove(paciente);
            mapaCodigoPacientes.put(paciente.getNombreCepa(), lista);
        } else {
            System.out.println("No se ha encontrado al paciente");
        }
    }

    public void pacientesDeUnDoctor(int numColegiado) {
        ArrayList<Paciente> listaPacientesDeUnMedico = new ArrayList<>();
        for (Paciente p : listaInfectados) {
            if (p.getMedico().getNumColegiado() == numColegiado) {
                listaPacientesDeUnMedico.add(p);
            }
        }

        System.out.println("Los pacientes del doctor con numero de colegiado " + numColegiado + " son: ");
        for (Paciente p : listaPacientesDeUnMedico) {
            System.out.println(p);
        }
    }

    public void pacientesPorEdad(String cepa) {
        ArrayList<Paciente> listaPacientesOrdenadosEdad = mapaCodigoPacientes.get(cepa);
        listaPacientesOrdenadosEdad.sort(new OrdenarPacientesPorEdad());

        System.out.println(listaPacientesOrdenadosEdad);
    }

    public void pacientesPorPeso(String cepa) {
        ArrayList<Paciente> listaPacientesOrdenadosPeso = mapaCodigoPacientes.get(cepa);
        listaPacientesOrdenadosPeso.sort(new OrdenarPacientesPorPeso());

        System.out.println(listaPacientesOrdenadosPeso);
    }

    public void guardarPacientes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pacientes.dat"))) {
            oos.writeObject(listaInfectados);
        } catch (IOException e) {
            System.out.println("Error al guardar los pacientes: " + e.getMessage());
        }
    }

    public void cargarPacientes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pacientes.dat"))) {
            ArrayList<Paciente> lista = (ArrayList<Paciente>) ois.readObject();

            for (Paciente paciente : listaInfectados) {
                String cepa = paciente.getNombreCepa();

                if (!mapaCodigoPacientes.containsKey(cepa)) {
                    mapaCodigoPacientes.put(cepa, new ArrayList<>());
                }

                ArrayList<Paciente> listaPacientes = mapaCodigoPacientes.get(cepa);
                listaPacientes.add(paciente);
            }
            listaInfectados.addAll(lista);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el fichero: " + e.getMessage());
        }
    }
}
