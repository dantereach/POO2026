package edu.miguel.gonzalez.ActividadCalculadora.actividad2.proceso;

/**
 * Clase que implementa la operación de potencia.
 * Hereda de OperacionCompuesta ya que usa multiplicación.
 */
public class Potencia extends OperacionCompuesta {

    /**
     * Realiza la potencia: a elevado a la b.
     *
     * @param a base (operando)
     * @param b exponente
     * @return a elevado a la potencia b
     */
    public static double realizarOperacion(double a, double b) {
        Potencia pot = new Potencia();
        return pot.ejecutar(a, b);
    }

    /**
     * Calcula la potencia usando multiplicaciones repetidas.
     *
     * @param a base
     * @param b exponente
     * @return a elevado a la potencia b
     */
    public double ejecutar(double a, double b) {
        if (b == 0) {
            return 1;
        }

        boolean exponenteNegativo = false;
        if (b < 0) {
            exponenteNegativo = true;
            b = restar(0, b);
        }

        double resultado = 1;
        int veces = (int) b;

        for (int i = 0; i < veces; i++) {
            resultado = Multiplicacion.realizarOperacion(resultado, a);
        }

        if (exponenteNegativo) {
            resultado = Division.realizarOperacion(1, resultado);
        }

        return resultado;
    }
}