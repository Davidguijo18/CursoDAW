package U5.EjerciciosRepaso.Entregable_2122_Manana;

import java.util.Arrays;

public abstract class Propiedad {
    protected int anoConstruccion;
    protected String direccion;
    protected int metrosCuadrados;

    public Propiedad(int anoConstruccion, String direccion, int metrosCuadrados) {
        this.anoConstruccion = anoConstruccion;
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getAnoConstruccion() {
        return anoConstruccion;
    }

    public void setAnoConstruccion(int anoConstruccion) {
        this.anoConstruccion = anoConstruccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public abstract void mostrarPropiedad();
}
