package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que implementa la operación de logaritmo.
 * Calcula el logaritmo de a en la base b
 * usando aproximación numérica.
 */
public class logaritmo implements operacion {

    /**
     * Calcula el logaritmo de a en base b.
     *
     * @param a argumento del logaritmo
     * @param b base del logaritmo
     * @return logaritmo de a en base b
     * @throws ArithmeticException si a es menor o igual que cero,
     *                             o b es menor o igual que cero,
     *                             o b es igual a 1.
     */
    public double ejecutar(double a, double b) {
        if (a <= 0) {
            throw new ArithmeticException("El argumento del logaritmo debe ser mayor que cero.");
        }
        if (b <= 0 || b == 1) {
            throw new ArithmeticException("La base del logaritmo debe ser mayor que cero y distinta de 1.");
        }

        division div = new division();

        // log_b(a) = ln(a) / ln(b)
        double lnA = logaritmoNatural(a);
        double lnB = logaritmoNatural(b);

        return div.ejecutar(lnA, lnB);
    }

    /**
     * Calcula el logaritmo natural usando serie de Taylor.
     * ln(x) para x cercano a 1: ln(x) = (x-1) - (x-1)²/2 + (x-1)³/3 - ...
     *
     * @param x número del cual calcular el logaritmo natural
     * @return aproximación de ln(x)
     */
    private double logaritmoNatural(double x) {
        suma suma = new suma();
        resta resta = new resta();
        multiplicacion mult = new multiplicacion();
        division div = new division();

        // Normalizar x al rango (0.5, 1.5) para mejor convergencia
        int exponente = 0;
        while (x > 1.5) {
            x = div.ejecutar(x, 2.718281828); // e
            exponente = (int) suma.ejecutar(exponente, 1);
        }
        while (x < 0.5) {
            x = mult.ejecutar(x, 2.718281828); // e
            exponente = (int) resta.ejecutar(exponente, 1);
        }

        // Serie de Taylor: ln(x) = 2 * [(y) + (y³/3) + (y⁵/5) + ...]
        // donde y = (x-1)/(x+1)
        double y = div.ejecutar(resta.ejecutar(x, 1), suma.ejecutar(x, 1));
        double ySquared = mult.ejecutar(y, y);

        double resultado = 0;
        double termino = y;

        for (int n = 1; n < 100; n = (int) suma.ejecutar(n, 2)) {
            resultado = suma.ejecutar(resultado, div.ejecutar(termino, n));
            termino = mult. ejecutar(termino, ySquared);
        }

        resultado = suma.ejecutar(mult.ejecutar(2, resultado), mult.ejecutar(exponente, 1));

        return resultado;
    }
}