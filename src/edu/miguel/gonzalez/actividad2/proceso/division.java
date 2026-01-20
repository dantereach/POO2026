package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de división
 * usando restas sucesivas (sin usar el operador /).
 */
public class division implements operacion {

    /**
     * Divide dos números mediante restas repetidas.
     *
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a entre b
     * @throws ArithmeticException si el segundo operando es cero
     */
    public double ejecutar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }

        resta resta = new resta();
        suma suma = new suma();

        // Manejo de signos
        boolean negativo = false;
        if (b < 0) {
            negativo = !negativo;
            b = resta.ejecutar(0, b); // b = -b
        }
        if (a < 0) {
            negativo = !negativo;
            a = resta.ejecutar(0, a); // a = -a
        }

        double cociente = 0;
        double residuo = a;

        // Restar 'b' de 'a' repetidamente
        while (residuo >= b) {
            residuo = resta.ejecutar(residuo, b);
            cociente = suma.ejecutar(cociente, 1);
        }

        // Aproximación decimal (10 iteraciones)
        double factor = 0.1;
        for (int i = 0; i < 10; i++) {
            while (residuo >= b) {
                residuo = resta.ejecutar(residuo, b);
                cociente = suma.ejecutar(cociente, factor);
            }
            residuo = residuo + residuo + residuo + residuo + residuo +
                    residuo + residuo + residuo + residuo + residuo; // *10
            factor = factor - factor + (factor + factor + factor + factor + factor +
                    factor + factor + factor + factor + factor) - factor; // /10
        }

        // Aplicar signo
        if (negativo) {
            cociente = resta.ejecutar(0, cociente);
        }

        return cociente;
    }
}