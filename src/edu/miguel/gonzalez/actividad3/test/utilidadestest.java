package edu.miguel.gonzalez.actividad3.test;

import edu.miguel.gonzalez.actividad3.modelo.empleado;
import edu.miguel.gonzalez.actividad3.utils.utilidades;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class utilidadestest {

    @Test
    public void testMoverCerosAlFinal() {
        List<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(2);
        lista.add(1);
        lista.add(4);
        lista.add(0);
        lista.add(2);
        List<Integer> r = utilidades.moverCerosAlFinal(lista);
        assertEquals(2, (int) r.get(0));
        assertEquals(0, (int) r.get(5));
    }

    @Test
    public void testContarPares() {
        List<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(7);
        lista.add(6);
        assertEquals(2, utilidades.contarPares(lista));
    }

    @Test
    public void testEsPalindromo1() {
        assertFalse(utilidades.esPalindromo("hola mundo"));
    }

    @Test
    public void testEsPalindromo2() {
        assertTrue(utilidades.esPalindromo("ana"));
    }

    @Test
    public void testContarVocales() {
        assertEquals(2, utilidades.contarVocales("hola"));
    }

    @Test
    public void testEmpleadoMayorSalario() {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Juan", 25, 20000, "ventas"));
        lista.add(new empleado("Maria", 30, 35000, "sistemas"));
        lista.add(new empleado("Pedro", 28, 28000, "rrhh"));
        assertEquals("Maria", utilidades.empleadoMayorSalario(lista).nombre);
    }

    @Test
    public void testEdadMasComun() {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Juan", 25, 20000, "ventas"));
        lista.add(new empleado("Maria", 30, 35000, "sistemas"));
        lista.add(new empleado("Pedro", 25, 28000, "rrhh"));
        assertEquals(25, utilidades.edadMasComun(lista));
    }

    @Test
    public void testPromedioEdad() {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Juan", 20, 20000, "ventas"));
        lista.add(new empleado("Maria", 30, 35000, "sistemas"));
        assertEquals(25.0, utilidades.promedioEdad(lista), 0.1);
    }

    @Test
    public void testPromedioSalario() {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Juan", 25, 20000, "ventas"));
        lista.add(new empleado("Maria", 30, 30000, "sistemas"));
        assertEquals(25000.0, utilidades.promedioSalario(lista), 0.1);
    }

    @Test
    public void testPromedioEdadSalarioMayor25K() {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Juan", 20, 20000, "ventas"));
        lista.add(new empleado("Maria", 30, 30000, "sistemas"));
        lista.add(new empleado("Pedro", 40, 28000, "rrhh"));
        assertEquals(35.0, utilidades.promedioEdadSalarioMayor25K(lista), 0.1);
    }

    @Test
    public void testFiltrarMenoresDe25() {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Juan", 22, 20000, "ventas"));
        lista.add(new empleado("Maria", 30, 35000, "sistemas"));
        lista.add(new empleado("Pedro", 23, 28000, "rrhh"));
        assertEquals(2, utilidades.filtrarMenoresDe25(lista).size());
    }

    @Test
    public void testContarDeSistemas() {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Juan", 25, 20000, "ventas"));
        lista.add(new empleado("Maria", 30, 35000, "sistemas"));
        lista.add(new empleado("Pedro", 28, 28000, "sistemas"));
        assertEquals(2, utilidades.contarDeSistemas(lista));
    }

    @Test
    public void testInvertirCadena() {
        assertEquals("aloh", utilidades.invertirCadena("hola"));
    }

    @Test
    public void testEncontrarCaracter1() {
        assertEquals(1, utilidades.encontrarCaracter("hola", 'o'));
    }

    @Test
    public void testEncontrarCaracter2() {
        assertEquals(-1, utilidades.encontrarCaracter("hola", 'r'));
    }

    @Test
    public void testEmpleadoMayorSalarioMayorDe30() {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Juan", 25, 40000, "ventas"));
        lista.add(new empleado("Maria", 35, 35000, "sistemas"));
        lista.add(new empleado("Pedro", 32, 38000, "rrhh"));
        assertEquals("Pedro", utilidades.empleadoMayorSalarioMayorDe30(lista).nombre);
    }

    @Test
    public void testEmpleadoMenorSalarioEdadMenosComun() {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Juan", 25, 30000, "ventas"));
        lista.add(new empleado("Maria", 25, 35000, "sistemas"));
        lista.add(new empleado("Pedro", 30, 28000, "rrhh"));
        assertEquals("Pedro", utilidades.empleadoMenorSalarioEdadMenosComun(lista).nombre);
    }
}