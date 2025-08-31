package U9.Entregable;

import java.sql.*;
import java.util.Scanner;

public class Consultas {

    public Consultas() {
    }

    public void empleadosOficinaMayor() {
        Connection con = ConexionBD.getConnection();

        try {
            //Lo de DESC LIMIT 1 lo he tenido que buscar en internet porque no tenia ni idea
            String sql = "SELECT * FROM employees WHERE officeCode = (SELECT officeCode FROM employees GROUP BY officeCode ORDER BY COUNT(*) DESC LIMIT 1) ";
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("Numero de empleado: " + rs.getString("employeeNumber"));
                System.out.println("Nombre: " + rs.getString("firstName"));
                System.out.println("Apellido: " + rs.getString("lastName"));
                System.out.println("Extension: " + rs.getString("extension"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Oficina: " + rs.getString("officeCode"));
                System.out.println("ReportsTo: " + rs.getString("reportsTo"));
                System.out.println("Titulo: " + rs.getString("jobTitle"));
                System.out.println("------------------------------------------------");
                System.out.println();
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }



    public void productosNoVendidos() {
        Connection con = ConexionBD.getConnection();

        try {
            String sql = "SELECT * FROM products WHERE productCode NOT IN (SELECT productCode FROM orderdetails )";
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                System.out.println("Codigo de producto: " + rs.getString("productCode"));
                System.out.println("Nombre de producto: " + rs.getString("productName"));
                System.out.println("Linea de producto: " + rs.getString("productLine"));
                System.out.println("Escala del producto: " + rs.getString("productScale"));
                System.out.println("Vendedor del producto: " + rs.getString("productVendor"));
                System.out.println("Descripcion del producto: " + rs.getString("productDescription"));
                System.out.println("Cantidad en stock: " + rs.getString("quantityInStock"));
                System.out.println("Precio:  " + rs.getString("buyPrice"));
                System.out.println("MSRP: " + rs.getString("MSRP"));
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }



    public void informeCategoria() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            String sql = "SELECT productCode FROM products WHERE productLine = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            String sql2 = "SELECT productName FROM products WHERE productCode = ?";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            String sql3 = "SELECT quantityOrdered FROM orderdetails WHERE productCode = ?";
            PreparedStatement statement3 = con.prepareStatement(sql3);

            String sql4 = "SELECT priceEach FROM orderdetails WHERE productCode = ?";
            PreparedStatement statement4 = con.prepareStatement(sql4);

            System.out.print("Introduce la categoria del producto: ");
            String categoria = teclado.nextLine();
            System.out.println();

            statement.setString(1, categoria);
            ResultSet rs1 = statement.executeQuery();

            while (rs1.next()) {
                String codigoProducto = rs1.getString("productCode");

                statement2.setString(1, codigoProducto);
                ResultSet rs2 = statement2.executeQuery();
                if (rs2.next()) {
                    System.out.println("Nombre del producto: " + rs2.getString("productName"));
                }

                statement3.setString(1, codigoProducto);
                ResultSet rs3 = statement3.executeQuery();
                if (rs3.next()) {
                    System.out.println("Cantidad pedida: " + rs3.getString("quantityOrdered"));
                }

                statement4.setString(1, codigoProducto);
                ResultSet rs4 = statement4.executeQuery();
                double precio = 0;
                while (rs4.next()) {
                    precio = precio + rs4.getDouble("priceEach");
                }
                System.out.println("Total de las unidades: " + precio);


                System.out.println("-------------------------------------------");
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
