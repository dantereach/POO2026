package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de potencia.
 * Usa multiplicación (que a su vez usa suma).
 */
public class potencia implements operacion {

    /**
     * Realiza la potencia:  a elevado a la b.
     *
     * @param a base (operando)
     * @param b exponente
     * @return a elevado a la potencia b
     */
    public static double realizarOperacion(double a, double b) {
        if (b == 0) {
            return 1;
        }

        boolean exponenteNegativo = false;
        if (b < 0) {
            exponenteNegativo = true;
            b = 0 - b;
        }

        double resultado = 1;
        int veces = (int) b;

        for (int i = 0; i < veces; i++) {
            resultado = multiplicacion.realizarOperacion(resultado, a);
        }

        if (exponenteNegativo) {
            resultado = division.realizarOperacion(1, resultado);
        }

        return resultado;
    }

    /**
     * Calcula la potencia de a elevado a b.
     *
     * @param a base
     * @param b exponente
     * @return a elevado a la potencia b
     */
    public double ejecutar(double a, double b) {
        return realizarOperacion(a, b);
    }
}