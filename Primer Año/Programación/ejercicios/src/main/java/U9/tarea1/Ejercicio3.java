package U9.tarea1;

import java.sql.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE employeeNumber = '1143'");

            while (rs.next()) {
                System.out.println("Nombre: "+rs.getString("firstName"));
                System.out.println("Apellido: "+rs.getString("lastName"));
                System.out.println("ID: "+rs.getString("employeeNumber"));
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }finally{
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
