import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal del sistema de ventas de vehículos
 * Implementa una interfaz de línea de comandos (CLI)
 */
public class SistemaVentas {
    private Concesionaria concesionaria;
    private Scanner scanner;

    /**
     * Constructor del sistema de ventas
     */
    public SistemaVentas() {
        this.concesionaria = new Concesionaria();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Método principal que ejecuta el sistema
     */
    public void ejecutar() {
        mostrarBienvenida();
        
        // Mostrar inventario
        concesionaria.mostrarInventario();
        
        // Seleccionar vehículos
        List<Vehiculo> vehiculosSeleccionados = seleccionarVehiculos();
        
        if (vehiculosSeleccionados.isEmpty()) {
            System.out.println("No se seleccionaron vehículos. Finalizando...");
            return;
        }
        
        // Solicitar nombre del cliente
        String nombreCliente = solicitarNombreCliente();
        
        // Generar y mostrar ticket
        Ticket ticket = new Ticket(nombreCliente, vehiculosSeleccionados);
        System.out.println(ticket.generarTicket());
        
        System.out.println("¡Gracias por su compra!");
        scanner.close();
    }

    /**
     * Muestra el mensaje de bienvenida
     */
    private void mostrarBienvenida() {
        System.out.println("\n========================================");
        System.out.println("  SISTEMA DE VENTAS DE VEHÍCULOS");
        System.out.println("========================================");
    }

    /**
     * Permite al usuario seleccionar uno o más vehículos
     * @return Lista de vehículos seleccionados
     */
    private List<Vehiculo> seleccionarVehiculos() {
        List<Vehiculo> seleccionados = new ArrayList<>();
        boolean continuarSeleccion = true;
        
        while (continuarSeleccion) {
            System.out.print("Ingrese el número del vehículo que desea comprar (o 0 para finalizar): ");
            
            try {
                int opcion = Integer.parseInt(scanner.nextLine().trim());
                
                if (opcion == 0) {
                    continuarSeleccion = false;
                } else if (concesionaria.esIndiceValido(opcion)) {
                    Vehiculo vehiculo = concesionaria.obtenerVehiculoPorIndice(opcion);
                    seleccionados.add(vehiculo);
                    System.out.println("✓ Vehículo agregado: " + vehiculo);
                    System.out.println("Total de vehículos seleccionados: " + seleccionados.size());
                    System.out.println();
                } else {
                    System.out.println("✗ ERROR: Número de vehículo inválido. Intente nuevamente.");
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                System.out.println("✗ ERROR: Debe ingresar un número válido.");
                System.out.println();
            }
        }
        
        return seleccionados;
    }

    /**
     * Solicita y valida el nombre del cliente
     * @return Nombre del cliente
     */
    private String solicitarNombreCliente() {
        String nombre = "";
        boolean nombreValido = false;
        
        while (!nombreValido) {
            System.out.print("\nIngrese el nombre del cliente: ");
            nombre = scanner.nextLine().trim();
            
            if (nombre.isEmpty()) {
                System.out.println("✗ ERROR: El nombre no puede estar vacío.");
            } else if (nombre.length() < 2) {
                System.out.println("✗ ERROR: El nombre debe tener al menos 2 caracteres.");
            } else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                System.out.println("✗ ERROR: El nombre solo debe contener letras y espacios.");
            } else {
                nombreValido = true;
            }
        }
        
        return nombre;
    }

    /**
     * Método main - punto de entrada del programa
     */
    public static void main(String[] args) {
        SistemaVentas sistema = new SistemaVentas();
        sistema.ejecutar();
    }
}
