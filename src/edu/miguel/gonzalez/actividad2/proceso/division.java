package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de división.
 */
public class division implements operacion {

    /**
     * Divide dos números.
     *
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a entre b
     * @throws ArithmeticException si b es cero
     */
    public double ejecutar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }

        resta resta = new resta();
        double cociente = 0;

        while (a >= b) {
            a = resta.ejecutar(a, b);
            cociente = cociente + 1;
        }

        return cociente;
    }
}