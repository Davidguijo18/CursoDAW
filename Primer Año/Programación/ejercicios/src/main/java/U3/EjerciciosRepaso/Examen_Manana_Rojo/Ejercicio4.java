package U3.EjerciciosRepaso.Examen_Manana_Rojo;

public class Ejercicio4 {

    public static void main(String[] args) {

        String[][] matriz1 = {
                {"HOLA", "PERRO", "C++"},
                {"ADIOS", "GATO", "PYTHON"},
                {"HASTALUEGO", "VACA", "JAVA"}
        };

        String[][] matriz2 = {
                {"BD", "SOBRESALIENTE", "PEPE"},
                {"LM", "NOTABLE", "MANUEL"},
                {"PROG", "APROBADO", "ROSA"}
        };

        String[][] resultado1 = unirMatrices(matriz1, matriz2);
        imprimirMatriz(resultado1);

        String[][] matriz3 = {
                {"HOLA", "PERRO", "C++"},
                {"ADIOS", "GATO", "PYTHON"},
                {"HASTALUEGO", "VACA", "JAVA"}
        };

        String[][] matriz4 = {
                {"BD", "SOBRESALIENTE"},
                {"LM", "NOTABLE"},
                {"PROG", "APROBADO"}
        };

        String[][] resultado2 = unirMatrices(matriz3, matriz4);
        imprimirMatriz(resultado2);
    }

    public static String[][] unirMatrices(String[][] matriz1, String[][] matriz2) {
        int filasMatriz1 = matriz1.length;
        int columnasMatriz1 = matriz1[0].length;
        int filasMatriz2 = matriz2.length;
        int columnasMatriz2 = matriz2[0].length;

        if (filasMatriz1 != filasMatriz2 || columnasMatriz1 != columnasMatriz2) {
            System.out.println("Las matrices no tienen la misma dimensión.");
            return new String[0][0];
        }

        String[][] resultado = new String[filasMatriz1][columnasMatriz1 + columnasMatriz2];
        for (int i = 0; i < filasMatriz1; i++) {
            System.arraycopy(matriz1[i], 0, resultado[i], 0, columnasMatriz1);
            System.arraycopy(matriz2[i], 0, resultado[i], columnasMatriz1, columnasMatriz2);
        }

        return resultado;
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            for (String elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}