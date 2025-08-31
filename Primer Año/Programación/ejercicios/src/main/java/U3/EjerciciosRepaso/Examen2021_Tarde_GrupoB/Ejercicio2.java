package U3.EjerciciosRepaso.Examen2021_Tarde_GrupoB;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[][] array = new int[5][9];
        rellenarArray(array);
        mostrarArray(array);
        System.out.println();

        String mayor = buscarMaximo(array);
        System.out.println(mayor);

        String menor = buscarMinimo(array);
        System.out.println(menor);

    }

    public static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 901) + 100;
            }
        }
    }

    public static String buscarMaximo(int [][] array){
        String mensaje;
        int posx = 0; int posy = 0;
        int maximo = array[0][0];
        for(int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                if(maximo <= array[i][j]){
                    maximo = array[i][j];
                    posx = i + 1;
                    posy = j + 1;
                }
            }
        }
        mensaje = "La posicion del numero mayor es: "+posx+","+posy;
        return mensaje;
    }

    public static String buscarMinimo(int [][]array){
        String mensaje;
        int posx = 0; int posy = 0;
        int minimo = array[0][0];
        for(int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                if(minimo >= array[i][j]){
                    minimo = array[i][j];
                    posx = i + 1;
                    posy = j + 1;
                }
            }
        }
        mensaje = "La posicion del numero menor es: "+posx+","+posy;
        return mensaje;
    }

    public static boolean comprobarRepeticones(int[][]array, int minimo){
        boolean repetido = false;
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                if (array[i][j] == minimo) {
                    repetido = true;
                    break;
                }
            }
        }
        return repetido;
    }

    public static void mostrarArray(int[][]array){
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
