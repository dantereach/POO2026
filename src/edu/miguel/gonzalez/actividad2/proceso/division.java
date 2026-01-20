package edu.miguel.gonzalez.actividad2.proceso;



/**
 * Clase que implementa la operación de división.
 * Solo usa resta, sin el operador /.
 */
public class division implements operacion {

    /**
     * Realiza la división de dos números usando restas.
     *
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a entre b
     * @throws ArithmeticException si b es cero
     */
    public static double realizarOperacion(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }

        boolean negativo = false;

        if (b < 0) {
            negativo = true;
            b = 0 - b;
        }
        if (a < 0) {
            negativo = !negativo;
            a = 0 - a;
        }

        double cociente = 0;

        while (a >= b) {
            a = a - b;
            cociente = cociente + 1;
        }

        if (negativo) {
            cociente = 0 - cociente;
        }

        return cociente;
    }

    /**
     * Divide dos números.
     *
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a entre b
     * @throws ArithmeticException si b es cero
     */
    public double ejecutar(double a, double b) {
        return realizarOperacion(a, b);
    }
}