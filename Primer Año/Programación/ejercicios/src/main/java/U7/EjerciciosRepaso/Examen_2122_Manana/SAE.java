package U7.EjerciciosRepaso.Examen_2122_Manana;

import java.io.*;
import java.util.*;

public class SAE {

    private Map<Integer, Oferta> mapaCodigoOferta = new HashMap<>();
    private ArrayList<Oferta> listaOfertas = new ArrayList<>();

    public boolean addOferta(Oferta oferta) {
        if (mapaCodigoOferta.containsKey(oferta.getCodigoOferta())) {
            System.out.println("Ya existe una oferta con dicho codigo");
            return false;
        } else {
            System.out.println("Se ha anadido la oferta");
            mapaCodigoOferta.put(oferta.getCodigoOferta(), oferta);
            listaOfertas.add(oferta);
            return true;
        }
    }

    public boolean addTrabajador(Integer codigo, Trabajador trabajador) {
        if (mapaCodigoOferta.containsKey(codigo)) {
            Oferta oferta = mapaCodigoOferta.get(codigo);

            if (oferta.getListaTrabajadores().contains(trabajador)) {
                System.out.println("Este trabajador ya estaba inscrito");
                return false;
            } else {
                System.out.println("Se ha anadido al trabajador");
                oferta.addTrabajador(trabajador);
                mapaCodigoOferta.put(codigo, oferta);
                return true;
            }

        } else {
            System.out.println("No existe ninguna oferta con dicho codigo");
            return false;
        }
    }

    public boolean removeTrabajador(Integer codigo, Trabajador t) {
        if (mapaCodigoOferta.containsKey(codigo)) {
            Oferta oferta = mapaCodigoOferta.get(codigo);

            if (oferta.getListaTrabajadores().contains(t)) {
                System.out.println("Este trabajador ya esta inscrito");
                return false;
            } else {
                Iterator<Trabajador> iterator = oferta.getListaTrabajadores().iterator();
                while (iterator.hasNext()) {
                    Trabajador trabajador = iterator.next();
                    if (t.equals(trabajador)) {
                        iterator.remove();
                    }
                }
                System.out.println("El trabajador ha sido eliminado");
                return true;
            }
        } else {
            System.out.println("No existe ninguna oferta con dicho codigo");
            return false;
        }
    }

    public void mostrarTrabajadores(Integer codigo) {
        if (mapaCodigoOferta.containsKey(codigo)) {
            Oferta oferta = mapaCodigoOferta.get(codigo);

            if (oferta.getListaTrabajadores().isEmpty()) {
                System.out.println("No existen trabadores inscritos en esta oferta");
            } else {
                ArrayList<Trabajador> listaTrabajadores = new ArrayList<>(oferta.getListaTrabajadores());
                listaTrabajadores.sort(new OrdenarTrabajadorPorApellidosNombre());

                System.out.println(listaTrabajadores);

            }
        } else {
            System.out.println("No existe ninguna oferta con dicho codigo");
        }
    }

    public void mostrarTrabajadoresXEdad(Integer codigo) {
        if (mapaCodigoOferta.containsKey(codigo)) {
            Oferta oferta = mapaCodigoOferta.get(codigo);

            if (oferta.getListaTrabajadores().isEmpty()) {
                System.out.println("No existen trabadores inscritos en esta oferta");
            } else {
                ArrayList<Trabajador> listaTrabajadores = new ArrayList<>(oferta.getListaTrabajadores());
                listaTrabajadores.sort(new OrdenarTrabajadorPorEdadNombre());

                System.out.println(listaTrabajadores);
            }
        } else {
            System.out.println("No existe ninguna oferta con dicho codigo");
        }
    }

    public int cantidadOfertas(String dni) {
        int numOfertas = 0;
        for (Oferta o : listaOfertas) {
            for (Trabajador t : o.getListaTrabajadores()) {
                if (t.getDni().equalsIgnoreCase(dni)) {
                    numOfertas++;
                }
            }
        }
        return numOfertas;
    }

    public void mostrarOfertas() {
        listaOfertas.sort(new OrdenarOfertaPorNumTrabajadores());
        for (Oferta oferta : listaOfertas) {
            System.out.println("Código: " + oferta.getCodigoOferta());
            System.out.println("Descripción: " + oferta.getDescripcionOferta());
            System.out.println("Cubierta: " + (oferta.isEstaCubierta() ? "Sí" : "No"));
            System.out.println("Número de trabajadores solicitantes: " + oferta.getListaTrabajadores().size());
            System.out.println("------------------------");
        }
    }

    public void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sae.dat"))) {
            oos.writeObject(listaOfertas);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo (" + e.getMessage() + ")");
        }
    }

    public void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sae.dat"))) {
            listaOfertas = (ArrayList<Oferta>) ois.readObject();

            for (Oferta o : listaOfertas) {
                Integer codigo = o.getCodigoOferta();

                if (!mapaCodigoOferta.containsKey(codigo)) {
                    mapaCodigoOferta.put(codigo, o);
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error al cargar el archivo (" + ex.getMessage() + ")");
        }
    }
}