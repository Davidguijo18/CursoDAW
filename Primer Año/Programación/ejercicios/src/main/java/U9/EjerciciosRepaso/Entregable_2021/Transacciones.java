package U9.EjerciciosRepaso.Entregable_2021;

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
            System.out.println("       INSERCION DE LA OFICINA");
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
                System.out.println("Se ha insertado la oficina con exito");
            } else {
                System.out.println("Error al insertar la oficina");
            }


            System.out.println("\n-----------------------------------------------------");
            System.out.println("         INSERCION DEL PRIMER EMPLEADO");

            String sql2 = "INSERT INTO employees (officeCode, firstName, lastName, employeeNumber,extension,email,jobTitle) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            System.out.print("Introduce el nombre del empleado: ");
            String nombreEmpleado1 = teclado.nextLine();

            System.out.print("Introduce el apellido del empleado: ");
            String apellidoEmpleado1 = teclado.nextLine();

            System.out.print("Introduce el numero de empleado: ");
            String numEmpleado1 = teclado.nextLine();

            System.out.print("Introduce la extension del empleado: ");
            String extensionEmpleado1 = teclado.nextLine();

            System.out.print("Introduce el email: ");
            String emailEmpleado1 = teclado.nextLine();

            System.out.print("Titulo: ");
            String tituloEmpleado1 = teclado.nextLine();

            statement2.setString(1, codOficina);
            statement2.setString(2, nombreEmpleado1);
            statement2.setString(3, apellidoEmpleado1);
            statement2.setString(4, numEmpleado1);
            statement2.setString(5, extensionEmpleado1);
            statement2.setString(6, emailEmpleado1);
            statement2.setString(7, tituloEmpleado1);

            int insercioEmpleado1 = statement2.executeUpdate();
            if (insercioEmpleado1 != 0) {
                System.out.println("El primer empleado se ha añadido");
                System.out.println();
                System.out.println();
            } else {
                System.out.println("Error al insertar el primer empleado");
                System.out.println();
                System.out.println();
            }


            System.out.println("\n-----------------------------------------------------");
            System.out.println("         INSERCION DEL SEGUNDO EMPLEADO");

            String sql3 = "INSERT INTO employees (officeCode, firstName, lastName, employeeNumber,extension,email,jobTitle) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement statement3 = con.prepareStatement(sql3);

            System.out.print("Introduce el nombre del empleado: ");
            String nombreEmpleado2 = teclado.nextLine();

            System.out.print("Introduce el apellido del empleado: ");
            String apellidoEmpleado2 = teclado.nextLine();

            System.out.print("Introduce el numero de empleado: ");
            String numEmpleado2 = teclado.nextLine();

            System.out.print("Introduce la extension del empleado: ");
            String extensionEmpleado2 = teclado.nextLine();

            System.out.print("Introduce el email: ");
            String emailEmpleado2 = teclado.nextLine();

            System.out.print("Titulo: ");
            String tituloEmpleado2 = teclado.nextLine();

            statement3.setString(1, codOficina);
            statement3.setString(2, nombreEmpleado2);
            statement3.setString(3, apellidoEmpleado2);
            statement3.setString(4, numEmpleado2);
            statement3.setString(5, extensionEmpleado2);
            statement3.setString(6, emailEmpleado2);
            statement3.setString(7, tituloEmpleado2);

            int insercioEmpleado2 = statement3.executeUpdate();
            if (insercioEmpleado2 != 0) {
                System.out.println("El segundo empleado se ha añadido");
                System.out.println();
                System.out.println();
            } else {
                System.out.println("Error al insertar el segundo empleado");
                System.out.println();
                System.out.println();
            }


            System.out.println("\n-----------------------------------------------------");
            System.out.println("           INSERCION DEL CLIENTE");

            String sql4 = "INSERT INTO customers (customerNumber,customerName,contactFirstName,contactLastName,phone,addressLine1,city,postalCode,country,salesRepEmployeeNumber) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement4 = con.prepareStatement(sql4);

            System.out.print("Introduce el numero de cliente: ");
            int numCliente = teclado.nextInt();

            teclado.nextLine();
            System.out.print("Introduce el nombre del cliente: ");
            String nombreCliente = teclado.nextLine();

            System.out.print("Introduce el primer apellido: ");
            String primerApellidoCliente = teclado.nextLine();

            System.out.print("Introduce el segundo apellido: ");
            String segundoApellidoCliente = teclado.nextLine();

            System.out.print("Introduce el numero de telefono: ");
            String telefonoCliente = teclado.nextLine();

            System.out.print("Introduce la direccion: ");
            String direccionCliente = teclado.nextLine();

            System.out.print("Introduce la ciudad: ");
            String ciudadCliente = teclado.nextLine();

            System.out.print("Introduce el codigo postal: ");
            String codPostalCliente = teclado.nextLine();

            System.out.print("Introduce el pais: ");
            String paisCliente = teclado.nextLine();

            statement4.setInt(1, numCliente);
            statement4.setString(2, nombreCliente);
            statement4.setString(3, primerApellidoCliente);
            statement4.setString(4, segundoApellidoCliente);
            statement4.setString(5, telefonoCliente);
            statement4.setString(6, direccionCliente);
            statement4.setString(7, ciudadCliente);
            statement4.setString(8, codPostalCliente);
            statement4.setString(9, paisCliente);
            statement4.setString(10, numEmpleado2);

            int insercionCliente = statement4.executeUpdate();
            if (insercionCliente != 0) {
                System.out.println("Se ha creado al cliente con exito");
                System.out.println();
            } else {
                System.out.println("Error al añadir el cliente");
                System.out.println();
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


    public void transaccion2() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("           INSERCION DE NUEVA CATEGORIA");

            String sql = "INSERT INTO productlines(productLine,textDescription) VALUES (?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce la linea de producto: ");
            String lineaProducto = teclado.nextLine();

            System.out.print("Introduce la descripcion del producto: ");
            String descripcionProducto = teclado.nextLine();

            statement.setString(1, lineaProducto);
            statement.setString(2, descripcionProducto);

            int insercionProductLines = statement.executeUpdate();
            if (insercionProductLines != 0) {
                System.out.println("La nueva categoria se ha insertado correctamente");
                System.out.println();
            } else {
                System.out.println("Error al insertar la nueva categoria");
                System.out.println();
            }


            System.out.println("\n-----------------------------------------------------");
            System.out.println("          INSERCION DE NUEVO PRODUCTO");

            String sql2 = "INSERT INTO products (productCode,productName,productLine,productScale,productVendor,productDescription,quantityInStock,buyPrice,MSRP) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            System.out.print("Introduce el codigo del producto: ");
            String codProducto = teclado.nextLine();

            System.out.print("Introduce el nombre del producto: ");
            String nombreProducto = teclado.nextLine();

            System.out.print("Introduce la escala del producto: ");
            String escalaProducto = teclado.nextLine();

            System.out.print("Introduce el vendedor del producto: ");
            String vendedorProducto = teclado.nextLine();

            System.out.print("Introduce la descripcion del producto: ");
            String descripcion = teclado.nextLine();

            System.out.print("Introduce la cantidad que hay en stock: ");
            String stock = teclado.nextLine();

            System.out.print("Introduce el precio de venta: ");
            String precioVenta = teclado.nextLine();

            System.out.print("Introduce el MSRP: ");
            String msrp = teclado.nextLine();

            statement2.setString(1, codProducto);
            statement2.setString(2, nombreProducto);
            statement2.setString(3, lineaProducto);
            statement2.setString(4, escalaProducto);
            statement2.setString(5, vendedorProducto);
            statement2.setString(6, descripcion);
            statement2.setString(7, stock);
            statement2.setString(8, precioVenta);
            statement2.setString(9, msrp);

            int insercionProducto = statement2.executeUpdate();
            if (insercionProducto != 0) {
                System.out.println("El producto se ha insertado correctamente");
            } else {
                System.out.println("Error al insertar el producto");
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
