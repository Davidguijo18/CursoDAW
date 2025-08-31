package U7.EjerciciosRepaso.Ejercicio_Pre_Entregable;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class EstacionMeteorologica {
    private ArrayList<Medicion> listaMediciones = new ArrayList<>();
    private Coordenadas coordenadas;

    public EstacionMeteorologica(String nombreFichero, Coordenadas coordenadas) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreFichero))) {
            listaMediciones = (ArrayList<Medicion>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        this.coordenadas = coordenadas;
    }

    public ArrayList<Medicion> getListaMediciones() {
        return listaMediciones;
    }

    public void setListaMediciones(ArrayList<Medicion> listaMediciones) {
        this.listaMediciones = listaMediciones;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void addMedicion(Medicion medicion) {
        listaMediciones.add(medicion);
    }

    public void ordenaTemperaturasAsc() {
        Collections.sort(listaMediciones);
    }

    public void ordenaHumedadesDesc() {
        listaMediciones.sort(new OrdenarMedicionesPorHumedad());
    }

    public Medicion presionMaxima() {
        if (listaMediciones.isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            Medicion medicionMaxima = listaMediciones.get(0);
            for (Medicion m : listaMediciones) {
                if (medicionMaxima.getPresion() < m.getPresion()) {
                    medicionMaxima = m;
                }
            }
            System.out.println("La presion maxima es de la medicion " + medicionMaxima);
            return medicionMaxima;
        }
    }

    public boolean buscaMedicion(Medicion medicion) {
        if (listaMediciones.contains(medicion)) {
            return true;
        }
        return false;
    }

    public void guardarFichero(String nombreFichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            oos.writeObject(listaMediciones);
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }
}
