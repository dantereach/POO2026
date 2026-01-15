package Proceso;

import Data.Ticket;
import Data.Vehiculo;
import java.util.List;

public class TicketGenerator {
    
    public Ticket generarTicket(String nombreCliente, List<Vehiculo> vehiculosSeleccionados) {
        if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }
        
        if (vehiculosSeleccionados == null || vehiculosSeleccionados.isEmpty()) {
            throw new IllegalArgumentException("Debe seleccionar al menos un vehículo");
        }
        
        return new Ticket(nombreCliente, vehiculosSeleccionados);
    }
    
    public void mostrarTicket(Ticket ticket) {
        System.out.println(ticket);
    }
}
