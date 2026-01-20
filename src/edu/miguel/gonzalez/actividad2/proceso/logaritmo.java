package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de logaritmo.
 */
public class logaritmo implements operacion {

    /**
     * Calcula el logaritmo de a en base b.
     *
     * @param a argumento del logaritmo
     * @param b base del logaritmo
     * @return logaritmo de a en base b
     * @throws ArithmeticException si los valores no son válidos
     */
    public double ejecutar(double a, double b) {
        if (a <= 0) {
            throw new ArithmeticException("El argumento del logaritmo debe ser mayor que cero.");
        }
        if (b <= 0 || b == 1) {
            throw new ArithmeticException("La base del logaritmo debe ser mayor que cero y distinta de 1.");
        }

        division div = new division();
        double resultado = 0;
        double valor = a;

        while (valor >= b) {
            valor = div.ejecutar(valor, b);
            resultado = resultado + 1;
        }

        return resultado;
    }
}