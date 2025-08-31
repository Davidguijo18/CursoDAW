package U4.Entregable;

public class Main {
    public static void main(String[] args) {

        Cantante cantante1 = new Cantante("Jose Luis", "Elvoces", 54, "Lora del rio");
        Cantante cantante2 = new Cantante("David", "Thegrefg", 34, "Murcia");
        Cantante cantante3 = new Cantante("Lebron James", "Lebron", 31, "La comarca");
        Cantante cantante4 = new Cantante("Papiro", "Ayuda", 74, "Avila");
        Cantante cantante5 = new Cantante("Chema", "Te has pasao", 18, "Como que 18 cantantes");
        Cantante cantante6 = new Cantante("Joaquin", "Bestis", 38, "Sevilla");
        Cantante cantante7 = new Cantante("Bad conejo", "Benito", 32, "Sacramento");
        Cantante cantante8 = new Cantante("David", "David", 19, "Soy ese");

        Cancion cancion1 = new Cancion("Hola me llamo Jose Luis", 230, cantante1, Cancion.Genero.NEOPERREO);
        Cancion cancion2 = new Cancion("Soy emo y que", 400, cantante1, Cancion.Genero.EMORAP);
        Cancion cancion3 = new Cancion("Chipi chipa", 238, cantante2, Cancion.Genero.TRAP);
        Cancion cancion4 = new Cancion("Venga", 434, cantante2, Cancion.Genero.NEOPERREO);
        Cancion cancion5 = new Cancion("AAAA", 126, cantante3, Cancion.Genero.EMORAP);
        Cancion cancion6 = new Cancion("Me duelen los dedos", 434, cantante3, Cancion.Genero.TRAP);
        Cancion cancion7 = new Cancion("OOOOO", 234, cantante4, Cancion.Genero.NEOPERREO);
        Cancion cancion8 = new Cancion("La vida es una lenteja", 412, cantante4, Cancion.Genero.EMORAP);
        Cancion cancion9 = new Cancion("Vengaaaa", 321, cantante5, Cancion.Genero.TRAP);
        Cancion cancion10 = new Cancion("Como tan muchaco", 123, cantante5, Cancion.Genero.NEOPERREO);
        Cancion cancion11 = new Cancion("Casi termino", 323, cantante6, Cancion.Genero.EMORAP);
        Cancion cancion12 = new Cancion("Venga queda poco", 123, cantante6, Cancion.Genero.TRAP);
        Cancion cancion13 = new Cancion("Come onnn", 127, cantante7, Cancion.Genero.NEOPERREO);
        Cancion cancion14 = new Cancion("Quedan solo 3", 236, cantante7, Cancion.Genero.EMORAP);
        Cancion cancion15 = new Cancion("Venga que ya termino", 954, cantante8, Cancion.Genero.TRAP);
        Cancion cancion16 = new Cancion("Termine", 343, cantante8, Cancion.Genero.NEOPERREO);

        Escenario escenario1 = new Escenario("Escenario", "Abril", 2343);
        Escenario escenario2 = new Escenario("Binario", "Murcia", 5734);
        Escenario escenario3 = new Escenario("Por favoorr", "Sevilla", 238);
        Escenario escenario4 = new Escenario("Chema esto es tortura", "Las termopidas", 43743);
        Escenario escenario5 = new Escenario("Escenario5", "Madrid", 84324);
        Escenario escenario6 = new Escenario("Escenario mas escenario que nunca", "Casa", 43892);
        Escenario escenario7 = new Escenario("AAAAAAAAA", "Canada", 4349324);
        Escenario escenario8 = new Escenario("Adios escenarios", "Ya esta", 43455);

        Concierto concierto1 = new Concierto("Concierto1");
        Concierto concierto2 = new Concierto("Concierto2");
        Concierto concierto3 = new Concierto("Concierto3");

        cantante1.agregarCancion(cancion1);
        cantante1.agregarCancion(cancion2);
        cantante2.agregarCancion(cancion3);
        cantante2.agregarCancion(cancion4);
        cantante3.agregarCancion(cancion5);
        cantante3.agregarCancion(cancion6);
        cantante4.agregarCancion(cancion7);
        cantante4.agregarCancion(cancion8);
        cantante5.agregarCancion(cancion9);
        cantante5.agregarCancion(cancion10);
        cantante6.agregarCancion(cancion11);
        cantante6.agregarCancion(cancion12);
        cantante7.agregarCancion(cancion13);
        cantante7.agregarCancion(cancion14);
        cantante8.agregarCancion(cancion15);
        cantante8.agregarCancion(cancion16);

        escenario1.agregarCantante(cantante1);
        escenario1.agregarCantante(cantante2);
        escenario2.agregarCantante(cantante3);
        escenario2.agregarCantante(cantante6);
        escenario3.agregarCantante(cantante2);
        escenario3.agregarCantante(cantante8);
        escenario4.agregarCantante(cantante3);
        escenario4.agregarCantante(cantante1);
        escenario5.agregarCantante(cantante7);
        escenario5.agregarCantante(cantante6);
        escenario6.agregarCantante(cantante7);
        escenario6.agregarCantante(cantante4);
        escenario7.agregarCantante(cantante5);
        escenario7.agregarCantante(cantante4);
        escenario8.agregarCantante(cantante5);
        escenario8.agregarCantante(cantante8);

        concierto1.agregarEscenario(escenario1);
        concierto1.agregarEscenario(escenario2);
        concierto1.agregarEscenario(escenario3);
        concierto2.agregarEscenario(escenario4);
        concierto2.agregarEscenario(escenario5);
        concierto2.agregarEscenario(escenario6);
        concierto3.agregarEscenario(escenario7);
        concierto3.agregarEscenario(escenario8);
        concierto3.agregarEscenario(escenario1);

        concierto1.setFecha("12/5/2024");
        concierto2.setFecha("04/9/2024");
        concierto3.setFecha("30/11/2024");

        Festival festival = new Festival();
        festival.agregarConciertos(concierto1);
        festival.agregarConciertos(concierto2);
        festival.agregarConciertos(concierto3);

        cancion6.mostrarInformacion();
        System.out.println();
        cantante3.mostrarListaCanciones();
        System.out.println();
        cantante3.mostrarDatosArtista();
        System.out.println();
        escenario1.mostrarInformacionEscenario();
        System.out.println();
        escenario1.mostrarListaCantantes();
        System.out.println();
        concierto1.mostrarCartelera();
    }
}
