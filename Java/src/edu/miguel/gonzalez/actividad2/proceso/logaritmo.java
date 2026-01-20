package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de logaritmo.
 * Calcula el logaritmo de {@code a} en la base {@code b}.
 */
public class logaritmo implements operacion {

    /**
     * {@inheritDoc}
     *
     * @throws ArithmeticException si {@code a} es menor o igual que cero,
     *                             o {@code b} es menor o igual que cero,
     *                             o {@code b} es igual a 1.
     */
    @Override
    public double ejecutar(double a, double b) {
        if (a <= 0) {
            throw new ArithmeticException("El argumento del logaritmo debe ser mayor que cero.");
        }
        if (b <= 0 || b == 1) {
            throw new ArithmeticException("La base del logaritmo debe ser mayor que cero y distinta de 1.");
        }
        // log_b(a) = ln(a) / ln(b)
        return Math.log(a) / Math.log(b);
    }
}