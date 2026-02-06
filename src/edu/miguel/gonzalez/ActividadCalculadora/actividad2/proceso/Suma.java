package edu.miguel.gonzalez.ActividadCalculadora.actividad2.proceso;

/**
 * Clase que implementa la operación de suma.
 * Hereda de OperacionBasica ya que usa directamente el operador +.
 */
public class Suma extends OperacionBasica {

    /**
     * Realiza la suma de dos números.
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return la suma de a y b
     */
    public static double realizarOperacion(double a, double b) {
        return a + b;
    }

    /**
     * Suma dos números.
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return la suma de a y b
     */
    public double ejecutar(double a, double b) {
        return realizarOperacion(a, b);
    }
}