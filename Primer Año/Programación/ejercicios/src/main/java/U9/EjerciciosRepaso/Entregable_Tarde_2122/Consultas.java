package U9.EjerciciosRepaso.Entregable_Tarde_2122;

import java.sql.*;
import java.util.Scanner;

public class Consultas {

    public Consultas() {
    }

    public void filtroPrecio() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            String sql = "SELECT * FROM products WHERE buyPrice > ?";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce un precio: ");
            String precio = teclado.nextLine();
            System.out.println();

            statement.setString(1, precio);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("Codigo de producto: " + rs.getString("productCode"));
                System.out.println("Nombre de producto: " + rs.getString("productName"));
                System.out.println("Linea de producto: " + rs.getString("productLine"));
                System.out.println("Escala del producto: " + rs.getString("productScale"));
                System.out.println("Vendedor del producto: " + rs.getString("productVendor"));
                System.out.println("Descripcion del producto: " + rs.getString("productDescription"));
                System.out.println("Cantidad en stock: " + rs.getString("quantityInStock"));
                System.out.println("Precio:  " + rs.getString("buyPrice"));
                System.out.println("MSRP: " + rs.getString("MSRP"));
                System.out.println("------------------------------------------------------");
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void infoPagos() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            String sql = "SELECT customerName FROM customers WHERE customerNumber = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            String sql2 = "SELECT checkNumber,paymentDate FROM payments WHERE customerNumber = ?";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            String sql3 = "SELECT amount FROM payments WHERE customerNumber = ?";
            PreparedStatement statement3 = con.prepareStatement(sql3);

            System.out.print("Introduce el codigo de cliente: ");
            String codCliente = teclado.nextLine();
            System.out.println();

            statement.setString(1, codCliente);
            statement2.setString(1, codCliente);
            statement3.setString(1, codCliente);

            ResultSet rs1 = statement.executeQuery();
            ResultSet rs2 = statement2.executeQuery();
            ResultSet rs3 = statement3.executeQuery();

            if (rs1.next()) {
                System.out.println("Nombre: " + rs1.getString("customerName"));

                if (rs2.next()) {
                    System.out.println("Check number: " + rs2.getString("checkNumber"));
                    System.out.println("Fecha de pago: " + rs2.getString("paymentDate"));

                    double amount = 0;
                    while (rs3.next()) {
                        amount = amount + rs3.getDouble("amount");
                    }
                    System.out.println("Cantidad: " + amount);

                } else {
                    System.out.println("No se ha encontrado el cliente");
                }
            } else {
                System.out.println("No se ha encontrado el cliente");
            }


        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void informeCategoria() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            String sql = "SELECT productName FROM products WHERE productLine = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            String sql2 = "SELECT productCode FROM products WHERE productLine = ?";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            String sql3 = "SELECT quantityOrdered,priceEach FROM orderdetails WHERE productCode = ?";
            PreparedStatement statement3 = con.prepareStatement(sql3);


            System.out.print("\nIntroduce el nombre de la categoria: ");
            String nombreCategoria = teclado.nextLine();
            System.out.println();

            statement.setString(1, nombreCategoria);
            statement2.setString(1, nombreCategoria);

            ResultSet rs1 = statement.executeQuery();
            ResultSet rs2 = statement2.executeQuery();

            while (rs1.next()) {
                System.out.println("Nombre del producto: " + rs1.getString("productName"));

                if (rs2.next()) {
                    String codigoProducto = rs2.getString("productCode");

                    statement3.setString(1, codigoProducto);
                    ResultSet rs3 = statement3.executeQuery();

                    if (rs3.next()) {
                        System.out.println("Cantidad: " + rs3.getString("quantityOrdered"));
                        System.out.println("Precio: " + rs3.getString("priceEach"));
                    }
                }

                System.out.println("--------------------------------------------");
                System.out.println();
            }


        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
