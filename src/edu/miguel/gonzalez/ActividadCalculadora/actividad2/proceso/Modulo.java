package edu.miguel.gonzalez.ActividadCalculadora.actividad2.proceso;

/**
 * Clase que implementa la operación de módulo.
 * Hereda de OperacionCompuesta ya que se construye usando restas.
 */
public class Modulo extends OperacionCompuesta {

    /**
     * Realiza el módulo (resto) de dos números usando restas.
     *
     * @param a dividendo
     * @param b divisor
     * @return el resto de dividir a entre b
     * @throws ArithmeticException si b es cero
     */
    public static double realizarOperacion(double a, double b) {
        Modulo mod = new Modulo();
        return mod.ejecutar(a, b);
    }

    /**
     * Calcula el módulo usando restas repetidas.
     *
     * @param a dividendo
     * @param b divisor
     * @return el resto de dividir a entre b
     * @throws ArithmeticException si b es cero
     */
    public double ejecutar(double a, double b) {
        validarDivisorNoZero(b);

        if (b < 0) {
            b = restar(0, b);
        }

        boolean aNegativo = a < 0;
        if (aNegativo) {
            a = restar(0, a);
        }

        while (a >= b) {
            a = restar(a, b);
        }

        if (aNegativo) {
            a = restar(0, a);
        }

        return a;
    }
}