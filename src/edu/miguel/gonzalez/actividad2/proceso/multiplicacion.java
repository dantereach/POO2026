package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de multiplicación
 * usando sumas sucesivas (sin usar el operador *).
 */
public class multiplicacion implements operacion {

    /**
     * Multiplica dos números mediante sumas repetidas.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return el producto de a y b
     */
    public double ejecutar(double a, double b) {
        suma suma = new suma();
        resta resta = new resta();

        // Manejo de signos
        boolean negativo = false;
        if (b < 0) {
            negativo = true;
            b = resta.ejecutar(0, b); // b = -b
        }
        if (a < 0) {
            negativo = !negativo;
            a = resta.ejecutar(0, a); // a = -a
        }

        double resultado = 0;
        double contador = 0;

        // Suma 'a' tantas veces como indique 'b'
        while (contador < b) {
            resultado = suma.ejecutar(resultado, a);
            contador = suma.ejecutar(contador, 1);
        }

        // Aplicar signo si es necesario
        if (negativo) {
            resultado = resta.ejecutar(0, resultado);
        }

        return resultado;
    }
}