package U5.Entregable;

public class Main {
    public static void main(String[] args) {
        LanzadoresTroncos lt1 = new LanzadoresTroncos("Joaquin", 32, LanzadoresTroncos.nombrePrueba.PINO);
        LanzadoresTroncos lt2 = new LanzadoresTroncos("Agustin", 43, LanzadoresTroncos.nombrePrueba.OLIVO);
        LanzadoresTroncos lt3 = new LanzadoresTroncos("Pablo", 27, LanzadoresTroncos.nombrePrueba.ROBLE);

        PeladoresGambas pg1 = new PeladoresGambas("Damian", 45, 76);
        PeladoresGambas pg2 = new PeladoresGambas("Ramon", 54, 90);
        PeladoresGambas pg3 = new PeladoresGambas("Martib", 65, 110);

        Baloncestitas b1 = new Baloncestitas("Chema", 18, 2.10);
        Baloncestitas b2 = new Baloncestitas("David", 20, 1.98);
        Baloncestitas b3 = new Baloncestitas("Ruben", 19, 2.01);

        Baloncesto baloncesto = new Baloncesto("Baloncesto", "Pabellon Maria,", 3);
        LanzaTroncosPelaos lanzaTroncosPelaos = new LanzaTroncosPelaos("LanzaTroncosPelaos", "Pabellon El Tronquito", 2);
        PeladoDeGambas peladoDeGambas = new PeladoDeGambas("PeladoDeGambas", "Pabellon Gambon", 5);

        baloncesto.anadirParticipante(b1);
        baloncesto.anadirParticipante(b2);
        baloncesto.anadirParticipante(b3);
        baloncesto.eliminarParticipante(b2);

        System.out.println(baloncesto);
        System.out.println();

        lanzaTroncosPelaos.anadirParticipante(lt1);
        lanzaTroncosPelaos.anadirParticipante(lt2);
        lanzaTroncosPelaos.anadirParticipante(lt3);
        lanzaTroncosPelaos.eliminarParticipante(lt1);

        System.out.println(lanzaTroncosPelaos);
        System.out.println();

        peladoDeGambas.anadirParticipante(pg1);
        peladoDeGambas.anadirParticipante(pg2);
        peladoDeGambas.anadirParticipante(pg3);
        peladoDeGambas.eliminarParticipante(pg3);

        System.out.println(peladoDeGambas);

        Pais pais1 = new Pais("Espana", 3);
        Pais pais2 = new Pais("Alemania", 5);
        Pais pais3 = new Pais("Suiza", 2);

        Juego juego = new Juego(2024, "Montepinar");

        juego.anadirPaises(pais1);
        juego.anadirPaises(pais2);
        juego.anadirPaises(pais3);
        juego.eliminarPaises(pais2);

        juego.anadirDeporte(baloncesto);
        juego.anadirDeporte(lanzaTroncosPelaos);
        juego.anadirDeporte(peladoDeGambas);
        juego.eliminarDeporte(baloncesto);

        System.out.println();
        System.out.println(juego);

        lt1.hacerjuramento();
        lt1.lanzar();

        pg2.hacerjuramento();
        pg2.pelar();

        b2.hacerjuramento();
        b2.encestar();

        juego.mostrarPaises();
        System.out.println(juego);
        System.out.println();


        juego.mostrarPaisesParaCeremonia();
        System.out.println(juego);
        System.out.println();

        baloncesto.mostrarParticipantes();
        System.out.println(baloncesto);
        System.out.println();

        Baloncestitas[] baloncestitas = new Baloncestitas[3];
        baloncestitas[0] = b1;
        baloncestitas[1] = b2;
        baloncestitas[2] = b3;
        baloncesto.mostrarJugadoresBaloncestoPorAltura(baloncestitas);
        System.out.println(baloncesto);
    }
}
