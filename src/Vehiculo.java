/**
 * Clase que representa un vehículo en la concesionaria
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    /**
     * Constructor de la clase Vehiculo
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     * @param anio Año del vehículo
     * @param precio Precio del vehículo
     */
    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d) - $%.2f", marca, modelo, anio, precio);
    }
}
