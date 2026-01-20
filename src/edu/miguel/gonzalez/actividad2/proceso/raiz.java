package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de raíz.
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
        suma suma = new suma();
        multiplicacion mult = new multiplicacion();
        potencia pot = new potencia();

        double x = 1;

        for (int i = 0; i < 10; i++) {
            double xPotencia = pot.ejecutar(x, b - 1);
            double temp = div.ejecutar(a, xPotencia);
            temp = suma.ejecutar(temp, mult. ejecutar(b - 1, x));
            x = div.ejecutar(temp, b);
        }

        return x;
    }
}