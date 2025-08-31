package U4.tarea2.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        PilaLista pila = new PilaLista();

        pila.apilar(1);
        pila.apilar(5);
        pila.apilar(2);
        pila.apilar(7);
        pila.apilar(5);
        pila.apilar(9);

        pila.mostrarPila();
        System.out.println();

        pila.desapilar();
        pila.desapilar();
        pila.desapilar();
        pila.desapilar();

        pila.mostrarPila();
        System.out.println();

        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(3);

        System.out.println();
        pila.mostrarPila();
        System.out.println();
        pila.cima();
    }
}
