package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de división.
 */
public class division implements operacion {

    /**
     * {@inheritDoc}
     *
     * @throws ArithmeticException si el segundo operando es cero
     */
    @Override
    public double ejecutar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }
}