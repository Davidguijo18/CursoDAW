package U4.tarea1.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        CuentaCorriente cuentaSinParametros = new CuentaCorriente();

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduce tu dni: ");
        String dni = teclado.nextLine();

        System.out.println();

        CuentaCorriente cuenta = new CuentaCorriente(nombre, dni);
        cuenta.mostrarInformacion();

        System.out.print("\nIntroduce la cantidad de dinero que deseas ingresar: ");
        double dinero = teclado.nextDouble();

        cuenta.ingresarDinero(dinero);
        cuenta.mostrarInformacion();

        System.out.print("\nIntroduce la cantidad que deseas retirar: ");
        double cantidadRetirar = teclado.nextDouble();

        if (cuenta.sacarDinero(cantidadRetirar)) {
            System.out.println("\n- Se ha efectuado la operacion");
            cuenta.mostrarInformacion();
        } else {
            System.out.println("\n- No se ha podido efectuar la operacion");
        }

        cuentaSinParametros.setDni("84037140j");
        cuentaSinParametros.setNombre("Antonio");
        cuentaSinParametros.setSaldo(4000);
        cuentaSinParametros.setLimiteDescubrimiento(-30);

        cuentaSinParametros.mostrarInformacion();
    }
}
