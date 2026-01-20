package edu.miguel.gonzalez.actividad2;

import edu.miguel.gonzalez.actividad2.ui.calculadoraUI;

/**
 * Clase principal que contiene el método {@code main}
 * para ejecutar la aplicación de la calculadora.
 */
public class Main {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        calculadoraUI ui = new calculadoraUI();
        ui.iniciar();
    }
}