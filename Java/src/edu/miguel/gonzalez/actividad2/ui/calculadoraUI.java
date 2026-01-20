package edu.miguel.gonzalez.actividad2.ui;

import edu.miguel.gonzalez.actividad2.proceso.calculadora;
import java.util.Scanner;

/**
 * Clase que gestiona la interfaz de usuario por consola
 * para interactuar con la {calculadora}.
 */
public class calculadoraUI {

    /** Objeto que realiza las operaciones de la calculadora. */
    private final calculadora calculadora;

    /** Objeto para leer datos introducidos por el usuario. */
    private final Scanner scanner;

    /**
     * Constructor por defecto.
     * Inicializa la calculadora y el lector de entrada.
     */
    public calculadoraUI() {
        calculadora = new calculadora();
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
                    realizarOperacion("suma");
                    break;
                case 2:
                    realizarOperacion("resta");
                    break;
                case 3:
                    realizarOperacion("multiplicación");
                    break;
                case 4:
                    realizarOperacion("división");
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
        System.out.println("===== CALCULADORA =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
    }

    /**
     * Realiza la operación indicada leyendo los operandos desde la consola.
     * tipo tipo de operación a realizar.
     *             Debe ser uno de: {"suma"}, {"resta"},
     *             {"multiplicación"} o {"división"}.
     */
    private void realizarOperacion(String tipo) {
        double a = leerDouble("Ingrese el primer número: ");
        double b = leerDouble("Ingrese el segundo número: ");

        try {
            double resultado;
            switch (tipo) {
                case "suma":
                    resultado = calculadora.sumar(a, b);
                    break;
                case "resta":
                    resultado = calculadora.restar(a, b);
                    break;
                case "multiplicación":
                    resultado = calculadora.multiplicar(a, b);
                    break;
                case "división":
                    resultado = calculadora.dividir(a, b);
                    break;
                default:
                    System.out.println("Operación desconocida.");
                    return;
            }
            System.out.println("El resultado de la " + tipo + " es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error en la operación: " + e.getMessage());
        }
    }

    /**
     * Lee un número entero desde la entrada estándar.
     * Si el usuario introduce un valor inválido, se le vuelve a pedir.
     * mensaje que se muestra al usuario antes de la lectura
     * return el valor entero introducido por el usuario
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
     * Lee un número de tipo {double} desde la entrada estándar.
     * Si el usuario introduce un valor inválido, se le vuelve a pedir.
     * mensaje que se muestra al usuario antes de la lectura
     * return el valor de tipo {double} introducido por el usuario
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