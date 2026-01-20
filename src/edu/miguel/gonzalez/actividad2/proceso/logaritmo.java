package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de logaritmo.
 * Logaritmo. realizarOperacion(2, 8) = 3 (log base 2 de 8).
 */
public class logaritmo implements operacion {

    /**
     * Realiza el logaritmo:  log base a de b.
     *
     * @param a base del logaritmo
     * @param b operando (argumento del logaritmo)
     * @return logaritmo de b en base a
     * @throws ArithmeticException si los valores no son válidos
     */
    public static double realizarOperacion(double a, double b) {
        if (a <= 0 || a == 1) {
            throw new ArithmeticException("La base del logaritmo debe ser mayor que cero y distinta de 1.");
        }
        if (b <= 0) {
            throw new ArithmeticException("El argumento del logaritmo debe ser mayor que cero.");
        }

        double resultado = 0;
        double valor = b;

        // Contar cuántas veces se puede dividir b entre a
        while (valor >= a) {
            valor = division. realizarOperacion(valor, a);
            resultado = resultado + 1;
        }

        return resultado;
    }

    /**
     * Calcula el logaritmo de b en base a.
     *
     * @param a base del logaritmo
     * @param b argumento del logaritmo
     * @return logaritmo de b en base a
     * @throws ArithmeticException si los valores no son válidos
     */
    public double ejecutar(double a, double b) {
        return realizarOperacion(a, b);
    }
}