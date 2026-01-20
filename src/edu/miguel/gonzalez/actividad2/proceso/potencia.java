package edu. miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de potencia.
 * Calcula  a elevado a b usando multiplicaciones repetidas.
 */
public class potencia implements operacion {

    /**
     * Calcula la potencia usando multiplicación repetida.
     *
     * @param a base
     * @param b exponente
     * @return a elevado a la potencia b
     */
    public double ejecutar(double a, double b) {
        multiplicacion mult = new multiplicacion();
        suma suma = new suma();
        resta resta = new resta();
        division div = new division();

        // Caso especial: exponente 0
        if (b == 0) {
            return 1;
        }

        // Manejo de exponente negativo
        boolean exponenteNegativo = false;
        if (b < 0) {
            exponenteNegativo = true;
            b = resta.ejecutar(0, b); // b = -b
        }

        double resultado = 1;
        double contador = 0;

        // Multiplicar 'a' por sí mismo 'b' veces
        while (contador < b) {
            resultado = mult.ejecutar(resultado, a);
            contador = suma.ejecutar(contador, 1);
        }

        // Si el exponente era negativo, calcular 1/resultado
        if (exponenteNegativo) {
            resultado = div.ejecutar(1, resultado);
        }

        return resultado;
    }
}