package edu.miguel.gonzalez.actividad2.proceso;
/**
 * Clase que implementa la operación de resta.
 */
public class resta implements operacion {

    /**
     * Realiza la resta de dos números.
     *
     * @param a minuendo
     * @param b sustraendo
     * @return la resta de a menos b
     */
    public static double realizarOperacion(double a, double b) {
        return a - b;
    }

    /**
     * Resta dos números.
     *
     * @param a minuendo
     * @param b sustraendo
     * @return la resta de a menos b
     */
    public double ejecutar(double a, double b) {
        return realizarOperacion(a, b);
    }
}