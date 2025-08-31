package U5.EjerciciosRepaso.Examen_21_22;

public class Main {
    public static void main(String[] args) {
        Coro coro1 = new Coro("Coro1", "Autor1", "AutorMusica1", "AutorLetras1", "Disfraz1", 10, 5, 100);
        Comparsa comparsa1 = new Comparsa("Comparsa1", "Autor2", "AutorMusica2", "AutorLetras2", "Disfraz2", "Atrezzo1", 120);
        Chirigota chirigota1 = new Chirigota("Chirigota1", "Autor3", "AutorMusica3", "AutorLetras3", "Disfraz3", 8, 90);
        Cuarteto cuarteto1 = new Cuarteto("Cuarteto1", "Autor4", "AutorMusica4", "AutorLetras4", "Disfraz4", 4, 80);
        Romancero romancero1 = new Romancero("Romancero1", "Autor5", "AutorMusica5", "AutorLetras5", "Disfraz5", "Cartelon1");

        Integrante integrante1 = new Integrante(1, "Integrante1", 30, "Localidad1");
        Integrante integrante2 = new Integrante(2, "Integrante2", 25, "Localidad2");

        coro1.insertar_integrante(integrante1);
        comparsa1.insertar_integrante(integrante2);

        COAC coac = new COAC();

        coac.inscribir_agrupacion(coro1);
        coac.inscribir_agrupacion(comparsa1);
        coac.inscribir_agrupacion(chirigota1);
        coac.inscribir_agrupacion(cuarteto1);

        coac.eliminar_agrupacion(cuarteto1);

        coac.ordenar_por_puntos();
        coac.mostrarAgrupaciones();

        System.out.println();
        coac.ordenar_por_nombre();
        coac.mostrarAgrupaciones();

        System.out.println();
        coac.ordenar_por_autor();
        coac.mostrarAgrupaciones();

        System.out.println("Número total de agrupaciones oficiales creadas: " + coac.numeroAgrupacionesOficiales());
    }
}
