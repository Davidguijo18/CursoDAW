package U4.tarea4;

import java.util.Calendar;

public class Pedido {
    private Pizza pizza;
    private Calendar calendario = Calendar.getInstance();

    public Pedido() {
        pizza = new Pizza();
    }

    public void comprobarPizza() {
        pizza.mostrarInformacion();
    }

    public void obtenerHoraPedido() {
        String dia, mes, ano;

        ano = Integer.toString(calendario.get(Calendar.YEAR));
        mes = Integer.toString(calendario.get(Calendar.MONTH));
        dia = Integer.toString(calendario.get(Calendar.DATE));

        System.out.println("Fecha del pedido: " + dia + "/" + mes + "/" + ano);
    }

    public void realizarPedidoEstrella() {
        Ingrediente ingrediente1 = new Ingrediente("Jamon iberico", 15);
        Ingrediente ingrediente2 = new Ingrediente("Queso", 12);
        Pizza pizza1 = new Pizza();
        pizza1.anadirIngrediente(ingrediente1);
        pizza1.anadirIngrediente(ingrediente2);
        System.out.println("Se ha realizado el pedido estrella: Pizza de jamon iberico y queso");
    }
}
