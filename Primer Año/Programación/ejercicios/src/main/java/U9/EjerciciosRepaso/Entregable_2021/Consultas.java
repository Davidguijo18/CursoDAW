package U9.EjerciciosRepaso.Entregable_2021;

import java.sql.*;
import java.util.Scanner;

public class Consultas {

    public Consultas() {
    }

    public void pagosCliente(){
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);
        try {
            String sql = "SELECT contactFirstName,contactLastName,country FROM customers WHERE customerNumber = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            String sql2 = "SELECT amount FROM payments WHERE customerNumber = ?";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            System.out.print("Introduce el numero del cliente: ");
            String numEmpleado = teclado.nextLine();

            statement.setString(1, numEmpleado);
            statement2.setString(1, numEmpleado);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("contactFirstName"));
                System.out.println("Apellido: " + rs.getString("contactLastName"));
                System.out.println("Pais: " + rs.getString("country"));
            }

            ResultSet rs2 = statement2.executeQuery();
            double totalPagos = 0;
            while (rs2.next()) {
                totalPagos += rs2.getDouble("amount");
            }

            System.out.println("Total de pagos: " + totalPagos);
            System.out.println();

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


    public void infoPedido() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            String sql = "SELECT productCode,quantityOrdered,priceEach FROM orderdetails WHERE orderNumber = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            String sql2 = "SELECT priceEach FROM orderdetails WHERE orderNumber = ?";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            System.out.print("Introduce el numero de pedido: ");
            String numPedido = teclado.nextLine();

            statement.setString(1, numPedido);
            statement2.setString(1, numPedido);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("Producto:  " + rs.getString("productCode"));
                System.out.println("Cantidad: " + rs.getString("quantityOrdered"));
                System.out.println("Precio: " + rs.getString("priceEach"));
                System.out.println("------------------");
                System.out.println();
            }

            ResultSet rs2 = statement2.executeQuery();
            double precioTotal = 0;
            while (rs2.next()) {
                precioTotal = precioTotal + rs2.getDouble("priceEach");
            }
            System.out.println("Precio total: " + precioTotal);
            System.out.println();

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


    public void datosJefe() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            String sql = "SELECT reportsTo FROM employees WHERE employeeNumber = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce el numero de empleado: ");
            int numEmpleado = teclado.nextInt();

            statement.setInt(1, numEmpleado);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                int reportsTo = rs.getInt("reportsTo");

                String sql2 = "SELECT firstName,lastName FROM employees WHERE employeeNumber = ?";
                PreparedStatement statement2 = con.prepareStatement(sql2);

                statement2.setInt(1, reportsTo);
                ResultSet rs2 = statement2.executeQuery();

                if (rs2.next()) {
                    System.out.println("Nombre: " + rs2.getString("firstName"));
                    System.out.println("Apellido: " + rs2.getString("lastName"));
                } else {
                    System.out.println("No se ha encontrado el emplado o no tiene ningun jefe");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
