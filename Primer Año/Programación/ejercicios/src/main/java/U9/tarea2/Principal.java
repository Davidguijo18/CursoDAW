package U9.tarea2;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws SQLException {
        Connection con = ConexionBD.getConnection();
        ADClassicModels adClassicModels = new ADClassicModels();
        try {
            con.setAutoCommit(false);

            List<Employee> listaEmpleados = adClassicModels.getEmpleados();
            for (Employee e : listaEmpleados) {
                System.out.println(e);
            }

            System.out.println();
            System.out.println("-----------------------------------------------------------------");
            System.out.println();

            List<Ofice> listaOficina = adClassicModels.getOffices();
            for (Ofice o : listaOficina) {
                System.out.println(o);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getSQLState());
        }
        con.close();
    }
}
