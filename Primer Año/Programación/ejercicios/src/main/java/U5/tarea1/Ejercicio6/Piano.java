package U5.tarea1.Ejercicio6;

import U5.tarea1.Ejercicio5.Instrumento;

public class Piano extends Instrumento {
    public void interpretar() {
        System.out.print("Las notas musicales del piano son: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(notasMusicales[i] + " ");
        }
    }
}
