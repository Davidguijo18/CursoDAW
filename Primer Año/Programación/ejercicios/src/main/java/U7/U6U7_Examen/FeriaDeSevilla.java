package U7.U6U7_Examen;

import java.io.*;
import java.util.*;

public class FeriaDeSevilla {
    private Map<String, Caseta> buscarCasetaPorNombre = new HashMap<>();
    private Map<String, Artista> buscarArtistaPorNombre = new HashMap<>();
    private Map<Caseta, ArrayList<Artista>> artistasEnCaseta = new HashMap<>();
    private Map<Artista, ArrayList<Caseta>> casetasConArtista = new HashMap<>();

    public FeriaDeSevilla() {
    }

    public void addActuacion(Caseta c, Artista a) {
        /* En este metodo se que no tengo puesto las comprobaciones de "Este artista ya existe" o  "Esta caseta ya existe",
        ya que, por limpieza de codigo he decidido que es mejor idea no ponerlo, ya que en el main, cuando este añadiendo
        actuaciones, voy a estar repitiendo artistas y casetas, entonces va a aparecer constantemente que la caseta o
        artista ya han sido añadidos. Asi que lo que hace es que si esa caseta o artista no existen pues los añade. Pero
        no va repitiendo constantemente que dichos artistas o casetas ya existen*/

        //Añado el artista siempre y cuando no este en el mapa
        if (!buscarArtistaPorNombre.containsKey(a.getNombre())) {
            buscarArtistaPorNombre.put(a.getNombre(), a);
        }

        //Añado la caseta siempre y cuando no este en el mapa
        if (!buscarCasetaPorNombre.containsKey(c.getNombre())) {
            buscarCasetaPorNombre.put(c.getNombre(), c);
        }

        //Compruebo si existe, y si no lo creo. Posteriormente lo añado
        if (!artistasEnCaseta.containsKey(c)) {
            artistasEnCaseta.put(c, new ArrayList<>());
        }

        ArrayList<Artista> listaArtistas = artistasEnCaseta.get(c);
        listaArtistas.add(a);
        artistasEnCaseta.put(c, listaArtistas);

        //Compruebo si existe, y si no lo creo. Posteriormente lo añado
        if (!casetasConArtista.containsKey(a)) {
            casetasConArtista.put(a, new ArrayList<>());
        }

        ArrayList<Caseta> listaCasetas = casetasConArtista.get(a);
        listaCasetas.add(c);
        casetasConArtista.put(a, listaCasetas);
    }


    //Este metodo me devolvera una lista de artistas dada una caseta (Pasada por parametro)
    public List<Artista> getArtistas(Caseta c) {
        ArrayList<Artista> listaArtistas = artistasEnCaseta.get(c);
        //Ordenacion del array por nombre
        Collections.sort(listaArtistas);

        return listaArtistas;
    }

    //Este metodo me devolvera una lista de casetas dado un artista (Pasada por parametro)
    public List<Caseta> getCasetas(Artista a) {
        ArrayList<Caseta> listaCasetas = casetasConArtista.get(a);
        //Ordenacion del array por nombre
        Collections.sort(listaCasetas);

        return listaCasetas;
    }

    //Este metodo devuelve un objeto de tipo Caseta dado un nombre introducido por parametro
    public Caseta getCaseta(String nombre) {
        Caseta caseta = null;
        if (!buscarCasetaPorNombre.containsKey(nombre)) {
            System.out.println("No existe ninguna caseta con dicho nombre");
        } else {
            caseta = buscarCasetaPorNombre.get(nombre);
        }
        return caseta;
    }

    public void removeCaseta(String nombre) {
        if (buscarCasetaPorNombre.containsKey(nombre)) {
            Caseta caseta = buscarCasetaPorNombre.get(nombre);

            ArrayList<Artista> listaArtistas = artistasEnCaseta.get(caseta);
            artistasEnCaseta.remove(caseta, listaArtistas);

            buscarCasetaPorNombre.remove(nombre, caseta);

            System.out.println("Se ha eliminado la caseta: " + nombre);
        } else {
            System.out.println("No se ha encontrado la caseta con dicho nombre");
        }
    }

    //Este metodo devuelve un objeto de tipo Artista dado un nombre introducido por parametro
    public Artista getArtista(String nombreArtistico) {
        Artista artista = null;
        if (!buscarArtistaPorNombre.containsKey(nombreArtistico)) {
            System.out.println("No existe ningun artista con dicho nombre");
        } else {
            artista = buscarArtistaPorNombre.get(nombreArtistico);
        }
        return artista;
    }

    //Este metodo se encarga de guardar el fichero
    //En mi caso he decidido crear un ArrayList de tipo Map y añadirlo todos los mapas en el
    public void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("feriasevilla.dat"))) {
            ArrayList<Map> guardarMapa = new ArrayList<>();
            guardarMapa.add(buscarArtistaPorNombre);
            guardarMapa.add(buscarCasetaPorNombre);
            guardarMapa.add(casetasConArtista);
            guardarMapa.add(artistasEnCaseta);

            oos.writeObject(guardarMapa);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    //Este metodo se encarga de cargar el fichero
    //Ya que en el metodo de guardar lo hice introduciendo los mapas en un ArrayList, en este metodo de cargar datos
    //lo que hago es asignar los respectivos mapas con el indice correspodiente del ArrayList en el que habia almacenado esos mismos mapas
    public void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("feriasevilla.dat"))) {
            ArrayList<Map> cargarMapa = (ArrayList<Map>) ois.readObject();

            buscarArtistaPorNombre = cargarMapa.get(0);
            buscarCasetaPorNombre = cargarMapa.get(1);
            casetasConArtista = cargarMapa.get(2);
            artistasEnCaseta = cargarMapa.get(3);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }
}
