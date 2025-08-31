package U5.tarea1.Ejercicio6;

import U5.tarea1.Ejercicio5.Instrumento;

public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Campana campana = new Campana();
        piano.add(Instrumento.Notas.DO);
        piano.add(Instrumento.Notas.RE);
        piano.add(Instrumento.Notas.MI);
        piano.add(Instrumento.Notas.FA);

        campana.add(Instrumento.Notas.SOL);
        campana.add(Instrumento.Notas.LA);
        campana.add(Instrumento.Notas.SI);
        campana.add(Instrumento.Notas.DO);

        piano.interpretar();
        System.out.println();
        campana.interpretar();

    }
}

