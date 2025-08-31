package U3.EjerciciosRepaso.Entregable_David_Gonzalez;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] array = new int[6][10];

        rellenarArray(array);
        mostrarArray(array);
        System.out.println();
        posicionMaximo(array);
        posicionMinimo(array);

    }

    public static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 1000) + 1;
            }
        }
    }

    public static void posicionMaximo(int[][] array) {
        int maximo = array[0][0];
        String posicionMaximo = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maximo <= array[i][j]) {
                    maximo = array[i][j];

                    int ejex = i + 1;
                    int ejey = j + 1;
                    posicionMaximo = ejex + "," + ejey;
                }
            }
        }
        System.out.println("La posicion del numero maximo es: " + posicionMaximo);
    }


    public static void posicionMinimo(int[][] array) {
        int minimo = array[0][0];
        String posicionMinimo = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (minimo >= array[i][j]) {
                    minimo = array[i][j];

                    int ejex = i + 1;
                    int ejey = j + 1;
                    posicionMinimo = ejex + "," + ejey;
                }
            }
        }
        System.out.println("La posicion del numero minimo es: " + posicionMinimo);
    }

    public static void mostrarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}