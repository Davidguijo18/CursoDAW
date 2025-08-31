package U7.EjerciciosRepaso.Examen_2122_Manana;

public class Main {
    public static void main(String[] args) {
        SAE sae = new SAE();

        //sae.cargarDatos();

        // Creo 5 ofertas de trabajo
        Oferta oferta1 = new Oferta(1, "Desarrollador de software", false);
        Oferta oferta2 = new Oferta(2, "Diseñador gráfico", false);
        Oferta oferta3 = new Oferta(3, "Contador", false);
        Oferta oferta4 = new Oferta(4, "Ingeniero civil", false);
        Oferta oferta5 = new Oferta(5, "Asistente administrativo", false);

        // Agrego las ofertas al sistema
        sae.addOferta(oferta1);
        sae.addOferta(oferta2);
        sae.addOferta(oferta3);
        sae.addOferta(oferta4);
        sae.addOferta(oferta5);

        // Creo 10 trabajadores
        Trabajador trabajador1 = new Trabajador("11111111A", "Juan", "González", 30, "Ingeniería");
        Trabajador trabajador2 = new Trabajador("22222222B", "María", "López", 25, "Diseño");
        Trabajador trabajador3 = new Trabajador("33333333C", "Pedro", "Martínez", 28, "Contabilidad");
        Trabajador trabajador4 = new Trabajador("44444444D", "Ana", "Sánchez", 35, "Informática");
        Trabajador trabajador5 = new Trabajador("55555555E", "Miguel", "Rodríguez", 27, "Administración");
        Trabajador trabajador6 = new Trabajador("66666666F", "Lucía", "García", 29, "Diseño");
        Trabajador trabajador7 = new Trabajador("77777777G", "Carlos", "Pérez", 32, "Ingeniería");
        Trabajador trabajador8 = new Trabajador("88888888H", "Elena", "Fernández", 26, "Contabilidad");
        Trabajador trabajador9 = new Trabajador("99999999I", "Pablo", "Díaz", 31, "Informática");
        Trabajador trabajador10 = new Trabajador("101010101J", "Sara", "Ruiz", 24, "Administración");

        // Inscribo los trabajadores en las ofertas
        sae.addTrabajador(1, trabajador1);
        sae.addTrabajador(1, trabajador2);
        sae.addTrabajador(1, trabajador3);
        sae.addTrabajador(2, trabajador4);
        sae.addTrabajador(2, trabajador5);
        sae.addTrabajador(3, trabajador6);
        sae.addTrabajador(3, trabajador7);
        sae.addTrabajador(4, trabajador8);
        sae.addTrabajador(4, trabajador9);
        sae.addTrabajador(5, trabajador10);

        // Muestro las ofertas de trabajo ordenadas por el número de trabajadores solicitantes
        System.out.println("Ofertas de trabajo ordenadas por el número de trabajadores solicitantes:");
        sae.mostrarOfertas();

        sae.guardarDatos();
    }
}


