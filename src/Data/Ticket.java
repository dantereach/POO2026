package Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private String nombreCliente;
    private List<Vehiculo> vehiculosComprados;
    private double total;
    private LocalDateTime fechaTransaccion;

    public Ticket(String nombreCliente, List<Vehiculo> vehiculosComprados) {
        this.nombreCliente = nombreCliente;
        this.vehiculosComprados = new ArrayList<>(vehiculosComprados);
        this.fechaTransaccion = LocalDateTime.now();
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        double suma = 0;
        for (Vehiculo vehiculo : vehiculosComprados) {
            suma += vehiculo.getPrecio();
        }
        return suma;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public List<Vehiculo> getVehiculosComprados() {
        return new ArrayList<>(vehiculosComprados);
    }

    public double getTotal() {
        return total;
    }

    public LocalDateTime getFechaTransaccion() {
        return fechaTransaccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        sb.append("\n========================================\n");
        sb.append("          TICKET DE VENTA\n");
        sb.append("========================================\n");
        sb.append("Fecha: ").append(fechaTransaccion.format(formatter)).append("\n");
        sb.append("Cliente: ").append(nombreCliente).append("\n");
        sb.append("----------------------------------------\n");
        sb.append("Vehículos comprados:\n\n");
        
        for (Vehiculo vehiculo : vehiculosComprados) {
            sb.append("  • ").append(vehiculo.getMarca()).append(" ").append(vehiculo.getModelo())
              .append(" (").append(vehiculo.getAnio()).append(")\n");
            sb.append("    Precio: $").append(String.format("%.2f", vehiculo.getPrecio())).append("\n\n");
        }
        
        sb.append("----------------------------------------\n");
        sb.append("TOTAL A PAGAR: $").append(String.format("%.2f", total)).append("\n");
        sb.append("========================================\n");
        
        return sb.toString();
    }
}
