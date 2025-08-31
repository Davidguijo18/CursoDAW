package U7.EjerciciosRehechos.Examen_2122_Manana;

public class Main {
    public static void main(String[] args) {
        Sae sae = new Sae();

        sae.addOferta(new Oferta(1, "Oferta 1", false));
        sae.addOferta(new Oferta(2, "Oferta 2", false));
        sae.addOferta(new Oferta(3, "Oferta 3", false));
        sae.addOferta(new Oferta(4, "Oferta 4", false));
        sae.addOferta(new Oferta(5, "Oferta 5", false));

        sae.addTrabajador(1, new Trabajador("11111111A", "Juan", "García", 30, "Ingeniero"));
        sae.addTrabajador(1, new Trabajador("22222222B", "María", "López", 25, "Técnico"));
        sae.addTrabajador(1, new Trabajador("33333333C", "Pedro", "Martínez", 35, "Administrativo"));
        sae.addTrabajador(2, new Trabajador("44444444D", "Ana", "Fernández", 28, "Ingeniero"));
        sae.addTrabajador(2, new Trabajador("55555555E", "Luis", "Rodríguez", 40, "Técnico"));
        sae.addTrabajador(2, new Trabajador("66666666F", "Elena", "Gómez", 32, "Administrativo"));
        sae.addTrabajador(3, new Trabajador("77777777G", "Mario", "Pérez", 27, "Ingeniero"));
        sae.addTrabajador(4, new Trabajador("88888888H", "Laura", "Sánchez", 29, "Técnico"));
        sae.addTrabajador(4, new Trabajador("99999999I", "Sara", "Gutiérrez", 33, "Administrativo"));
        sae.addTrabajador(5, new Trabajador("101010101J", "Javier", "Díaz", 31, "Ingeniero"));

        //sae.cargarDatos();

        sae.mostrarTrabajadores(1);
        System.out.println("\n-----------------------------------------------------------------------------------------------");

        sae.mostrarTrabajadoresXEdad(1);
        System.out.println("\n-----------------------------------------------------------------------------------------------");

        System.out.println("Cantidad de ofertas de trabajo en las que se ha inscrito el trabajador con DNI 11111111A: " + sae.cantidadOfertas("11111111A"));
        System.out.println("\n-----------------------------------------------------------------------------------------------");

        System.out.println("Ofertas de trabajo ordenadas por el número de trabajadores solicitantes:");
        sae.mostrarOfertas();
        System.out.println("\n-----------------------------------------------------------------------------------------------");

        sae.guardarDatos();
    }
}
