package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de raíz.
 * Raiz.realizarOperacion(2, 25) = 5 (raíz cuadrada de 25).
 */
public class raiz implements operacion {

    /**
     * Realiza la raíz:  raíz de índice a del operando b.
     *
     * @param a índice de la raíz (2 para raíz cuadrada)
     * @param b operando (radicando)
     * @return la raíz de índice a del número b
     * @throws ArithmeticException si a es cero
     */
    public static double realizarOperacion(double a, double b) {
        if (a == 0) {
            throw new ArithmeticException("El índice de la raíz no puede ser cero.");
        }
        if (b < 0) {
            throw new ArithmeticException("No se puede calcular raíz de número negativo.");
        }

        // Método de aproximación por búsqueda binaria simplificada
        double inicio = 0;
        double fin = b;
        double medio = 0;
        double precision = 0.00001;

        // Si b < 1, ajustar el rango de búsqueda
        if (b < 1) {
            fin = 1;
        }

        while (resta.realizarOperacion(fin, inicio) > precision) {
            medio = division.realizarOperacion(suma.realizarOperacion(inicio, fin), 2);
            double potencia = edu.miguel.gonzalez.actividad2.proceso.potencia.realizarOperacion(medio, a);

            if (potencia > b) {
                fin = medio;
            } else {
                inicio = medio;
            }
        }

        return medio;
    }

    /**
     * Calcula la raíz de índice a del número b.
     *
     * @param a índice de la raíz
     * @param b radicando
     * @return la raíz de índice a del número b
     * @throws ArithmeticException si a es cero
     */
    public double ejecutar(double a, double b) {
        return realizarOperacion(a, b);
    }
}