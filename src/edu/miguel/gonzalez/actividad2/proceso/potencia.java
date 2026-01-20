package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de potencia.
 */
public class potencia implements operacion {

    /**
     * Calcula la potencia de a elevado a b.
     *
     * @param a base
     * @param b exponente
     * @return a elevado a la potencia b
     */
    public double ejecutar(double a, double b) {
        multiplicacion mult = new multiplicacion();
        double resultado = 1;

        for (int i = 0; i < b; i++) {
            resultado = mult.ejecutar(resultado, a);
        }

        return resultado;
    }
}