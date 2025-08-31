package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cargo;
        double sueldo = 0;
        double sueldoViajes;
        double salarioBruto;
        int diasViaje;
        int estadoCivil;
        int irpf;
        String irpfPorcentaje = " ";
        double salarioBrutoIrpf;
        double sueldoNeto;

        System.out.println("Introduce tu cargo en la empresa (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto)");
        cargo = teclado.nextInt();

        if (cargo > 3 || cargo <= 0) {
            System.out.println("Ese cargo no existe");
        } else {

            if (cargo == 1) {
                sueldo = 950;
            }

            if (cargo == 2) {
                sueldo = 1200;
            }

            if (cargo == 3) {
                sueldo = 1600;
            }


            System.out.println("Introduzca el numero de dias que ha estado de viaje visitando clientes");
            diasViaje = teclado.nextInt();

            sueldoViajes = 30 * diasViaje;
            salarioBruto = sueldo + sueldoViajes;

            System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado)");
            estadoCivil = teclado.nextInt();

            if (estadoCivil == 1) {
                irpf = 25;
                irpfPorcentaje = "25%";
            }

            if (estadoCivil == 2) {
                irpf = 20;
                irpfPorcentaje = "20%";
            }

            salarioBrutoIrpf = (salarioBruto * 20) / 100;
            sueldoNeto = salarioBruto - salarioBrutoIrpf;

            System.out.println(" ");
            System.out.println("-----------------------");
            System.out.println("SALARIO");
            System.out.println("Sueldo base --->" + sueldo);
            System.out.println("Viajes (" + diasViaje + " viajes) --->" + sueldoViajes);
            System.out.println("-----------------------");
            System.out.println("Salario bruto --->" + salarioBruto);
            System.out.println("Retencion IRPF (" + irpfPorcentaje + ") ---> " + salarioBrutoIrpf);
            System.out.println("-----------------------");
            System.out.println("Sueldo neto ---> " + sueldoNeto);
            System.out.println("-----------------------");

        }
    }
}
