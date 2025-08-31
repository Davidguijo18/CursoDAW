package U4.tarea1.Ejercicio9;

import U4.tarea1.Ejercicio9.Maquinaria.Locomotora;
import U4.tarea1.Ejercicio9.Maquinaria.Tren;
import U4.tarea1.Ejercicio9.Maquinaria.Vagon;
import U4.tarea1.Ejercicio9.Personal.JefeEstacion;
import U4.tarea1.Ejercicio9.Personal.Maquinista;
import U4.tarea1.Ejercicio9.Personal.Mecanico;

public class Main {
    public static void main(String[] args) {
        JefeEstacion jefe = new JefeEstacion("Aurelio", "75035493L");
        Maquinista maquinista = new Maquinista("Carlos", "43217694G", 1700, "Superior");
        Mecanico mecanico = new Mecanico("Julian", 765392158, "Frenos");
        Vagon vagon = new Vagon(20000, 5394.53, "Comida");
        Locomotora locomotora = new Locomotora("5734 BDS", 230, 2018, mecanico);
        Tren tren = new Tren(locomotora, maquinista, vagon);
    }
}
