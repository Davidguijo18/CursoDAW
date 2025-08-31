package U7.U6U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Caseta implements Comparable<Caseta>, Serializable {
    private String nombre;
    private String ubicacion;
    private double tamano;
    private int identificador;
    private static int contadorIdentificador = 1;

    public Caseta(String nombre, String ubicacion, double tamano) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        identificador = contadorIdentificador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getContadorIdentificador() {
        return contadorIdentificador;
    }

    public void setContadorIdentificador(int contadorIdentificador) {
        Caseta.contadorIdentificador = contadorIdentificador;
    }

    @Override
    public String toString() {
        return "Caseta{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", tamano=" + tamano +
                ", identificador=" + identificador +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caseta caseta = (Caseta) o;
        return Double.compare(tamano, caseta.tamano) == 0 && identificador == caseta.identificador && Objects.equals(nombre, caseta.nombre) && Objects.equals(ubicacion, caseta.ubicacion);
    }

    //Ordenacion por nombre
    @Override
    public int compareTo(Caseta caseta) {
        return this.nombre.compareTo(caseta.getNombre());
    }
}
