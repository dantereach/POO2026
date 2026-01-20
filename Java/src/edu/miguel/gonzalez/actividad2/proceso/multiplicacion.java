package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de multiplicación.
 */
public class multiplicacion implements operacion {

    /**
     * {@inheritDoc}
     */
    @Override
    public double ejecutar(double a, double b) {
        return a * b;
    }
}