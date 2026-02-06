package edu.miguel.gonzalez.ActividadCalculadora.actividad2.proceso;

/**
 * Clase que implementa la operación de raíz.
 * Hereda de OperacionCompuesta ya que usa división, suma y potencia.
 */
public class Raiz extends OperacionCompuesta {

    /**
     * Realiza la raíz: raíz de índice a del operando b.
     *
     * @param a índice de la raíz (2 para raíz cuadrada)
     * @param b operando (radicando)
     * @return la raíz de índice a del número b
     * @throws ArithmeticException si a es cero o b es negativo
     */
    public static double realizarOperacion(double a, double b) {
        Raiz raiz = new Raiz();
        return raiz.ejecutar(a, b);
    }

    /**
     * Calcula la raíz de índice a del número b.
     *
     * @param a índice de la raíz
     * @param b radicando
     * @return la raíz de índice a del número b
     * @throws ArithmeticException si a es cero o b es negativo
     */
    public double ejecutar(double a, double b) {
        validarDivisorNoZero(a);

        if (b < 0) {
            throw new ArithmeticException("No se puede calcular raíz de número negativo.");
        }

        // Método de aproximación por búsqueda binaria
        double inicio = 0;
        double fin = b;
        double medio = 0;
        double precision = 0.00001;

        if (b < 1) {
            fin = 1;
        }

        while (restar(fin, inicio) > precision) {
            medio = Division.realizarOperacion(sumar(inicio, fin), 2);
            double potencia = Potencia.realizarOperacion(medio, a);

            if (potencia > b) {
                fin = medio;
            } else {
                inicio = medio;
            }
        }

        return medio;
    }
}