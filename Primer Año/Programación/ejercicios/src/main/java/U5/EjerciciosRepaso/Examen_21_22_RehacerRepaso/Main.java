package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

public class Main {
    public static void main(String[] args) {
        Chirigota chirigota1 = new Chirigota("Chirigota1", "Carlos", "Ruben", "Dario", "Tanga", 21, 123);
        Chirigota chirigota2 = new Chirigota("Dhirigota2", "Agustin", "Pancracio", "Julio", "Angel", 54, 187);
        Chirigota chirigota3 = new Chirigota("Bhirigota3", "Maria", "Juan Diego", "Manuel", "Cavernicola", 46, 175);
        Chirigota chirigota4 = new Chirigota("Ahirigota4", "Juan", "David", "Francisco", "Policia", 58, 545);

        COAC coac = new COAC();
        coac.inscribir_agrupacion(chirigota1);
        coac.inscribir_agrupacion(chirigota2);
        coac.inscribir_agrupacion(chirigota3);
        coac.inscribir_agrupacion(chirigota4);


        coac.ordenar_por_puntos();
        System.out.println();

        coac.ordenar_por_autor();
        System.out.println();

        coac.ordenar_por_nombre();
    }
}
