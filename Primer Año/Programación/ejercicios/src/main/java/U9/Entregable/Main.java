package U9.Entregable;

public class Main {
    public static void main(String[] args) {
        Consultas consultas = new Consultas();
        Transacciones transacciones = new Transacciones();

        System.out.println("-------------------- CONSULTAS --------------------");
        System.out.println();

        consultas.empleadosOficinaMayor();
        System.out.println("\n\n\n");

        consultas.productosNoVendidos();
        System.out.println("\n\n\n");

        consultas.informeCategoria();

        System.out.println("\n\n-------------------- TRASACCIONES --------------------");
        System.out.println();

        transacciones.transaccion1();

        System.out.println("\n\n\n\n");

        transacciones.transaccion2();
    }
}
