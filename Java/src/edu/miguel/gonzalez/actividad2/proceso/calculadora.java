package edu.miguel.gonzalez.actividad2.proceso;

/**
 * Clase que contiene la lógica básica de una calculadora.
 * Proporciona operaciones aritméticas simples entre dos números.
 */
public class calculadora {

    /**
     * Suma dos números.
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return la suma de {a} y {b}
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta dos números.
     *
     * @param a minuendo
     * @param b sustraendo
     * @return la resta de {@code a} menos {@code b}
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return el producto de {@code a} y {@code b}
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide dos números.
     *
     * @param a dividendo
     * @param b divisor
     * @return el cociente de {@code a} entre {@code b}
     * @throws ArithmeticException si {@code b} es cero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }
}