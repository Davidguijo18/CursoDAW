package U4.Entregable;

import java.util.Arrays;

public class Escenario {
    private String nombreEscenario;
    private String ubicacion;
    private int capacidad;
    private Cantante[] cantante = new Cantante[0];
    private int indice = 0;

    public Escenario() {
    }

    public Escenario(String nombreEscenario, String ubicacion, int capacidad) {
        this.nombreEscenario = nombreEscenario;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Cantante[] getCantante() {
        return cantante;
    }

    public void setCantante(Cantante[] cantante) {
        this.cantante = cantante;
    }

    @Override
    public String toString() {
        return "Escenario{" +
                "nombreEscenario='" + nombreEscenario + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", cantante=" + Arrays.toString(cantante) +
                '}';
    }

    public void agregarCantante(Cantante cantantes) {
        cantante = Arrays.copyOf(cantante, cantante.length + 1);
        cantante[indice] = cantantes;
        indice++;
    }

    public void mostrarListaCantantes() {
        System.out.print("Los cantantes asociados al escenario son: ");
        for (int i = 0; i < cantante.length; i++) {
            System.out.print(cantante[i] + " ,");
        }
    }

    public void mostrarInformacionEscenario() {
        System.out.println("Nombre del escenario: " + nombreEscenario);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Capacidad: " + capacidad);
    }
}
