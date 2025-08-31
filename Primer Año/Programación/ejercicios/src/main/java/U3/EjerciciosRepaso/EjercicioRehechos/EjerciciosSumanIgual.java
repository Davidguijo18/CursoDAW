package U3.EjerciciosRepaso.EjercicioRehechos;

public class EjerciciosSumanIgual {
    public static void main(String[] args) {

        int[][] array = new int[6][6];
        construirArray(array);
        mostrarArray(array);

        if (sumanIgual(array)) {
            System.out.println("Las columnas y filas suman lo mismo");
        } else {
            System.out.println("Las columnas y filas no suman lo mismo");
        }

    }

    public static void construirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 1) + 2;
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean sumanIgual(int[][] array) {
        int sumaObjetivo = array.length;  // La suma de cualquier fila o columna debe ser igual a la longitud

        for (int i = 0; i < 6; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < 6; j++) {
                sumaFilas = sumaFilas + array[i][j];
            }
            if (sumaFilas != sumaObjetivo) {
                return false;
            }
        }

        for (int j = 0; j < 6; j++) {
            int sumaColumnas = 0;
            for (int i = 0; i < 6; i++) {
                sumaColumnas = sumaColumnas + array[i][j];
            }
            if (sumaColumnas != sumaObjetivo) {
                return false;
            }
        }

        return true;
    }

}
