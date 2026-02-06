package edu.miguel.gonzalez.ActividadCalculadora.actividad2.proceso;

/**
 * Clase que implementa la operación de multiplicación.
 * Hereda de OperacionCompuesta ya que se construye usando sumas.
 */
public class Multiplicacion extends OperacionCompuesta {

    /**
     * Realiza la multiplicación de dos números usando sumas.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return el producto de a y b
     */
    public static double realizarOperacion(double a, double b) {
        Multiplicacion mult = new Multiplicacion();
        return mult.ejecutar(a, b);
    }

    /**
     * Multiplica dos números usando sumas repetidas.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return el producto de a y b
     */
    public double ejecutar(double a, double b) {
        double resultado = 0;
        boolean negativo = false;

        // Manejo de signos
        if (b < 0) {
            negativo = !negativo;
            b = restar(0, b);
        }
        if (a < 0) {
            negativo = !negativo;
            a = restar(0, a);
        }

        // Multiplicación por sumas repetidas
        int veces = (int) b;
        for (int i = 0; i < veces; i++) {
            resultado = sumar(resultado, a);
        }

        if (negativo) {
            resultado = restar(0, resultado);
        }

        return resultado;
    }
}