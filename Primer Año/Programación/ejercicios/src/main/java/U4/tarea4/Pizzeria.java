package U4.tarea4;

import java.util.Arrays;

public class Pizzeria {

    private Pedido[] pedido;

    public Pizzeria() {
        pedido = new Pedido[5];
    }

    public void mostrarPedidos() {
        for (Pedido value : pedido) {
            System.out.println(value + " ");
        }
    }

    public void anadirPedidos() {
        pedido = Arrays.copyOf(pedido, pedido.length + 1);
    }

    public void mostrarCantidadPedidos() {
        System.out.println("La cantidad de pedidos es de: " + pedido.length);
    }
}
