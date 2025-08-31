package U5.tarea2.Ejercicio2;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Cliente> {
    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getNombre().compareTo(cliente2.getNombre());
    }
}
