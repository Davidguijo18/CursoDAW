package U5.tarea1.Ejercicio6;

import U5.tarea1.Ejercicio5.Instrumento;

public class Campana extends Instrumento {

    @Override
    public void interpretar() {
        System.out.print("Las notas musicales de la campana son: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(notasMusicales[i] + " ");
        }
    }
}
