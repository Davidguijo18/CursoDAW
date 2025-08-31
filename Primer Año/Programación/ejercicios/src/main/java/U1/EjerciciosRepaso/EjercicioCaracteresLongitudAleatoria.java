package U1.EjerciciosRepaso;

public class EjercicioCaracteresLongitudAleatoria {
    public static void main(String[] args) {

        char simbolo = ' ';

        for (int i = 1; i <= 10; i++) {
            int longitud = (int) (Math.random() * 40) + 1;
            int caracter = (int) (Math.random() * 6) + 1;
            switch (caracter) {
                case 1:
                    simbolo = '*';
                    break;

                case 2:
                    simbolo = '-';
                    break;

                case 3:
                    simbolo = '=';
                    break;

                case 4:
                    simbolo = '.';
                    break;

                case 5:
                    simbolo = '|';
                    break;

                case 6:
                    simbolo = '@';
                    break;
            }

            for (int j = 1; j <= longitud; j++) {
                System.out.print(simbolo + "");
            }
            System.out.println();
        }
    }
}
