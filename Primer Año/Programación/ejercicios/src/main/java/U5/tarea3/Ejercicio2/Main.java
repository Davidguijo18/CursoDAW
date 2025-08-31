package U5.tarea3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ColaTabla cola = new ColaTabla(5);

        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        System.out.println("El primer elemento de la cola es: " + cola.primero());
        System.out.println("El último elemento de la cola es: " + cola.ultimo());
        System.out.println("El tamaño de la cola es: " + cola.tamano());

        cola.desencolar();

        System.out.println("El primer elemento de la cola después de desencolar es: " + cola.primero());
        System.out.println("El tamaño de la cola después de desencolar es: " + cola.tamano());
    }
}

