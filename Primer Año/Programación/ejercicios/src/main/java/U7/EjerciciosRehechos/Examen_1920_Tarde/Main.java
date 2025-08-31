package U7.EjerciciosRehechos.Examen_1920_Tarde;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Coronavirus
        Coronavirus sistemaCoronavirus = new Coronavirus("COVID-19", "Wuhan");

        // Crear médicos
        Medico medico1 = new Medico("Juan", "García", 1234, "Hospital A");
        Medico medico2 = new Medico("María", "López", 5678, "Hospital B");
        Medico medico3 = new Medico("Pedro", "Martínez", 9012, "Hospital C");

        // Crear pacientes
        Paciente paciente1 = new Paciente("Paciente1", 35, 70.5, true, medico1, "A");
        Paciente paciente2 = new Paciente("Paciente2", 40, 65.2, false, medico2, "B");
        Paciente paciente3 = new Paciente("Paciente3", 25, 80.8, true, medico3, "C");
        Paciente paciente4 = new Paciente("Paciente4", 50, 75.3, true, medico1, "A");
        Paciente paciente5 = new Paciente("Paciente5", 30, 68.7, false, medico2, "B");
        Paciente paciente6 = new Paciente("Paciente6", 45, 72.1, true, medico3, "C");
        Paciente paciente7 = new Paciente("Paciente7", 55, 85.4, true, medico1, "A");
        Paciente paciente8 = new Paciente("Paciente8", 20, 60.0, false, medico2, "B");
        Paciente paciente9 = new Paciente("Paciente9", 60, 90.2, true, medico3, "C");
        Paciente paciente10 = new Paciente("Paciente10", 28, 73.5, true, medico1, "A");

        // Añadir pacientes al sistema de Coronavirus
        sistemaCoronavirus.addPaciente("A", paciente1);
        sistemaCoronavirus.addPaciente("B", paciente2);
        sistemaCoronavirus.addPaciente("C", paciente3);
        sistemaCoronavirus.addPaciente("A", paciente4);
        sistemaCoronavirus.addPaciente("B", paciente5);
        sistemaCoronavirus.addPaciente("C", paciente6);
        sistemaCoronavirus.addPaciente("A", paciente7);
        sistemaCoronavirus.addPaciente("B", paciente8);
        sistemaCoronavirus.addPaciente("C", paciente9);
        sistemaCoronavirus.addPaciente("A", paciente10);

        // Mostrar pacientes de un médico
        sistemaCoronavirus.pacientesDeUnDoctor(1234); // Médico Juan García
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        sistemaCoronavirus.pacientesDeUnDoctor(5678); // Médico María López
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        sistemaCoronavirus.pacientesDeUnDoctor(9012); // Médico Pedro Martínez
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n");

        // Mostrar pacientes ordenados por edad
        System.out.println("Pacientes ordenados por edad de la cepa A: ");
        sistemaCoronavirus.pacientesPorEdad("A");
        System.out.println("\nPacientes ordenados por edad de la cepa B: ");
        sistemaCoronavirus.pacientesPorEdad("B");
        System.out.println("\nPacientes ordenados por edad de la cepa C: ");
        sistemaCoronavirus.pacientesPorEdad("C");

        System.out.println("\n\n\n------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n\n");

        // Mostrar pacientes ordenados por peso
        System.out.println("Pacientes ordenados por peso de la cepa A: ");
        sistemaCoronavirus.pacientesPorPeso("A");
        System.out.println("\nPacientes ordenados por peso de la cepa B: ");
        sistemaCoronavirus.pacientesPorPeso("B");
        System.out.println("\nPacientes ordenados por peso de la cepa C: ");
        sistemaCoronavirus.pacientesPorPeso("C");

        // Guardar pacientes en un fichero
        sistemaCoronavirus.guardarPacientes();

        // Cargar pacientes desde el fichero
        //sistemaCoronavirus.cargarPacientes();
    }
}
