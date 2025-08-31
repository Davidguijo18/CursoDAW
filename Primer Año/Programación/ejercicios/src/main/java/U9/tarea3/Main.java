package U9.tarea3;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Insertar cliente");
            System.out.println("2. Asignar empleado a cliente");
            System.out.println("3. Añadir producto a pedido");
            System.out.println("4. Mostrar con detalle un pedido");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    insertarCliente();
                    break;
                case 2:
                    asignarEmpleadoACliente();
                    break;
                case 3:
                    anadirProductoAPedido();
                    break;
                case 4:
                    mostrarDetallePedido();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void insertarCliente() {
        Connection con = ConexionBD.getConnection();
        Scanner scanner = new Scanner(System.in);
        try {
            String sql = "INSERT INTO customers (customerNumber,customerName,contactLastName,contactFirstName,phone, addressLine1,city,country) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce el numero del cliente: ");
            String numeroCliente = scanner.nextLine();

            System.out.print("Introduce el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Dirección del cliente: ");
            String direccion = scanner.nextLine();

            System.out.print("Introduce el primer apellido: ");
            String nombreContacto = scanner.nextLine();

            System.out.print("Introduce el segundo apellido: ");
            String nombreContacto2 = scanner.nextLine();

            System.out.print("Introduce el numero de telefono: ");
            String numeroTelefono = scanner.nextLine();

            System.out.print("Introduce la ciudad: ");
            String ciudad = scanner.nextLine();

            System.out.print("Introduce el pais: ");
            String pais = scanner.nextLine();

            statement.setString(1, numeroCliente);
            statement.setString(2, nombre);
            statement.setString(3, nombreContacto2);
            statement.setString(4, nombreContacto);
            statement.setString(5, numeroTelefono);
            statement.setString(6, direccion);
            statement.setString(7, ciudad);
            statement.setString(8, pais);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Cliente insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el cliente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void asignarEmpleadoACliente() {
        Connection con = ConexionBD.getConnection();
        Scanner scanner = new Scanner(System.in);

        try {
            String sql = "UPDATE customers SET salesRepEmployeeNumber = ? WHERE customerNumber = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce el ID del empleado: ");
            String empleadoId = scanner.nextLine();
            System.out.print("Introduce el ID del cliente: ");
            String clienteId = scanner.nextLine();

            statement.setString(1, empleadoId);
            statement.setString(2, clienteId);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("El empleado ha sido asignado al cliente correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void anadirProductoAPedido() {
        Connection con = ConexionBD.getConnection();
        Scanner scanner = new Scanner(System.in);
        try {
            String sql = "INSERT INTO orderdetails (orderNumber, productCode, quantityOrdered,priceEach,orderLineNumber) VALUES (?, ?, ?, ? ,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduce el ID del pedido: ");
            String pedidoId = scanner.nextLine();

            System.out.print("Introduce el ID del producto: ");
            String productoId = scanner.nextLine();

            System.out.print("Introduce la cantidad: ");
            String cantidad = scanner.nextLine();

            System.out.print("Introduce el priceEach: ");
            String priceEach = scanner.nextLine();

            System.out.print("Introduce el orderLineNumber: ");
            String orderLineNumber = scanner.nextLine();

            statement.setString(1, pedidoId);
            statement.setString(2, productoId);
            statement.setString(3, cantidad);
            statement.setString(4, priceEach);
            statement.setString(5, orderLineNumber);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("El producto ha sido añadido al pedido correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void mostrarDetallePedido() {
        Connection con = ConexionBD.getConnection();
        Scanner scanner = new Scanner(System.in);
        try {
            String sql = "SELECT * FROM orders WHERE orderNumber = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Introduzca el número del pedido: ");
            int numeroPedido = scanner.nextInt();

            statement.setInt(1, numeroPedido);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                System.out.println("Pedido encontrado:");
                System.out.println("Número de pedido: " + rs.getInt("orderNumber"));
                System.out.println("Fecha del pedido: " + rs.getString("orderDate"));
                System.out.println("Estado del pedido: " + rs.getString("status"));
                // Aquí puedes seguir mostrando los detalles del pedido según tu esquema de base de datos
            } else {
                System.out.println("Pedido no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}