package U7.tarea7;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numerosAleatorios = new Random()
                .ints(100, 0, 1000)
                .boxed()
                .collect(Collectors.toList());

        long cantidadPrimos = numerosAleatorios.stream()
                .filter(Ejercicio1::esPrimo)
                .count();

        int mayor = numerosAleatorios.stream()
                .max(Integer::compareTo)
                .orElse(0);

        int menor = numerosAleatorios.stream()
                .min(Integer::compareTo)
                .orElse(0);

        int suma = numerosAleatorios.stream()
                .reduce(0, Integer::sum);

        double promedio = numerosAleatorios.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        // Mostrar los resultados
        System.out.println("Cantidad de números primos: " + cantidadPrimos);
        System.out.println("Mayor número: " + mayor);
        System.out.println("Menor número: " + menor);
        System.out.println("Suma de todos los números: " + suma);
        System.out.println("Promedio de los números: " + promedio);
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
