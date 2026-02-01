package edu.miguel.gonzalez.actividad3.utils;

import edu.miguel.gonzalez.actividad3.modelo.empleado;
import java.util.ArrayList;
import java.util.List;

public class utilidades {

    public static List<Integer> moverCerosAlFinal(List<Integer> lista) {
        List<Integer> nueva = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) != 0) {
                nueva.add(lista.get(i));
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == 0) {
                nueva.add(0);
            }
        }

        return nueva;
    }

    public static int contarPares(List<Integer> lista) {
        int cont = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static boolean esPalindromo(String texto) {
        texto = texto.replace(" ", "").toLowerCase();

        for (int i = 0; i < texto.length() / 2; i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int contarVocales(String texto) {
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                cont++;
            }
        }
        return cont;
    }

    public static empleado empleadoMayorSalario(List<empleado> lista) {
        empleado may = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).salario > may.salario) {
                may = lista.get(i);
            }
        }
        return may;
    }

    public static int edadMasComun(List<empleado> lista) {
        int[] cont = new int[100];

        for (int i = 0; i < lista.size(); i++) {
            cont[lista.get(i).edad]++;
        }

        int edad = 0;
        int max = 0;
        for (int i = 0; i < 100; i++) {
            if (cont[i] > max) {
                max = cont[i];
                edad = i;
            }
        }
        return edad;
    }

    public static double promedioEdad(List<empleado> lista) {
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).edad;
        }
        return (double) suma / lista.size();
    }

    public static double promedioSalario(List<empleado> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).salario;
        }
        return suma / lista.size();
    }

    public static double promedioEdadSalarioMayor25K(List<empleado> lista) {
        int suma = 0;
        int cont = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).salario > 25000) {
                suma = suma + lista.get(i).edad;
                cont++;
            }
        }

        if (cont == 0) return 0;
        return (double) suma / cont;
    }

    public static List<empleado> filtrarMenoresDe25(List<empleado> lista) {
        List<empleado> men = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).edad < 25) {
                men.add(lista.get(i));
            }
        }
        return men;
    }

    public static int contarDeSistemas(List<empleado> lista) {
        int cont = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).departamento.equals("sistemas")) {
                cont++;
            }
        }
        return cont;
    }

    public static String invertirCadena(String texto) {
        String inv = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            inv = inv + texto.charAt(i);
        }
        return inv;
    }

    public static int encontrarCaracter(String texto, char c) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static empleado empleadoMayorSalarioMayorDe30(List<empleado> lista) {
        empleado may = null;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).edad > 30) {
                if (may == null || lista.get(i).salario > may.salario) {
                    may = lista.get(i);
                }
            }
        }
        return may;
    }

    public static empleado empleadoMenorSalarioEdadMenosComun(List<empleado> lista) {
        int[] cont = new int[100];

        for (int i = 0; i < lista.size(); i++) {
            cont[lista.get(i).edad]++;
        }

        int edad = 0;
        int min = 9999;
        for (int i = 0; i < 100; i++) {
            if (cont[i] > 0 && cont[i] < min) {
                min = cont[i];
                edad = i;
            }
        }

        empleado men = null;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).edad == edad) {
                if (men == null || lista.get(i).salario < men.salario) {
                    men = lista.get(i);
                }
            }
        }
        return men;
    }
}