package edu.miguel.gonzalez.actividad2.proceso;
/**
 * Interfaz que representa una operación matemática
 * con dos operandos de tipo {@code double}.
 */
public interface operacion {

    /**
     * Ejecuta la operación con los operandos indicados.
     *
     * @param a primer operando
     * @param b segundo operando
     * @return el resultado de la operación
     */
    double ejecutar(double a, double b);
}