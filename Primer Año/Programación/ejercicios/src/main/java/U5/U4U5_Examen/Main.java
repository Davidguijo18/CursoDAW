package U5.U4U5_Examen;

public class Main {
    public static void main(String[] args) {

        int numElementos;
        boolean seElimino;

        //Creo objetos
        Libro libro1 = new Libro("Como invocar a goku", "Damian Reyes", 2019, "Santillana", "5343|3435", 9832);
        Libro libro2 = new Libro("Aprende a programar", "Chema", 2023, "Cuetara", "9413|9754", 210);
        Libro libro3 = new Libro("Pelagambas profesional", "Fernando Carrillo", 2009, "Hacendado", "9126|7593", 180);

        Pelicula pelicula1 = new Pelicula("Star Wars: La Venganza De Los Sith", "George Lucas", 2003, 160, "LucasFilm", "EEUU");
        Pelicula pelicula2 = new Pelicula("Las trepindantes aventuras de Joaquin", "Real Betis", 2021, 120, "NoSoyProductora", "Espana");
        Pelicula pelicula3 = new Pelicula("Estoy nervioso", "Yo", 2024, 170, "Yo mismo", "IES Velazquez");

        Serie serie1 = new Serie("The mandalorian", "Son muchos", 3, 2019);
        Serie serie2 = new Serie("Juego de tronos", "No me acuerdo", 10, 2004);
        Serie serie3 = new Serie("Pepa pig", "Pepa", 4353, 2009);


        //Realizo los metodos para hacer la comprobacion de su correcto funcionamiento
        serie1.anadirCapitulo("S01E01");
        serie1.anadirCapitulo("S01E02");
        serie1.anadirCapitulo("S01E03");
        serie1.anadirCapitulo("S01E4");
        serie1.anadirCapitulo("S02E01");
        serie1.anadirCapitulo("S02E02");

        //Muestro la serie con todos sus capitulos
        System.out.println(serie1);
        System.out.println();

        //Elimino un capitulo y vuelvo a mostrar sus capitulos
        seElimino = serie1.eliminarCapitulo("S01E01");
        //Si se muestra true por pantalla es porque se ha eliminado
        System.out.println(seElimino);
        System.out.println(serie1);
        System.out.println();

        //Muestro el metodo dado_por_finalizado de pelicula, libro y serie y los metodos play, pause y stop de serie y libro
        libro1.dado_por_finalizado();

        pelicula1.dado_por_finalizado();
        pelicula1.play();
        pelicula2.pause();
        pelicula3.stop();

        serie1.dado_por_finalizado();
        serie1.play();
        serie1.pause();
        serie1.stop();

        System.out.println();

        //Creo un catalogo y le anado elementos
        Catalogo catalogo = new Catalogo();
        catalogo.add_multimedia(pelicula1);
        catalogo.add_multimedia(pelicula2);
        catalogo.add_multimedia(pelicula3);

        //Muestro los elementos con sus respectivas ordenaciones
        catalogo.ordenar_por_anyo();
        catalogo.ordenar_por_id();
        catalogo.ordenar_por_titulo();

        //Muestro el numero de elementos
        numElementos = catalogo.numero_elementos();
        System.out.println("Hay un total de " + numElementos + " elementos");
        System.out.println();

        //Anado mas elementos al catalogo
        catalogo.add_multimedia(serie2);
        catalogo.add_multimedia(serie3);
        catalogo.add_multimedia(libro1);
        catalogo.add_multimedia(libro2);
        catalogo.add_multimedia(libro3);

        //Vuelvo a mostrar los elementos con sus respectivas ordenaciones
        catalogo.ordenar_por_anyo();
        catalogo.ordenar_por_id();
        catalogo.ordenar_por_titulo();

        //Vuelo a mostrar el numero de elementos
        numElementos = catalogo.numero_elementos();
        System.out.println("Hay un total de " + numElementos + " elementos");
        System.out.println();

        //Elimino elementos multimedia
        System.out.println("Comprobacion de eliminaciones : True --> eliminada | False --> no eliminada ");
        seElimino = catalogo.eliminar_multimedia(pelicula1);
        System.out.print(seElimino + " ");
        seElimino = catalogo.eliminar_multimedia(pelicula2);
        System.out.print(seElimino + " ");
        seElimino = catalogo.eliminar_multimedia(pelicula3);
        System.out.print(seElimino + " ");
        seElimino = catalogo.eliminar_multimedia(serie2);
        System.out.print(seElimino + " ");
        seElimino = catalogo.eliminar_multimedia(libro2);
        System.out.print(seElimino + " ");
        seElimino = catalogo.eliminar_multimedia(libro3);
        System.out.println(seElimino + " ");

        //Vuelvo a mostrar los elementos con sus respectivas ordenaciones
        System.out.println("\n");
        catalogo.ordenar_por_anyo();
        catalogo.ordenar_por_id();
        catalogo.ordenar_por_titulo();

        //Vuelvo a mostrar el numero de elementos
        numElementos = catalogo.numero_elementos();
        System.out.println("Hay un total de " + numElementos + " elementos");
        System.out.println();
    }
}
