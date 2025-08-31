package U3.EjerciciosRepaso.EjerciciosInternet;

public class EjerciciosNumero1A100MediaSuma {
    public static void main(String[] args) {

        int[] array = new int[100];
        int suma = 0;
        double media;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }

        media = (double) suma / array.length;

        System.out.println("La suma de todos los numeros es: " + suma);
        System.out.println("La media de todos los numerso es: " + media);
    }
}
