package U9.Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transacciones {

    public Transacciones() {
    }

    public void transaccion1() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("           INSERCION DEL CLIENTE");

            String sql = "INSERT INTO customers (customerNumber,customerName,contactFirstName,contactLastName,phone,addressLine1,city,postalCode,country) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce el numero de cliente: ");
            String numCliente = teclado.nextLine();

            System.out.print("Introduce el nombre del cliente: ");
            String nombreCliente = teclado.nextLine();

            System.out.print("Introduce el primer apellido: ");
            String primerApellidoCliente = teclado.nextLine();

            System.out.print("Introduce el segundo apellido: ");
            String segundoApellidoCliente = teclado.nextLine();

            System.out.print("Introduce el numero de telefono: ");
            String telefonoCliente = teclado.nextLine();

            System.out.print("Introduce la direccion: ");
            String direccionCliente = teclado.nextLine();

            System.out.print("Introduce la ciudad: ");
            String ciudadCliente = teclado.nextLine();

            System.out.print("Introduce el codigo postal: ");
            String codPostalCliente = teclado.nextLine();

            System.out.print("Introduce el pais: ");
            String paisCliente = teclado.nextLine();

            statement.setString(1, numCliente);
            statement.setString(2, nombreCliente);
            statement.setString(3, primerApellidoCliente);
            statement.setString(4, segundoApellidoCliente);
            statement.setString(5, telefonoCliente);
            statement.setString(6, direccionCliente);
            statement.setString(7, ciudadCliente);
            statement.setString(8, codPostalCliente);
            statement.setString(9, paisCliente);

            int insercionCliente = statement.executeUpdate();
            if (insercionCliente != 0) {
                System.out.println("Se ha creado al cliente con exito");
                System.out.println();
            } else {
                System.out.println("Error al añadir el cliente");
                System.out.println();
            }


            System.out.println("\n-----------------------------------------------------");
            System.out.println("         INSERCION DEL PRIMER PAGO");

            String sql2 = "INSERT INTO payments (customerNumber,checkNumber,paymentDate,amount) VALUES (?,?,?,?)";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            System.out.print("Introduce el check number: ");
            String checkNumber = teclado.nextLine();

            System.out.print("Introduce la fecha de pago: ");
            String fechaPago = teclado.nextLine();

            System.out.print("Introduce la cantidad: ");
            String cantidad = teclado.nextLine();

            statement2.setString(1, numCliente);
            statement2.setString(2, checkNumber);
            statement2.setString(3, fechaPago);
            statement2.setString(4, cantidad);

            int insercionPrimerPago = statement2.executeUpdate();
            if (insercionPrimerPago != 0) {
                System.out.println("Se ha añadido el primer pago");
                System.out.println();
            } else {
                System.out.println("Error al añadir el primer pago");
                System.out.println();
            }


            System.out.println("\n-----------------------------------------------------");
            System.out.println("         INSERCION DEL SEGUNDO PAGO");

            String sql3 = "INSERT INTO payments (customerNumber,checkNumber,paymentDate,amount) VALUES (?,?,?,?)";
            PreparedStatement statement3 = con.prepareStatement(sql3);

            System.out.print("Introduce el check number: ");
            String checkNumber2 = teclado.nextLine();

            System.out.print("Introduce la fecha de pago: ");
            String fechaPago2 = teclado.nextLine();

            System.out.print("Introduce la cantidad: ");
            String cantidad2 = teclado.nextLine();

            statement3.setString(1, numCliente);
            statement3.setString(2, checkNumber2);
            statement3.setString(3, fechaPago2);
            statement3.setString(4, cantidad2);

            int insercionSegundoPago = statement3.executeUpdate();
            if (insercionSegundoPago != 0) {
                System.out.println("Se ha añadido el segundo pago");
                System.out.println();
            } else {
                System.out.println("Error al añadir el segundo pago");
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


    public void transaccion2() {
        Connection con = U9.EjerciciosRepaso.Entregable_Tarde_2122.ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            String sql = "INSERT INTO offices (officeCode,city,phone,addressLine1,country,postalCode,territory) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce el codigo de la oficina: ");
            String codOficina = teclado.nextLine();

            System.out.print("Introduce la ciudad: ");
            String ciudad = teclado.nextLine();

            System.out.print("Introduce el numero telefonico: ");
            String telefono = teclado.nextLine();

            System.out.print("Introduce la direccion: ");
            String direccion = teclado.nextLine();

            System.out.print("Introduce el pais: ");
            String pais = teclado.nextLine();

            System.out.print("Introduce el codigo postal: ");
            String codPostal = teclado.nextLine();

            System.out.print("Introduce el territorio: ");
            String territorio = teclado.nextLine();

            statement.setString(1, codOficina);
            statement.setString(2, ciudad);
            statement.setString(3, telefono);
            statement.setString(4, direccion);
            statement.setString(5, pais);
            statement.setString(6, codPostal);
            statement.setString(7, territorio);

            int insercionOficina = statement.executeUpdate();
            if (insercionOficina != 0) {
                System.out.println("Oficina añadida correctamente");
            } else {
                System.out.println("Error al añadir la oficina");
            }

            String sql2 = "UPDATE employees SET officeCode = ? WHERE officeCode = 5";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            statement2.setString(1, codOficina);

            int cambioOficina = statement2.executeUpdate();
            if (cambioOficina != 0) {
                System.out.println("Se han movido los empleados de oficina");
            } else {
                System.out.println("Error al mover a los empleados de oficina");
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
