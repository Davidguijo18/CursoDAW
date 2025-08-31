package U7.EjerciciosRepaso.Examen_1920_Tarde;
public class Main {
    public static void main(String[] args) {
        // Crear médicos
        Medico medico1 = new Medico("Juan", "Gómez", 12345, "Hospital A");
        Medico medico2 = new Medico("María", "López", 54321, "Hospital B");
        Medico medico3 = new Medico("Pedro", "Martínez", 98765, "Hospital C");

        // Crear pacientes
        Paciente paciente1 = new Paciente("Paciente1", 30, 70.5, true, medico1, 'A');
        Paciente paciente2 = new Paciente("Paciente2", 45, 80.0, false, medico2, 'B');
        Paciente paciente3 = new Paciente("Paciente3", 55, 65.2, true, medico1, 'A');
        // Agregar más pacientes según sea necesario...

        // Crear instancia de Coronavirus
        Coronavirus coronavirus = new Coronavirus("COVID-19", "Wuhan");

        // Agregar pacientes al coronavirus
        coronavirus.addPaciente('A', paciente1);
        coronavirus.addPaciente('B', paciente2);
        coronavirus.addPaciente('A', paciente3);
        // Agregar más pacientes según sea necesario...

        // Probar el método pacientesDeUnDoctor()
        coronavirus.pacientesDeUnDoctor(12345); // Mostrará los pacientes del médico1
        coronavirus.pacientesDeUnDoctor(54321); // Mostrará los pacientes del médico2
        coronavirus.pacientesDeUnDoctor(98765); // Mostrará los pacientes del médico3

        // Probar el método pacientesPorPeso() y pacientesPorEdad()
        coronavirus.pacientesPorPeso('A'); // Mostrará los pacientes de la cepa A ordenados por peso
        coronavirus.pacientesPorEdad('B'); // Mostrará los pacientes de la cepa B ordenados por edad

        // Probar el método darDeAltaPaciente()
        coronavirus.darDeAltaPaciente(paciente1); // Dar de alta al paciente1
        coronavirus.pacientesDeUnDoctor(12345); // Mostrará los pacientes del médico1 después de dar de alta al paciente1
    }
}
