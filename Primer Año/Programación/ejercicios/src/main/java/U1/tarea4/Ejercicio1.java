package U1.tarea4;

public class Ejercicio1 {
    public static void main(String[] args) {

        short vaMax = 32767;
        short vaMin = -32768;

        System.out.println("El valor maximo de una variable de tipo short es "+vaMax);
        System.out.println("El valor minimo de una variable de tipo short es "+vaMin);

        vaMax = (short) (vaMax+1);

        System.out.println("Si sumamos 1 a la variable maxima el resultado seria "+vaMax);

    }

}
