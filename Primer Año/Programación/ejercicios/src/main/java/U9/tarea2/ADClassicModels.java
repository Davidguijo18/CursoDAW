package U9.tarea2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

    Connection con = ConexionBD.getConnection();

    public ADClassicModels() {
    }

    public List getEmpleados() throws SQLException {
        List<Employee> listaEmpleados = new ArrayList<>();
        try {
            String sql = "SELECT * FROM employees";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String numeroEmpleado = rs.getString("EmployeeNumber");
                String nombreEmpleado = rs.getString("firstName");
                String apellidoEmpleado = rs.getString("lastName");
                String extension = rs.getString("extension");
                String email = rs.getString("email");
                String numeroOficina = rs.getString("officeCode");
                String reportsTo = rs.getString("reportsTo");
                String jobTittle = rs.getString("jobTitle");

                Employee employee = new Employee(numeroEmpleado, apellidoEmpleado, nombreEmpleado, extension, email, numeroOficina, reportsTo, jobTittle);
                listaEmpleados.add(employee);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getSQLState());
        }
        return listaEmpleados;
    }

    public List getOffices() throws SQLException {
        List<Ofice> listaOficinas = new ArrayList<>();

        try {

            String sql = "SELECT * FROM offices";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String codOficina = rs.getString("officeCode");
                String ciudad = rs.getString("city");
                String numTelefono = rs.getString("phone");
                String direccion1 = rs.getString("addressLine1");
                String direccion2 = rs.getString("addressLine2");
                String estado = rs.getString("state");
                String pais = rs.getString("country");
                String codPostal = rs.getString("postalCode");
                String territorio = rs.getString("territory");


                Ofice ofice = new Ofice(codOficina, ciudad, numTelefono, direccion1, direccion2, estado, pais, codPostal, territorio);
                listaOficinas.add(ofice);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getSQLState());
        }
        return listaOficinas;
    }
}
