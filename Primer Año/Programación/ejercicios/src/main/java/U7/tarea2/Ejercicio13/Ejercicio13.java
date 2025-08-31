package U7.tarea2.Ejercicio13;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio13 {
    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        lista1.add(2);
        lista1.add(5);
        lista1.add(7);
        lista1.add(6);
        lista1.add(3);
        lista1.add(1);

        lista2.add(8);
        lista2.add(9);
        lista2.add(4);
        lista2.add(10);
        lista2.add(32);
        lista2.add(45);
        lista2.add(67);

        LinkedHashSet listaFinal = (LinkedHashSet) unionListas(lista1, lista2);
        System.out.println("Lista completa: " + listaFinal);
        System.out.println("Primera lista: " + lista1);
        System.out.println("Segunda lista: " + lista2);

    }

    public static Set unionListas(List lista1, List lista2) {
        LinkedHashSet<Integer> listaFinal = new LinkedHashSet<>();

        listaFinal.addAll(lista1);
        listaFinal.addAll(lista2);

        return listaFinal;
    }
}