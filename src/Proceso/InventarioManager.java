package Proceso;

import Data.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class InventarioManager {
    private List<Vehiculo> inventario;

    public InventarioManager() {
        this.inventario = new ArrayList<>();
        inicializarInventario();
    }

    private void inicializarInventario() {
        inventario.add(new Vehiculo(1, "Toyota", "Corolla", 2023, 25000.00));
        inventario.add(new Vehiculo(2, "Honda", "Civic", 2023, 27000.00));
        inventario.add(new Vehiculo(3, "Ford", "Mustang", 2023, 45000.00));
        inventario.add(new Vehiculo(4, "Chevrolet", "Camaro", 2022, 42000.00));
        inventario.add(new Vehiculo(5, "Nissan", "Sentra", 2023, 23000.00));
        inventario.add(new Vehiculo(6, "Mazda", "CX-5", 2023, 32000.00));
        inventario.add(new Vehiculo(7, "Volkswagen", "Jetta", 2023, 26000.00));
        inventario.add(new Vehiculo(8, "Hyundai", "Elantra", 2023, 24000.00));
    }

    public List<Vehiculo> getInventario() {
        return inventario;
    }

    public Vehiculo getVehiculoPorId(int id) {
        for (Vehiculo vehiculo : inventario) {
            if (vehiculo.getId() == id) {
                return vehiculo;
            }
        }
        return null;
    }

    public void mostrarInventario() {
        System.out.println("\n========================================");
        System.out.println("    INVENTARIO DE VEHÍCULOS");
        System.out.println("========================================\n");
        
        for (Vehiculo vehiculo : inventario) {
            System.out.println(vehiculo);
        }
        
        System.out.println("\n========================================\n");
    }

    public boolean existeVehiculo(int id) {
        return getVehiculoPorId(id) != null;
    }
}
