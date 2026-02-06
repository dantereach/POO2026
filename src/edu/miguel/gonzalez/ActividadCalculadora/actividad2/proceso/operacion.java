package edu.miguel.gonzalez.ActividadCalculadora.actividad2.proceso;



/**
 * Clase abstracta para operaciones que se construyen
 * a partir de operaciones básicas (suma y resta).
 */
abstract class OperacionCompuesta extends operacion {

    /**
     * Constructor por defecto.
     */
    public OperacionCompuesta() {
        super();
    }

    /**
     * Suma dos números usando la operación básica.
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return la suma de a y b
     */
    protected double sumar(double a, double b) {
        return Suma.realizarOperacion(a, b);
    }

    /**
     * Resta dos números usando la operación básica.
     *
     * @param a minuendo
     * @param b sustraendo
     * @return la resta de a menos b
     */
    protected double restar(double a, double b) {
        return Resta.realizarOperacion(a, b);
    }
}