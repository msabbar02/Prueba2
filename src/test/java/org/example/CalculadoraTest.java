package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }
    @AfterEach
    void tearDown() {
        calc = null;
    }

    @Test
    void suma() {
        assertEquals(7, calc.suma(3, 4));
        assertEquals(0, calc.suma(-2, 2));
        assertNotNull(calc.suma(1, 1)); // Confirmamos que devuelve un valor
    }

    @Test
    void resta() {
        assertEquals(1, calc.resta(5, 4));
        assertEquals(-3, calc.resta(2, 5));
    }

    @Test
    void multiplicacion() {
        assertEquals(12, calc.multiplicacion(3, 4));
        assertEquals(0, calc.multiplicacion(0, 100));
    }

    @Test
    void division() {
        assertEquals(2, calc.division(8, 4));
        assertThrows(IllegalArgumentException.class, () -> calc.division(5, 0));
        assertNotNull(calc.division(10, 2));
    }

    @Test
    void esPar() {
        assertTrue(calc.esPar(6));
        assertFalse(calc.esPar(7));
    }

    @Test
    void maximo() {
        assertEquals(9, calc.maximo(9, 3, 2));
        assertEquals(9, calc.maximo(1, 9, 8));
        assertEquals(9, calc.maximo(4, 6, 9));
        assertEquals(9, calc.maximo(9, 9, 9)); // Todos iguales
    }

    @Test
    void esDivisible() {
        assertTrue(calc.esDivisible(10, 2));
        assertFalse(calc.esDivisible(7, 3));
        assertThrows(IllegalArgumentException.class, () -> calc.esDivisible(5, 0));
    }

    // Test adicional solo para demostrar assertNull (no está relacionado con Calculadora)
    @Test
    void valorNuloSimulado() {
        String resultado = null;
        assertNull(resultado); // Ejemplo artificial para cumplir con assertNull
    }
}
