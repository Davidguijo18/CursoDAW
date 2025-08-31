package U7.EjerciciosRepaso.Examen_1920_Manana;

import java.util.Comparator;

public class OrdenarPerroPorEdad implements Comparator<Perro> {
    public int compare(Perro o1, Perro o2) {
        if (o1.getEdadPerro() > o2.getEdadPerro()){
            return 1;
        }else if(o1.getEdadPerro() < o2.getEdadPerro()){
            return -1;
        }
        return 0;
    }
}
