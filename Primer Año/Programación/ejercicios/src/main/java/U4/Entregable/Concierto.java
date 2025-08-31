package U4.Entregable;

import java.util.Arrays;

public class Concierto {
    private String nombreConcierto;
    private String fecha;
    private Escenario[] escenarios = new Escenario[0];

    private static String ORGANIZADOR = "Nadie";
    private int indice = 0;

    public Concierto() {
    }

    public Concierto(String nombreConcierto) {
        this.nombreConcierto = nombreConcierto;
    }

    public String getNombreConcierto() {
        return nombreConcierto;
    }

    public void setNombreConcierto(String nombreConcierto) {
        this.nombreConcierto = nombreConcierto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Escenario[] getEscenarios() {
        return escenarios;
    }

    public void setEscenarios(Escenario[] escenarios) {
        this.escenarios = escenarios;
    }

    public String getORGANIZADOR() {
        return ORGANIZADOR;
    }

    @Override
    public String toString() {
        return "Concierto{" +
                "nombreConcierto='" + nombreConcierto + '\'' +
                ", fecha='" + fecha + '\'' +
                ", escenarios=" + Arrays.toString(escenarios) +
                ", ORGANIZADOR='" + ORGANIZADOR + '\'' +
                '}';
    }

    public void configurarFecha(String dia, String mes, String ano) {
        System.out.println("Concierto configurado. Fecha: " + dia + "/" + mes + "/" + ano);
    }

    public void agregarEscenario(Escenario escenario) {
        escenarios = Arrays.copyOf(escenarios, escenarios.length + 1);
        escenarios[indice] = escenario;
        indice++;
    }

    public void mostrarCartelera() {
        System.out.println("Nombre del concierto: " + nombreConcierto);
        System.out.println("Fecha del concierto: " + fecha);
        System.out.println("Organizador:  " + ORGANIZADOR);
        System.out.print("Escenarios: ");
        for (int i = 0; i < escenarios.length; i++) {
            System.out.print(escenarios[i] + " ,");
        }
    }
}
