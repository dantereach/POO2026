package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de módulo (resto de la división)
 * sin usar el operador %.
 */
public class modulo implements operacion {

    /**
     * Calcula el módulo usando división y resta.
     *
     * @param a dividendo
     * @param b divisor
     * @return el resto de dividir a entre b
     * @throws ArithmeticException si el segundo operando es cero
     */
    public double ejecutar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede calcular el módulo con divisor cero.");
        }

        resta resta = new resta();

        // Manejo de valores negativos
        boolean aNegativo = a < 0;
        if (aNegativo) {
            a = resta.ejecutar(0, a);
        }
        if (b < 0) {
            b = resta.ejecutar(0, b);
        }

        // Restar b de a repetidamente hasta que a < b
        while (a >= b) {
            a = resta.ejecutar(a, b);
        }

        // Si el dividendo era negativo, el resto también
        if (aNegativo) {
            a = resta.ejecutar(0, a);
        }

        return a;
    }
}