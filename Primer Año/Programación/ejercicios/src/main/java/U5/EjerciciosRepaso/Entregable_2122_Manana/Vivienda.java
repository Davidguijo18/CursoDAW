package U5.EjerciciosRepaso.Entregable_2122_Manana;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Vivienda extends Propiedad implements MostrarPrecioVenta, Comparable<Vivienda> {

    private int numBanos;
    private int numHabitaciones;
    private int capacidadMaxima;
    private double precio;
    private Persona[] personas = new Persona[0];
    private int personasViviendo = 0;

    public Vivienda(int anoConstruccion, String direccion, int metrosCuadrados, int numBanos, int numHabitaciones, int capacidadMaxima, double precio) {
        super(anoConstruccion, direccion, metrosCuadrados);
        this.numBanos = numBanos;
        this.numHabitaciones = numHabitaciones;
        this.capacidadMaxima = capacidadMaxima;
        this.precio = precio;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPersonasViviendo() {
        return personasViviendo;
    }

    public void setPersonasViviendo(int personasViviendo) {
        this.personasViviendo = personasViviendo;
    }

    public void anadirPersona(Persona persona) {
        if (personasViviendo > capacidadMaxima) {
            System.out.println("En la vivienda no caben mas personas");
        } else if (personaRepetida(persona)) {
            System.out.println("Esta persona ya habita la vivienda");
        } else {
            personas = Arrays.copyOf(personas, personas.length + 1);
            personas[personasViviendo] = persona;
            personasViviendo++;
        }
    }

    public void quitarPersonas(Persona persona) {
        int posicion = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equals(persona)) {
                posicion = i;
            }
        }
        Persona[] copia_persona = Arrays.copyOfRange(personas, posicion + 1, personas.length);
        if (personas.length == personasViviendo) {
            personas = Arrays.copyOf(personas, personas.length - 1);
        }
        for (int i = 0; i < copia_persona.length; i++) {
            personas[posicion] = copia_persona[i];
            posicion++;
        }
        personasViviendo--;
    }

    public boolean personaRepetida(Persona persona) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una vivienda con capacidad máxima" + capacidadMaxima + " y valgo" + precio);
    }

    @Override
    public void mostrarPropiedad() {
        LocalDateTime locaDate = LocalDateTime.now();
        int horas = locaDate.getHour();
        int minutos = locaDate.getMinute();
        int segundos = locaDate.getSecond();
        System.out.println("Ano construccion: " + anoConstruccion);
        System.out.println("Direccion: " + direccion);
        System.out.println("Metros cuadrados: " + metrosCuadrados);
        System.out.println("Hora actual : " + horas + ":" + minutos + ":" + segundos);
        System.out.println("Numero de banos  : " + numBanos);
        System.out.println("Numero de habitaciones : " + numHabitaciones);
        System.out.println("Capacidad maxima de personas: " + capacidadMaxima);
        System.out.println("Personas viviendo : " + personasViviendo);
        System.out.println("Precio : " + precio);
    }

    @Override
    public int compareTo(Vivienda vivienda) {
        if (this.numHabitaciones > vivienda.numHabitaciones) {
            return 1;
        } else if (this.numHabitaciones < vivienda.numHabitaciones) {
            return -1;
        }
        return 0;
    }
}
