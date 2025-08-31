package U9.tarea1;

import java.sql.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            ResultSet rs = statement.executeQuery("SELECT * FROM customers WHERE STATE IS NULL");

            while (rs.next()) {
                System.out.println("Nombre: "+rs.getString("customerName"));
                System.out.println("Estado: "+rs.getString("state"));
                System.out.println("-------------------------------------------");
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
