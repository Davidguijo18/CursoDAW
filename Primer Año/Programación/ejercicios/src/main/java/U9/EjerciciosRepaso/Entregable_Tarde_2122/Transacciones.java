package U9.EjerciciosRepaso.Entregable_Tarde_2122;

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

            System.out.println("\n-----------------------------------------------------");
            System.out.println("           INSERCION DEL EMPLEADO");

            String sql = "INSERT INTO employees (employeeNumber,firstName,lastName,extension,email,jobTitle,officeCode) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce el codigo del empleado: ");
            String codEmpleado = teclado.nextLine();

            System.out.print("Introduce el nombre del empleado: ");
            String nombreEmpleado = teclado.nextLine();

            System.out.print("Introduce el apellido del empleado: ");
            String apellidoEmpleado = teclado.nextLine();

            System.out.print("Introduce la extension del empleado: ");
            String extensionEmpleado = teclado.nextLine();

            System.out.print("Introduce el email: ");
            String emailEmpleado = teclado.nextLine();

            System.out.print("Titulo: ");
            String tituloEmpleado = teclado.nextLine();

            System.out.print("Introduce el codigo de la oficina: ");
            String codOficina = teclado.nextLine();

            statement.setString(1, codEmpleado);
            statement.setString(2, nombreEmpleado);
            statement.setString(3, apellidoEmpleado);
            statement.setString(4, extensionEmpleado);
            statement.setString(5, emailEmpleado);
            statement.setString(6, tituloEmpleado);
            statement.setString(7, codOficina);

            int insercion = statement.executeUpdate();
            if (insercion != 0) {
                System.out.println("Se ha añadido el empleado");
                System.out.println();
            } else {
                System.out.println("Error al añadir el empleado");
                System.out.println();
            }


            System.out.println("\n-----------------------------------------------------");
            System.out.println("         INSERCION DEL PRIMER CLIENTE");

            String sql2 = "INSERT INTO customers (customerNumber,customerName,contactFirstName,contactLastName,phone,addressLine1,city,postalCode,country,salesRepEmployeeNumber) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            System.out.print("Introduce el numero de cliente: ");
            String numCliente1 = teclado.nextLine();

            System.out.print("Introduce el nombre del cliente: ");
            String nombreCliente1 = teclado.nextLine();

            System.out.print("Introduce el primer apellido: ");
            String primerApellidoCliente1 = teclado.nextLine();

            System.out.print("Introduce el segundo apellido: ");
            String segundoApellidoCliente1 = teclado.nextLine();

            System.out.print("Introduce el numero de telefono: ");
            String telefonoCliente1 = teclado.nextLine();

            System.out.print("Introduce la direccion: ");
            String direccionCliente1 = teclado.nextLine();

            System.out.print("Introduce la ciudad: ");
            String ciudadCliente1 = teclado.nextLine();

            System.out.print("Introduce el codigo postal: ");
            String codPostalCliente1 = teclado.nextLine();

            System.out.print("Introduce el pais: ");
            String paisCliente1 = teclado.nextLine();

            statement2.setString(1, numCliente1);
            statement2.setString(2, nombreCliente1);
            statement2.setString(3, primerApellidoCliente1);
            statement2.setString(4, segundoApellidoCliente1);
            statement2.setString(5, telefonoCliente1);
            statement2.setString(6, direccionCliente1);
            statement2.setString(7, ciudadCliente1);
            statement2.setString(8, codPostalCliente1);
            statement2.setString(9, paisCliente1);
            statement2.setString(10, codEmpleado);

            int insercionCliente1 = statement2.executeUpdate();
            if (insercionCliente1 != 0) {
                System.out.println("El primer cliente se ha insertado correctamente");
                System.out.println();
            } else {
                System.out.println("Error al insertar el primer cliente");
                System.out.println();
            }


            System.out.println("\n-----------------------------------------------------");
            System.out.println("         INSERCION DEL SEGUNDO CLIENTE");

            String sql3 = "INSERT INTO customers (customerNumber,customerName,contactFirstName,contactLastName,phone,addressLine1,city,postalCode,country,salesRepEmployeeNumber) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement3 = con.prepareStatement(sql3);

            System.out.print("Introduce el numero de cliente: ");
            String numCliente2 = teclado.nextLine();

            System.out.print("Introduce el nombre del cliente: ");
            String nombreCliente2 = teclado.nextLine();

            System.out.print("Introduce el primer apellido: ");
            String primerApellidoCliente2 = teclado.nextLine();

            System.out.print("Introduce el segundo apellido: ");
            String segundoApellidoCliente2 = teclado.nextLine();

            System.out.print("Introduce el numero de telefono: ");
            String telefonoCliente2 = teclado.nextLine();

            System.out.print("Introduce la direccion: ");
            String direccionCliente2 = teclado.nextLine();

            System.out.print("Introduce la ciudad: ");
            String ciudadCliente2 = teclado.nextLine();

            System.out.print("Introduce el codigo postal: ");
            String codPostalCliente2 = teclado.nextLine();

            System.out.print("Introduce el pais: ");
            String paisCliente2 = teclado.nextLine();

            statement3.setString(1, numCliente2);
            statement3.setString(2, nombreCliente2);
            statement3.setString(3, primerApellidoCliente2);
            statement3.setString(4, segundoApellidoCliente2);
            statement3.setString(5, telefonoCliente2);
            statement3.setString(6, direccionCliente2);
            statement3.setString(7, ciudadCliente2);
            statement3.setString(8, codPostalCliente2);
            statement3.setString(9, paisCliente2);
            statement3.setString(10, codEmpleado);

            int insercionCliente2 = statement3.executeUpdate();
            if (insercionCliente2 != 0) {
                System.out.println("El segundo cliente se ha insertado correctamente");
            } else {
                System.out.println("Error al insertar el segundo cliente");
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


    public void transaccion2() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            String sql = "INSERT INTO offices (officeCode,city,phone,addressLine1,country,postalCode,territory) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce el codigo de la oficina: ");
            String codOficina = teclado.nextLine();

            System.out.print("Introduce la ciudad: ");
            String ciudad = teclado.nextLine();

            System.out.print("Introduce el numero de telefono: ");
            String telefono = teclado.nextLine();

            System.out.print("Introduce la linea de direccion 1: ");
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

            int insercion = statement.executeUpdate();
            if (insercion != 0) {
                System.out.println("La oficina se ha añadido correctamente");
            } else {
                System.out.println("Error al añadir la oficina");
            }

            String sql2 = "UPDATE employees SET officeCode = ? WHERE officeCode = 5";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            statement2.setString(1, codOficina);

            int actualizacionFilas = statement2.executeUpdate();
            if (actualizacionFilas != 0) {
                System.out.println("Se ha cambiado la oficina");
            } else {
                System.out.println("Error al cambiar de oficina a los empleados");
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
