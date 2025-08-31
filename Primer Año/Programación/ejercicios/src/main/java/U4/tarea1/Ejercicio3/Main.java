package U4.tarea1.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

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


        System.out.println("\n\nObjeto hecho con setters: ");
        CuentaCorriente cuentaSinParametros = new CuentaCorriente();

        cuentaSinParametros.setDni("84037140j");
        cuentaSinParametros.setNombre("Antonio");
        cuentaSinParametros.setSaldo(4000);
        cuentaSinParametros.setLimiteDescubrimiento(-30);
        cuentaSinParametros.mostrarInformacion();


        System.out.println("\nObjeto solo con saldo: ");
        CuentaCorriente cuentaSoloSaldo = new CuentaCorriente(12000);
        cuentaSoloSaldo.mostrarInformacion();


        System.out.println("\nObjeto con todo menos nombre: ");
        CuentaCorriente cuentaSinNombre = new CuentaCorriente(7653,-100,"74032357H");
        cuentaSinNombre.mostrarInformacion();
    }
}
