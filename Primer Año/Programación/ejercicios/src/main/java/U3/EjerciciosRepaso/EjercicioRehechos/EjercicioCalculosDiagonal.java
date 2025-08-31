package U3.EjerciciosRepaso.EjercicioRehechos;

public class EjercicioCalculosDiagonal {
    public static void main(String[] args) {

        int[][] array = new int[10][10];
        int[] diagonal = new int[10];

        System.out.println("Array normal: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 200) + 100;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nArray diagonal: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    diagonal[i] = array[i][j];
                    System.out.print(diagonal[i] + " ");
                }
            }
        }

        System.out.print("\nEl valor maximo del array de la diagonal es: ");
        int maximo = diagonal[0];
        for (int i = 0; i < diagonal.length; i++) {
            if (maximo <= diagonal[i]) {
                maximo = diagonal[i];
            }
        }
        System.out.print(maximo);

        System.out.print("\nEl valor minimo del array de la diagonal es: ");
        int minimo = diagonal[0];
        for (int i = 0; i < diagonal.length; i++) {
            if (minimo >= diagonal[i]) {
                minimo = diagonal[i];
            }
        }
        System.out.print(minimo);

        System.out.print("\nLa media del array es: ");
        double media = 0;
        for (int i = 0; i < diagonal.length; i++) {
            media = media + diagonal[i];
        }

        media = media / diagonal.length;
        System.out.print(media);
    }
}
