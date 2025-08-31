package U4.Entregable;

import java.util.Arrays;

public class Cantante {
    private String nombreReal;
    private String nombreArtistico;
    private int edad;
    private String ciudadOrigen;
    private Cancion[] cancion = new Cancion[0];
    private int indice = 0;

    public Cantante() {
    }

    public Cantante(String nombreReal, String nombreArtistico, int edad, String ciudadOrigen) {
        this.nombreReal = nombreReal;
        this.nombreArtistico = nombreArtistico;
        this.edad = edad;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Cancion[] getCancion() {
        return cancion;
    }

    public void setCancion(Cancion[] cancion) {
        this.cancion = cancion;
    }



    public void agregarCancion(Cancion canciones) {
        cancion = Arrays.copyOf(cancion, cancion.length + 1);
        cancion[indice] = canciones;
        indice++;
    }

    public void mostrarListaCanciones() {
        System.out.println("Lista de canciones del artista " + nombreArtistico + " : ");
        System.out.println(Arrays.toString(cancion));
        System.out.println();
    }

    public void eliminarCancion(Cancion canciones) {
        for (int i = 0; i < cancion.length;i++){

        }
    }

    public void mostrarDatosArtista() {
        System.out.println("Nombre real: " + nombreReal);
        System.out.println("Nombre artistico: " + nombreArtistico);
        System.out.println("Edad: " + edad + " anos");
        System.out.println("Ciudad de origen: "+ ciudadOrigen);
    }

    @Override
    public String toString() {
        return "Cantante{" +
                "nombreReal='" + nombreReal + '\'' +
                ", nombreArtistico='" + nombreArtistico + '\'' +
                ", edad=" + edad +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", cancion=" + Arrays.toString(cancion) +
                '}';
    }
}
