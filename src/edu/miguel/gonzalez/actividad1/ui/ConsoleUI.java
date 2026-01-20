package edu.miguel.gonzalez.actividad1.ui;


import edu.miguel.gonzalez.actividad1.data.Ticket;
import edu.miguel.gonzalez.actividad1.proceso.InventarioManager;
import edu.miguel.gonzalez.actividad1.proceso.TicketGenerator;
import edu.miguel.gonzalez.actividad1.data.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class ConsoleUI {
        private InventarioManager inventarioManager;
        private TicketGenerator ticketGenerator;

        public ConsoleUI() {
            this.inventarioManager = new InventarioManager();
            this.ticketGenerator = new TicketGenerator();
        }

        public void iniciar() {
            try (Scanner scanner = new Scanner(System.in)) {
                mostrarBienvenida();

                // Paso 1: Mostrar inventario
                inventarioManager.mostrarInventario();

                // Paso 2: Seleccionar vehículos
                List<Vehiculo> vehiculosSeleccionados = seleccionarVehiculos(scanner);

                if (vehiculosSeleccionados.isEmpty()) {
                    System.out.println("No se seleccionaron vehículos. Programa terminado.");
                    return;
                }

                // Paso 3: Solicitar nombre del cliente
                String nombreCliente = solicitarNombreCliente(scanner);

                // Paso 4: Generar ticket
                Ticket ticket = ticketGenerator.generarTicket(nombreCliente, vehiculosSeleccionados);

                // Paso 5: Mostrar ticket
                ticketGenerator.mostrarTicket(ticket);

                System.out.println("¡Gracias por su compra!");
            }
        }

        private void mostrarBienvenida() {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║   SISTEMA DE VENTAS - CONCESIONARIA   ║");
            System.out.println("╚════════════════════════════════════════╝\n");
        }

        private List<Vehiculo> seleccionarVehiculos(Scanner scanner) {
            List<Vehiculo> seleccionados = new ArrayList<>();
            boolean continuarSeleccionando = true;

            while (continuarSeleccionando) {
                System.out.print("Ingrese el ID del vehículo que desea comprar (o 0 para terminar): ");

                try {
                    int id = Integer.parseInt(scanner.nextLine().trim());

                    if (id == 0) {
                        continuarSeleccionando = false;
                    } else if (inventarioManager.existeVehiculo(id)) {
                        Vehiculo vehiculo = inventarioManager.getVehiculoPorId(id);
                        seleccionados.add(vehiculo);
                        System.out.println("✓ Vehículo agregado: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
                    } else {
                        System.out.println("✗ Error: No existe un vehículo con ID " + id + ". Intente nuevamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("✗ Error: Debe ingresar un número válido.");
                }
            }

            return seleccionados;
        }

        private String solicitarNombreCliente(Scanner scanner) {
            String nombre = "";
            boolean nombreValido = false;

            while (!nombreValido) {
                System.out.print("\nIngrese el nombre del cliente: ");
                nombre = scanner.nextLine().trim();

                if (nombre.isEmpty()) {
                    System.out.println("✗ Error: El nombre no puede estar vacío.");
                } else {
                    nombreValido = true;
                }
            }

            return nombre;
        }
    }

