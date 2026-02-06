package edu.miguel.gonzalez.ActividadCalculadora.actividad2.proceso;

/**
 * Clase abstracta base que representa una operación matemática.
 * Define el comportamiento común para todas las operaciones.
 */
abstract class operacion {

    /**
     * Ejecuta la operación con los operandos indicados.
     *
     * @param a primer operando
     * @param b segundo operando
     * @return el resultado de la operación
     */
    public abstract double ejecutar(double a, double b);

    /**
     * Realiza la operación de forma estática.
     * Por defecto crea una instancia y ejecuta.
     *
     * @param a primer operando
     * @param b segundo operando
     * @return el resultado de la operación
     */
    public static double realizarOperacion(double a, double b) {
        throw new UnsupportedOperationException("Debe implementarse en la subclase");
    }

    /**
     * Valida que el divisor no sea cero.
     *
     * @param divisor valor a validar
     * @throws ArithmeticException si el divisor es cero
     */
    protected void validarDivisorNoZero(double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("El divisor no puede ser cero.");
        }
    }

    /**
     * Valida que un número sea positivo.
     *
     * @param numero valor a validar
     * @param nombreParametro nombre del parámetro para el mensaje de error
     * @throws ArithmeticException si el número no es positivo
     */
    protected void validarPositivo(double numero, String nombreParametro) {
        if (numero <= 0) {
            throw new ArithmeticException(nombreParametro + " debe ser mayor que cero.");
        }
    }
}