package U9.tarea1;

import java.sql.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            ResultSet rs = statement.executeQuery("SELECT * FROM payments WHERE amount > 30000");

            while (rs.next()) {
                System.out.println("Numero: "+rs.getString("checkNumber"));
                System.out.println("Amount: "+rs.getString("amount"));
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
