package U4.tarea4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pizza pizza = new Pizza();
        Pedido pedido = new Pedido();
        Pizzeria pizzeria = new Pizzeria();

        int opcion, opcion1;

        do {
            System.out.println("\n--- MENU PIZZERIA ---");
            System.out.println("1 - Modificar pizza");
            System.out.println("2 - Gestionar Pedido");
            System.out.println("3 - Gestionar Pizzeria");
            System.out.println("4 - Finalizar programa");

            System.out.print("Introduce una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\n----Modificacion de la pizza----");
                    System.out.println("\n1 - Mostrar tamaños disponibles");
                    System.out.println("2 - Modificar tamaño");
                    System.out.println("3 - Añadir ingrediente");
                    System.out.println("4 - Mostrar cantidad de ingredientes");
                    System.out.println("5 - Mostrar informacion de la pizza");
                    System.out.println("6 - Salir");


                    do {
                        System.out.print("\nIntroduce una opcion: ");
                        opcion1 = teclado.nextInt();

                        switch (opcion1) {
                            case 1:
                                pizza.mostrarTamanoDisponible();
                                break;
                            case 2:
                                pizza.modificarTamano();
                                break;
                            case 3:
                                System.out.print("Introduce el nombre del ingrediente: ");
                                String nombre = teclado.nextLine();

                                teclado.nextLine();

                                System.out.print("Introduce las calorias del ingrediente: ");
                                int calorias = teclado.nextInt();

                                Ingrediente ingrediente1 = new Ingrediente(nombre, calorias);
                                pizza.anadirIngrediente(ingrediente1);
                                break;
                            case 4:
                                pizza.obtenerCantidadIngredientes();
                                break;
                            case 5:
                                pizza.mostrarInformacion();
                                break;

                            case 6:
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;

                        }

                    } while (opcion1 != 6);

                    break;

                case 2:
                    do {
                        System.out.print("\n----Gestion del pedido----");
                        System.out.println("\n1 - Pizza pedida");
                        System.out.println("2 - Fecha del pedido");
                        System.out.println("3 - Hacer pedido estrella");
                        System.out.println("3 - Salir");

                        System.out.print("\nIntroduce una opcion: ");
                        opcion1 = teclado.nextInt();

                        switch (opcion1) {
                            case 1:
                                pedido.comprobarPizza();
                                break;
                            case 2:
                                pedido.obtenerHoraPedido();
                                break;
                            case 3:
                                pedido.realizarPedidoEstrella();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }

                    } while (opcion1 != 3);
                    break;

                case 3:
                    do {
                        System.out.print("\n----Gestion de la pizzeria----");
                        System.out.println("\n1 - Aumentar pedidos");
                        System.out.println("2 - Mostrar todos los pedidos");
                        System.out.println("3 - Mostrar cantidad de pedidos");
                        System.out.println("4 - Salir");

                        System.out.print("\nIntroduce una opcion: ");
                        opcion1 = teclado.nextInt();

                        switch (opcion1) {
                            case 1:
                                pizzeria.anadirPedidos();
                                break;
                            case 2:
                                pizzeria.mostrarPedidos();
                                break;
                            case 3:
                                pizzeria.mostrarCantidadPedidos();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }

                    } while (opcion1 != 4);
                    break;

                case 4:
                    System.out.println("Salista del programa");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 4);
    }
}