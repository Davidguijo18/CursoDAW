package U7.tarea2.Ejercicio15;

import java.util.TreeSet;

public class Ejercicio15 {
    public static void main(String[] args) {
        ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada<>(new EnterosCrecientes());

        listaOrdenada.insertarOrdenado(8);
        listaOrdenada.insertarOrdenado(1);
        listaOrdenada.insertarOrdenado(3);

        System.out.println(listaOrdenada);
    }
}
