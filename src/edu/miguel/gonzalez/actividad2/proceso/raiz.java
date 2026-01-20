package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de raíz.
 * Calcula la raíz de índice b del número a
 */
public class raiz implements operacion {

    /**
     * Calcula la raíz de índice b del número a.
     *
     * @param a radicando
     * @param b índice de la raíz
     * @return la raíz de índice b del número a
     * @throws ArithmeticException si b es cero
     */
    public double ejecutar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("El índice de la raíz no puede ser cero.");
        }

        division div = new division();
        resta resta = new resta();
        suma suma = new suma();
        multiplicacion mult = new multiplicacion();
        potencia pot = new potencia();

        // Para raíz:  a^(1/b)
        // Usamos aproximación iterativa
        double x = a;

        // Método 2 (GENUINAMENTE ES ESTO NECESARIO????)
        // x_nuevo = ((n-1)*x + a/x^(n-1)) / n
        for (int i = 0; i < 20; i++) {
            double xPotencia = pot.ejecutar(x, resta.ejecutar(b, 1));
            double numerador = suma.ejecutar(
                    mult.ejecutar(resta.ejecutar(b, 1), x),
                    div.ejecutar(a, xPotencia)
            );
            x = div.ejecutar(numerador, b);
        }

        return x;
    }
}