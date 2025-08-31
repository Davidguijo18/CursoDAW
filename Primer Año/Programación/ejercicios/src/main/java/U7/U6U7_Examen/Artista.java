package U7.U6U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Artista implements Comparable<Artista>, Serializable {
    private String nombre;
    private String generoMusical;
    private String nacionalidad;
    private int identificadorArtista;
    private static int contadorIdentificadorArtista = 1;

    public Artista(String nombre, String generoMusical, String nacionalidad) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.nacionalidad = nacionalidad;
        identificadorArtista = contadorIdentificadorArtista++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getIdentificadorArtista() {
        return identificadorArtista;
    }

    public void setIdentificadorArtista(int identificadorArtista) {
        this.identificadorArtista = identificadorArtista;
    }

    public static int getContadorIdentificadorArtista() {
        return contadorIdentificadorArtista;
    }

    public static void setContadorIdentificadorArtista(int contadorIdentificadorArtista) {
        Artista.contadorIdentificadorArtista = contadorIdentificadorArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", generoMusical='" + generoMusical + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", identificadorArtista=" + identificadorArtista +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return identificadorArtista == artista.identificadorArtista && Objects.equals(nombre, artista.nombre) && Objects.equals(generoMusical, artista.generoMusical) && Objects.equals(nacionalidad, artista.nacionalidad);
    }

    //Ordenacion por nombre
    @Override
    public int compareTo(Artista artista) {
        return this.nombre.compareTo(artista.getNombre());
    }
}