package U3.EjerciciosRepaso.Examen_Manana_Rojo;

public class Ejercicio3 {
    public static void main(String[] args) {

        String[] paises = {"España", "Rusia", "Japon", "Australia"};
        int[][] array = new int[4][10];
        rellenarAleatoriosArray(array);

        String[][] arrayFinal = rellenarArrayFinal(paises, array);
        for (int i = 0; i < arrayFinal.length; i++) {
            for (int j = 0; j < arrayFinal[i].length; j++) {
                System.out.print(arrayFinal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rellenarAleatoriosArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 71) + 140;
            }
        }
    }

    public static String[][] rellenarArrayFinal(String[] paises, int[][] array) {
        String[][] arrayFinal = new String[4][11];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayFinal[i][j] = paises[i] + " " + array[i][j];
            }
        }
        return arrayFinal;
    }

    public static void guardarMediaMinimoMaximo(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {

                }
            }
        }
    }
}
