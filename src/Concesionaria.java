import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que representa una concesionaria con inventario de vehículos
 */
public class Concesionaria {
    private List<Vehiculo> inventario;

    /**
     * Constructor de la clase Concesionaria
     */
    public Concesionaria() {
        this.inventario = new ArrayList<>();
        inicializarInventario();
    }

    /**
     * Inicializa el inventario con vehículos de ejemplo
     */
    private void inicializarInventario() {
        inventario.add(new Vehiculo("Toyota", "Corolla", 2023, 25000.00));
        inventario.add(new Vehiculo("Honda", "Civic", 2023, 27000.00));
        inventario.add(new Vehiculo("Ford", "Mustang", 2022, 45000.00));
        inventario.add(new Vehiculo("Chevrolet", "Camaro", 2023, 42000.00));
        inventario.add(new Vehiculo("Nissan", "Sentra", 2023, 22000.00));
        inventario.add(new Vehiculo("Mazda", "CX-5", 2023, 32000.00));
        inventario.add(new Vehiculo("Volkswagen", "Jetta", 2022, 24000.00));
        inventario.add(new Vehiculo("BMW", "Serie 3", 2023, 55000.00));
    }

    /**
     * Obtiene el inventario completo
     * @return Lista inmutable de vehículos en inventario
     */
    public List<Vehiculo> getInventario() {
        return Collections.unmodifiableList(inventario);
    }

    /**
     * Muestra el inventario en formato de lista numerada
     */
    public void mostrarInventario() {
        System.out.println("\n========================================");
        System.out.println("   INVENTARIO DE VEHÍCULOS DISPONIBLES");
        System.out.println("========================================\n");
        
        for (int i = 0; i < inventario.size(); i++) {
            System.out.printf("%d. %s\n", (i + 1), inventario.get(i));
        }
        
        System.out.println("========================================\n");
    }

    /**
     * Obtiene un vehículo por su índice en el inventario
     * @param indice Índice del vehículo (basado en 1)
     * @return Vehículo en el índice especificado o null si no existe
     */
    public Vehiculo obtenerVehiculoPorIndice(int indice) {
        if (indice >= 1 && indice <= inventario.size()) {
            return inventario.get(indice - 1);
        }
        return null;
    }

    /**
     * Verifica si un índice es válido
     * @param indice Índice a verificar
     * @return true si el índice es válido, false en caso contrario
     */
    public boolean esIndiceValido(int indice) {
        return indice >= 1 && indice <= inventario.size();
    }
}
