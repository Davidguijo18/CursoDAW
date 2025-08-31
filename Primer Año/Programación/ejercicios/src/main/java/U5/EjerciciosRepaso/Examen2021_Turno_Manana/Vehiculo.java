package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

public abstract class Vehiculo {
    private String matricula;
    private int cargaMaxima;
    private Conductor conductor;

    public Vehiculo(String matricula, int cargaMaxima, Conductor conductor) {
        this.matricula = matricula;
        this.cargaMaxima = cargaMaxima;
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public abstract void descargar();
}
