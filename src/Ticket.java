import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Clase que representa un ticket de venta
 */
public class Ticket {
    private String nombreCliente;
    private List<Vehiculo> vehiculosComprados;
    private double total;
    private LocalDateTime fechaTransaccion;

    /**
     * Constructor de la clase Ticket
     * @param nombreCliente Nombre del cliente
     * @param vehiculosComprados Lista de vehículos comprados
     */
    public Ticket(String nombreCliente, List<Vehiculo> vehiculosComprados) {
        this.nombreCliente = nombreCliente;
        this.vehiculosComprados = vehiculosComprados;
        this.fechaTransaccion = LocalDateTime.now();
        this.total = calcularTotal();
    }

    /**
     * Calcula el total sumando el precio de todos los vehículos
     * @return Total a pagar
     */
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
        return vehiculosComprados;
    }

    public double getTotal() {
        return total;
    }

    public LocalDateTime getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Genera el texto del ticket con formato
     * @return Ticket formateado como String
     */
    public String generarTicket() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        sb.append("\n");
        sb.append("========================================\n");
        sb.append("         TICKET DE VENTA\n");
        sb.append("========================================\n");
        sb.append("Cliente: ").append(nombreCliente).append("\n");
        sb.append("Fecha: ").append(fechaTransaccion.format(formatter)).append("\n");
        sb.append("----------------------------------------\n");
        sb.append("Vehículos comprados:\n\n");
        
        for (int i = 0; i < vehiculosComprados.size(); i++) {
            sb.append((i + 1)).append(". ").append(vehiculosComprados.get(i)).append("\n");
        }
        
        sb.append("----------------------------------------\n");
        sb.append(String.format("TOTAL A PAGAR: $%.2f\n", total));
        sb.append("========================================\n");
        
        return sb.toString();
    }
}
