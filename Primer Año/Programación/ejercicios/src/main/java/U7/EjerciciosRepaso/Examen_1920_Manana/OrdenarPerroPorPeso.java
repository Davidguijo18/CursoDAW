package U7.EjerciciosRepaso.Examen_1920_Manana;

import java.util.Comparator;

public class OrdenarPerroPorPeso implements Comparator<Perro> {
    @Override
    public int compare(Perro o1, Perro o2) {
        if (o1.getPesoPerro() > o2.getPesoPerro()){
            return 1;
        }else if(o1.getPesoPerro() < o2.getPesoPerro()){
            return -1;
        }
        return 0;
    }
}
