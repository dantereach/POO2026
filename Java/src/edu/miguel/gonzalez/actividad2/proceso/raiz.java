package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de raíz.
 * Calcula la raíz de índice {@code b} del número {@code a}.
 */
public class raiz implements operacion {

    /**
     * {@inheritDoc}
     *
     * @throws ArithmeticException si {@code b} es cero
     */
    @Override
    public double ejecutar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("El índice de la raíz no puede ser cero.");
        }
        // Raíz de índice b de a = a^(1/b)
        return Math.pow(a, 1.0 / b);
    }
}