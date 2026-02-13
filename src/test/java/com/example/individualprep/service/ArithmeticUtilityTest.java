package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticUtilityTest {

    @Test
    void testSubtract() {
        ArithmeticUtility arithmetic = new ArithmeticUtility();
        // Testing 10.0 - 4.0 = 6.0
        double result = arithmetic.subtract(10.0, 4.0);
        assertEquals(6.0, result, 0.0001);
    }
}
