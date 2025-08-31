package U3.tarea4;

public class Ejercicio6 {
    public static void main(String[] args) {

        int[][] array = new int[6][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 1001);

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int maximo = array[0][0];
        String posicionMaximo = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maximo <= array[i][j]) {
                    maximo = array[i][j];

                    int coordenadasX = 1 + i, coordenadasY = 1 + j;
                    posicionMaximo = coordenadasX + "," + coordenadasY;
                }
            }
        }

        int minimo = array[0][0];
        String posicionMinimo = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (minimo >= array[i][j]) {
                    minimo = array[i][j];

                    int coordenadasX = 1 + i, coordenadasY = 1 + j;
                    posicionMinimo = coordenadasX + "," + coordenadasY;
                }
            }
        }

        System.out.println("\nEl numero maximo es: " + maximo + " y su posicion es: " + posicionMaximo);
        System.out.println("El numero minimo es: " + minimo + " y su posicion es: " + posicionMinimo);
    }
}
