package edu.miguel.gonzalez.ActividadCalculadora.actividad2.proceso;

/**
 * Clase que implementa la operación de logaritmo.
 * Hereda de OperacionCompuesta ya que usa división.
 */
public class Logaritmo extends OperacionCompuesta {

    /**
     * Realiza el logaritmo: log base a de b.
     *
     * @param a base del logaritmo
     * @param b operando (argumento del logaritmo)
     * @return logaritmo de b en base a
     * @throws ArithmeticException si los valores no son válidos
     */
    public static double realizarOperacion(double a, double b) {
        Logaritmo log = new Logaritmo();
        return log.ejecutar(a, b);
    }

    /**
     * Calcula el logaritmo de b en base a.
     *
     * @param a base del logaritmo
     * @param b argumento del logaritmo
     * @return logaritmo de b en base a
     * @throws ArithmeticException si los valores no son válidos
     */
    public double ejecutar(double a, double b) {
        if (a == 1) {
            throw new ArithmeticException("La base del logaritmo no puede ser 1.");
        }
        validarPositivo(a, "La base del logaritmo");
        validarPositivo(b, "El argumento del logaritmo");

        double resultado = 0;
        double valor = b;

        // Contar cuántas veces se puede dividir b entre a
        while (valor >= a) {
            valor = Division.realizarOperacion(valor, a);
            resultado = sumar(resultado, 1);
        }

        return resultado;
    }
}