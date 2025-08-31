package U7.EjerciciosRepaso.Ejercicio_Pre_Entregable;

public class Main {
    public static void main(String[] args) {
        // Crear coordenadas
        Coordenadas coordenadas = new Coordenadas(40, -3);

        // Crear estación meteorológica
        EstacionMeteorologica estacion = new EstacionMeteorologica("datos.dat", coordenadas);

        // Crear mediciones
        Medicion medicion1 = new Medicion(20, 60, 1010);
        Medicion medicion2 = new Medicion(25, 55, 1015);
        Medicion medicion3 = new Medicion(18, 70, 1005);

        // Añadir mediciones a la estación
        estacion.addMedicion(medicion1);
        estacion.addMedicion(medicion2);
        estacion.addMedicion(medicion3);

        // Ordenar mediciones por temperaturas ascendentes
        estacion.ordenaTemperaturasAsc();
        System.out.println("Mediciones ordenadas por temperaturas ascendentes:");
        for (Medicion medicion : estacion.getListaMediciones()) {
            System.out.println(medicion);
        }

        // Ordenar mediciones por humedades descendentes
        estacion.ordenaHumedadesDesc();
        System.out.println("\nMediciones ordenadas por humedades descendentes:");
        for (Medicion medicion : estacion.getListaMediciones()) {
            System.out.println(medicion);
        }

        // Encontrar medicion con presion máxima
        Medicion presionMaxima = estacion.presionMaxima();

        // Buscar una medición existente
        System.out.println("\n¿La medición 1 está en la lista? " + estacion.buscaMedicion(medicion1));

        // Buscar una medición inexistente
        Medicion medicionInexistente = new Medicion(30, 50, 1000);
        System.out.println("¿La medición inexistente está en la lista? " + estacion.buscaMedicion(medicionInexistente));

        // Guardar mediciones en un fichero
        estacion.guardarFichero("nuevas_mediciones.dat");
    }
}
