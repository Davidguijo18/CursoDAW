package U7.EjerciciosRepaso.Examen_1920_Tarde;

import java.io.Serializable;

public class Paciente implements Serializable {
    private String nombrePaciente;
    private int edad;
    private double peso;
    private boolean tieneTodasLasVacunas;
    private Medico medico;
    private Character cepa;

    public Paciente(String nombrePaciente, int edad, double peso, boolean tieneTodasLasVacunas, Medico medico, Character cepa) {
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        this.peso = peso;
        this.tieneTodasLasVacunas = tieneTodasLasVacunas;
        this.medico = medico;
        this.cepa = cepa;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneTodasLasVacunas() {
        return tieneTodasLasVacunas;
    }

    public void setTieneTodasLasVacunas(boolean tieneTodasLasVacunas) {
        this.tieneTodasLasVacunas = tieneTodasLasVacunas;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Character getCepa() {
        return cepa;
    }

    public void setCepa(Character cepa) {
        this.cepa = cepa;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombrePaciente='" + nombrePaciente + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", tieneTodasLasVacunas=" + tieneTodasLasVacunas +
                ", medico=" + medico +
                ", cepa=" + cepa +
                '}';
    }
}
