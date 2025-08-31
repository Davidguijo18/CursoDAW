package U9.EjerciciosRepaso.Entregable_2021;

public class Main {
    public static void main(String[] args) {
        Consultas consultas = new Consultas();
        Transacciones transacciones = new Transacciones();

        consultas.pagosCliente();
        consultas.infoPedido();
        consultas.datosJefe();

        System.out.println("\n-------------------------------------------------");
        System.out.println();

        transacciones.transaccion1();
        transacciones.transaccion2();

    }
}
