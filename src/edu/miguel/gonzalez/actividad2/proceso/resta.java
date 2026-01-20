package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de resta.
 */
public class resta implements operacion {

    /**
     * Resta dos números.
     *
     * @param a minuendo
     * @param b sustraendo
     * @return la resta de a menos b
     */
    public double ejecutar(double a, double b) {
        return a - b;
    }
}