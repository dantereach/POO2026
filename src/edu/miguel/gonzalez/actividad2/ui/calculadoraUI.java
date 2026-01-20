package edu.miguel.gonzalez.actividad2.ui;

import edu.miguel.gonzalez.actividad2.proceso.operacion;
import edu.miguel.gonzalez.actividad2.proceso.suma;
import edu.miguel.gonzalez.actividad2.proceso.resta;
import edu.miguel.gonzalez.actividad2.proceso.multiplicacion;
import edu.miguel.gonzalez.actividad2.proceso.division;
import edu.miguel.gonzalez.actividad2.proceso.potencia;
import edu.miguel.gonzalez.actividad2.proceso.raiz;
import edu.miguel.gonzalez.actividad2.proceso.logaritmo;
import edu.miguel.gonzalez.actividad2.proceso.modulo;
import java.util.Scanner;

/**
 * Clase que gestiona la interfaz de usuario por consola
 * para interactuar con distintas operaciones matemáticas.
 */
public class calculadoraUI {

    /** Objeto para leer datos introducidos por el usuario. */
    private final Scanner scanner;

    /**
     * Constructor por defecto.
     * Inicializa el lector de entrada.
     */
    public calculadoraUI() {
        scanner = new Scanner(System.in);
    }

    /**
     * Inicia el ciclo principal del programa,
     * mostrando el menú y atendiendo las opciones elegidas por el usuario.
     */
    public void iniciar() {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Elija una opción: ");

            switch (opcion) {
                case 1:
                    ejecutarOperacion(new suma(), "suma");
                    break;
                case 2:
                    ejecutarOperacion(new resta(), "resta");
                    break;
                case 3:
                    ejecutarOperacion(new multiplicacion(), "multiplicación");
                    break;
                case 4:
                    ejecutarOperacion(new division(), "división");
                    break;
                case 5:
                    ejecutarOperacion(new potencia(), "potencia");
                    break;
                case 6:
                    ejecutarOperacion(new raiz(), "raíz");
                    break;
                case 7:
                    ejecutarOperacion(new logaritmo(), "logaritmo");
                    break;
                case 8:
                    ejecutarOperacion(new modulo(), "módulo");
                    break;
                case 0:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    /**
     * Muestra el menú de opciones de la calculadora por consola.
     */
    private void mostrarMenu() {
        System.out.println("===== CALCULADORA AVANZADA =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz");
        System.out.println("7. Logaritmo");
        System.out.println("8. Módulo");
        System.out.println("0. Salir");
    }

    /**
     * Ejecuta una operación genérica leyendo los operandos desde la consola.
     *
     * @param operacion operación a ejecutar
     * @param nombreOperacion nombre de la operación (para mostrar al usuario)
     */
    private void ejecutarOperacion(operacion operacion, String nombreOperacion) {
        double a = leerDouble("Ingrese el primer número: ");
        double b = leerDouble("Ingrese el segundo número: ");

        try {
            double resultado = operacion.ejecutar(a, b);
            System.out.println("El resultado de la " + nombreOperacion + " es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error en la operación: " + e.getMessage());
        }
    }

    /**
     * Lee un número entero desde la entrada estándar.
     * Si el usuario introduce un valor inválido, se le vuelve a pedir.
     *
     * @param mensaje mensaje que se muestra al usuario antes de la lectura
     * @return el valor entero introducido por el usuario
     */
    private int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Valor inválido. Intente de nuevo: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Lee un número de tipo {@code double} desde la entrada estándar.
     * Si el usuario introduce un valor inválido, se le vuelve a pedir.
     *
     * @param mensaje mensaje que se muestra al usuario antes de la lectura
     * @return el valor de tipo {@code double} introducido por el usuario
     */
    private double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Intente de nuevo: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}