package edu.miguel.gonzalez.actividad2.proceso;


/**
 * Clase que implementa la operación de módulo.
 * Solo usa resta, sin el operador %.
 */
public class modulo implements operacion {

    /**
     * Realiza el módulo (resto) de dos números usando restas.
     *
     * @param a dividendo
     * @param b divisor
     * @return el resto de dividir a entre b
     * @throws ArithmeticException si b es cero
     */
    public static double realizarOperacion(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede calcular el módulo con divisor cero.");
        }

        if (b < 0) {
            b = 0 - b;
        }

        boolean aNegativo = a < 0;
        if (aNegativo) {
            a = 0 - a;
        }

        while (a >= b) {
            a = a - b;
        }

        if (aNegativo) {
            a = 0 - a;
        }

        return a;
    }

    /**
     * Calcula el módulo de dos números.
     *
     * @param a dividendo
     * @param b divisor
     * @return el resto de dividir a entre b
     * @throws ArithmeticException si b es cero
     */
    public double ejecutar(double a, double b) {
        return realizarOperacion(a, b);
    }
}