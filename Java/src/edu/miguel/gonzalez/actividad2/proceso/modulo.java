package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de módulo (resto de la división).
 */
public class modulo implements operacion {

    /**
     * {@inheritDoc}
     *
     * @throws ArithmeticException si el segundo operando es cero
     */
    @Override
    public double ejecutar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede calcular el módulo con divisor cero.");
        }
        return a % b;
    }
}