package U5.tarea3.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Conjunto conjunto1 = new Conjunto(5);

        conjunto1.insertar(10);
        conjunto1.insertar(20);
        conjunto1.insertar(30);
        conjunto1.insertar(40);
        conjunto1.insertar(50);

        System.out.println("Conjunto 1: " + conjunto1);

        System.out.println("¿El conjunto contiene el número 30? " + conjunto1.contiene(30));
        System.out.println("¿El conjunto contiene el número 60? " + conjunto1.contiene(60));

        Conjunto conjunto2 = new Conjunto();
        conjunto2.insertar(30);
        conjunto2.insertar(40);
        conjunto2.insertar(60);
        conjunto2.insertar(70);

        System.out.println("Conjunto 2: " + conjunto2);

        conjunto1.agregar(conjunto2);

        System.out.println("Conjunto 1 después de agregar los elementos del conjunto 2: " + conjunto1);

        conjunto1.eliminar(20);

        System.out.println("Conjunto 1 después de eliminar el número 20: " + conjunto1);

        conjunto1.eliminar(conjunto2);

        System.out.println("Conjunto 1 después de eliminar los elementos del conjunto 2: " + conjunto1);

        System.out.println("Número de elementos en el conjunto 1: " + conjunto1.tamano());
    }
}
