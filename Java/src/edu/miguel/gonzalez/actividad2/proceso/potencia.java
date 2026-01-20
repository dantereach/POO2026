package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de potencia.
 * Calcula {@code a} elevado a {@code b}.
 */
public class potencia implements operacion {

    /**
     * {@inheritDoc}
     */
    @Override
    public double ejecutar(double a, double b) {
        return Math.pow(a, b);
    }
}