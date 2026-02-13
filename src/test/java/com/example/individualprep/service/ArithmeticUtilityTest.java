package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void add_twoNumbers_returnsSum() {
        double result = arithmeticUtility.add(2.5, 3.0);
        assertEquals(5.5, result, 2);
    }

    @Test
    void divide_twoNumbers_returnsQuotient() {
        double result = arithmeticUtility.divide(10.0, 4.0);
        assertEquals(2.5, result, 2);
    }

    @Test
    void exponent_positiveExponent() {
        double result = arithmeticUtility.exponent(2.0, 6);
        assertEquals(64.0, result, 2);
    }

    @Test
    void exponent_negativeExponent() {
        double result = arithmeticUtility.exponent(2.0, -2);
        assertEquals(0.25, result, 2);
    }

    @Test
    void exponent_zeroExponent_returnsOne() {
        double result = arithmeticUtility.exponent(123.0, 0);
        assertEquals(1.0, result,2);
    }

    @Test
    void exponent_zeroBaseNegativeExponent_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> arithmeticUtility.exponent(0.0, -1));
    }
}
