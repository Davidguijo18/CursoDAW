package U5.tarea3.Ejercicio1;

import java.util.Comparator;

public class CompararNumeros implements Comparator<Numero> {
    @Override
    public int compare(Numero num1, Numero num2) {
        return Integer.compare(num2.getValor(), num1.getValor());
    }
}

