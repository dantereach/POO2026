package edu.miguel.gonzalez.ActividadCalculadora.actividad2.proceso;

/**
 * Clase que implementa la operación de división.
 * Hereda de OperacionCompuesta ya que se construye usando restas.
 */
public class Division extends OperacionCompuesta {

    /**
     * Realiza la división de dos números usando restas.
     *
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a entre b
     * @throws ArithmeticException si b es cero
     */
    public static double realizarOperacion(double a, double b) {
        Division div = new Division();
        return div.ejecutar(a, b);
    }

    /**
     * Divide dos números usando restas repetidas.
     *
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a entre b
     * @throws ArithmeticException si b es cero
     */
    public double ejecutar(double a, double b) {
        validarDivisorNoZero(b);

        boolean negativo = false;

        if (b < 0) {
            negativo = !negativo;
            b = restar(0, b);
        }
        if (a < 0) {
            negativo = !negativo;
            a = restar(0, a);
        }

        double cociente = 0;

        while (a >= b) {
            a = restar(a, b);
            cociente = sumar(cociente, 1);
        }

        if (negativo) {
            cociente = restar(0, cociente);
        }

        return cociente;
    }
}