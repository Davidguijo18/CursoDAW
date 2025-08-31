package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

public class Main {
    public static void main(String[] args) {
        Rpg rpg = new Rpg();

        Elfos elfo = new Elfos("Elfo Damian", 130, 20, 17, true, Elfos.Tipo.BOSQUE);
        Enanos enano = new Enanos("Enano German ", 990, 64, 82, true, 1.20);
        Orcos orco = new Orcos("Orco Cristobal", 843, 60, 60, false, 2);
        Guerreros guerrero = new Guerreros("Jon Nieve", 900, 90, 83, false, 25);
        Magos mago = new Magos("Gandalf", 999, 99, 99, false, 40);

        rpg.anadirPersonajes(elfo);
        rpg.anadirPersonajes(enano);
        rpg.anadirPersonajes(orco);
        rpg.anadirPersonajes(guerrero);
        rpg.anadirPersonajes(mago);

        mago.encantar(guerrero);
        mago.desencantar(elfo);

        elfo.atacarPersonaje(mago);
        guerrero.atacarPersonaje(elfo);
        guerrero.atacarPersonaje(elfo);
        orco.atacarPersonaje(guerrero);
        enano.atacarPersonaje(orco);

        System.out.println();
        rpg.hayGanador();

        rpg.mostrarEstado();
        rpg.borrarMuertos(elfo);

        System.out.println();
        rpg.mostrarAtaque();

        rpg.borrarMuertos(enano);
        rpg.borrarMuertos(orco);

        System.out.println();
        rpg.mostrarDefensa();
        rpg.hayGanador();

        rpg.borrarMuertos(mago);

        System.out.println();
        rpg.mostrarEstado();
        rpg.hayGanador();
    }
}
