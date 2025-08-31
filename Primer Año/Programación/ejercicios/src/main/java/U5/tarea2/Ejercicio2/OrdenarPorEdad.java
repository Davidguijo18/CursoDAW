package U5.tarea2.Ejercicio2;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Cliente> {
    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        if (cliente1.getEdad() < cliente2.getEdad()) {
            return 1;
        } else if (cliente1.getEdad() > cliente2.getEdad()) {
            return -1;
        }
        return 0;
    }
}
