package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void suma() {
        assertEquals(7, calc.suma(3, 4));
        assertEquals(1, calc.suma(-2, 2));
        assertNotNull(calc.suma(5, 5));
    }

    @Test
    void resta() {
        assertEquals(2, calc.resta(5, 3));
        assertEquals(-1, calc.resta(2, 5));
    }

    @Test
    void multiplicacion() {
        assertEquals(12, calc.multiplicacion(3, 4));
        assertEquals(0, calc.multiplicacion(0, 100));
    }

    @Test
    void division() {
        assertEquals(2, calc.division(8, 4));
        assertEquals(4, calc.division(10, 3));
        assertThrows(IllegalArgumentException.class, () -> calc.division(5, 0));
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
        assertEquals(8, calc.maximo(4, 6, 9));
    }

    @Test
    void esDivisible() {
        assertTrue(calc.esDivisible(10, 2));
        assertFalse(calc.esDivisible(7, 3));
        assertThrows(IllegalArgumentException.class, () -> calc.esDivisible(5, 0));
    }
}
