package U7.EjerciciosRehechos.Examen_2122_Manana;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Sae {
    private Map<Integer, Oferta> mapaCodigoOferta = new HashMap<>();
    private ArrayList<Oferta> listaOfertas = new ArrayList<>();

    public Sae() {
    }

    public boolean addOferta(Oferta o) {
        if (mapaCodigoOferta.containsKey(o.getCodigoOferta())) {
            System.out.println("Ya existe una oferta con dicho codigo");
            return false;
        } else {
            mapaCodigoOferta.put(o.getCodigoOferta(), o);
            listaOfertas.add(o);
            return true;
        }
    }

    public boolean addTrabajador(Integer codigo, Trabajador t) {
        if (mapaCodigoOferta.containsKey(codigo)) {
            Oferta oferta = mapaCodigoOferta.get(codigo);
            TreeSet<Trabajador> listaTrabajadores = oferta.getTrabajadoresSolicitantes();
            if (listaTrabajadores.contains(t)) {
                System.out.println("Este trabajador ya esta en la lista");
            } else {
                listaTrabajadores.add(t);
                oferta.setTrabajadoresSolicitantes(listaTrabajadores);
                mapaCodigoOferta.put(codigo, oferta);
                return true;
            }
        } else {
            System.out.println("No existe ninguna oferta con dicho codigo");
        }
        return false;
    }

    public boolean removeTrabajador(Integer codigo, Trabajador t) {
        if (mapaCodigoOferta.containsKey(codigo)) {
            Oferta oferta = mapaCodigoOferta.get(codigo);
            TreeSet<Trabajador> listaTrabajadores = oferta.getTrabajadoresSolicitantes();
            if (listaTrabajadores.contains(t)) {
                listaTrabajadores.remove(t);
                oferta.setTrabajadoresSolicitantes(listaTrabajadores);
                mapaCodigoOferta.put(codigo, oferta);
                return true;
            } else {
                System.out.println("Este trabajador no se encuentra en la lista");
            }
        } else {
            System.out.println("No existe ninguna oferta con dicho codigo");
        }
        return false;
    }

    public void mostrarTrabajadores(Integer codigo) {
        if (mapaCodigoOferta.containsKey(codigo)) {
            Oferta oferta = mapaCodigoOferta.get(codigo);
            TreeSet<Trabajador> listaTrabajadores = oferta.getTrabajadoresSolicitantes();

            if (listaTrabajadores.isEmpty()) {
                System.out.println("La lista no contiene ningun trabajador");
            } else {
                System.out.println("Lista de trabajadores: ");
                System.out.println(listaTrabajadores);
            }
        } else {
            System.out.println("No existe ninguna oferta con dicho codigo");
        }
    }

    public void mostrarTrabajadoresXEdad(Integer codigo) {
        if (mapaCodigoOferta.containsKey(codigo)) {
            Oferta oferta = mapaCodigoOferta.get(codigo);
            ArrayList<Trabajador> listaTrabajadores = new ArrayList<>(oferta.getTrabajadoresSolicitantes());
            if (listaTrabajadores.isEmpty()) {
                System.out.println("La lista no contiene ningún trabajador");
            } else {
                listaTrabajadores.sort(new OrdenarTrabajadoresPorEdad());
                System.out.println("Trabajadores de la oferta " + codigo + " ordenados por edad:");
                for (Trabajador trabajador : listaTrabajadores) {
                    System.out.println(trabajador);
                }
            }
        } else {
            System.out.println("No existe ninguna oferta con dicho código");
        }
    }


    public int cantidadOfertas(String dni) {
        int cantidadOfertasInscritas = 0;
        for (Oferta o : listaOfertas) {
            for (Trabajador t : o.getTrabajadoresSolicitantes()) {
                if (t.getDni().equalsIgnoreCase(dni)) {
                    cantidadOfertasInscritas++;
                }
            }
        }
        return cantidadOfertasInscritas;
    }

    public void mostrarOfertas() {
        listaOfertas.sort(new OrdenarOfertasPorNumSolicitantes());

        for (Oferta o : listaOfertas) {
            System.out.println("Codigo de oferta: " + o.getCodigoOferta());
            System.out.println("Descripcion: " + o.getDescripcion());
            if (o.isOfertaCubierta()) {
                System.out.println("La oferta esta cubierta");
            } else {
                System.out.println("La oferta no esta cubierta");
            }
            System.out.println();
        }
    }

    public void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sae.dat"))) {
            oos.writeObject(listaOfertas);
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero " + e.getMessage());
        }
    }

    public void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sae.dat"))) {
            listaOfertas = (ArrayList<Oferta>) ois.readObject();

            for (Oferta o : listaOfertas) {
                mapaCodigoOferta.put(o.getCodigoOferta(), o);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el fichero " + e.getMessage());
        }
    }
}
