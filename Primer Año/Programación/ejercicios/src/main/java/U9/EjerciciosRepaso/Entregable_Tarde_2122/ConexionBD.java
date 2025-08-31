package U9.EjerciciosRepaso.Entregable_Tarde_2122;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                String driver = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3336/classicmodels?autoReconnect=true";
                String pwd = "XXXXX";
                String usr = "root";
                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pwd);
                System.out.println("Conexion completada");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public static void close() {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            // Falla el cierre de la conexión
            System.err.println(e.getMessage());
        }
    }
}
