package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de multiplicación.
 */
public class multiplicacion implements operacion {

    /**
     * Multiplica dos números.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return el producto de a y b
     */
    public double ejecutar(double a, double b) {
        suma suma = new suma();
        double resultado = 0;

        for (int i = 0; i < b; i++) {
            resultado = suma.ejecutar(resultado, a);
        }

        return resultado;
    }
}