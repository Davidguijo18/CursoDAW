package U3.tarea4;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int[] diagonal = new int[10];

        System.out.println("Muestra del array completo: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101) + 200;

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    diagonal[i] = array[i][j];
                }
            }
        }

        int maximo = diagonal[0];
        int minimo = diagonal[0];
        double media = 0;
        System.out.println("\nNumeros de la diagonal: ");
        for (int i = 0; i < diagonal.length; i++) {
            System.out.print(diagonal[i] + " ");

            if (maximo <= diagonal[i]) {
                maximo = diagonal[i];
            }

            if (minimo >= diagonal[i]) {
                minimo = diagonal[i];
            }

            media = media + diagonal[i];
        }
        media = media / 10;

        System.out.println("\nEl valor maximo de los valores de la diagonal es : " + maximo);
        System.out.println("El valor minimo de los valores de la diagonal es : " + minimo);
        System.out.println("La media de todos los valores de la diagonal es: " + media);

    }
}
