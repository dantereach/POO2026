package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de módulo.
 */
public class modulo implements operacion {

    /**
     * Calcula el módulo (resto) de a entre b.
     *
     * @param a dividendo
     * @param b divisor
     * @return el resto de dividir a entre b
     * @throws ArithmeticException si b es cero
     */
    public double ejecutar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede calcular el módulo con divisor cero.");
        }

        resta resta = new resta();

        while (a >= b) {
            a = resta.ejecutar(a, b);
        }

        return a;
    }
}