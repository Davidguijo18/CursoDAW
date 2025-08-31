package U5.tarea1.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Etiqueta etiqueta = new Etiqueta("Jose Luis", "Ave del Paraiso N4");
        Caja caja = new Caja(21.32, 32.54, 26.43, etiqueta);

        double volumen = caja.getVolumen();
        System.out.println("El volumen de la caja es: " + volumen);
        System.out.println(caja);
    }
}
