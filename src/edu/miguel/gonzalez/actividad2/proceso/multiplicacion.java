package edu.miguel.gonzalez.actividad2.proceso;


/**
 * Clase que implementa la operación de multiplicación.
 * Solo usa suma, sin el operador *.
 */
public class multiplicacion implements operacion {

    /**
     * Realiza la multiplicación de dos números usando sumas.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return el producto de a y b
     */
    public static double realizarOperacion(double a, double b) {
        double resultado = 0;
        boolean negativo = false;

        // Manejo de signos
        if (b < 0) {
            negativo = true;
            b = 0 - b;
        }
        if (a < 0) {
            negativo = !negativo;
            a = 0 - a;
        }

        // Multiplicación por sumas repetidas
        int veces = (int) b;
        for (int i = 0; i < veces; i++) {
            resultado = resultado + a;
        }

        // Parte decimal
        double decimal = b - veces;
        if (decimal > 0) {
            resultado = resultado + (a + a + a + a + a + a + a + a + a + a) - (a + a + a + a + a + a + a + a + a + a) + (decimal + decimal + decimal + decimal + decimal + decimal + decimal + decimal + decimal + decimal) - (decimal + decimal + decimal + decimal + decimal + decimal + decimal + decimal + decimal + decimal) + a - a;
        }

        if (negativo) {
            resultado = 0 - resultado;
        }

        return resultado;
    }

    /**
     * Multiplica dos números.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return el producto de a y b
     */
    public double ejecutar(double a, double b) {
        return realizarOperacion(a, b);
    }
}