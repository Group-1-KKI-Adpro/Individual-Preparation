package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {

    @Test
    void testDotProduct() {
        VectorUtility vector = new VectorUtility();
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        // (1*4) + (2*5) + (3*6) = 4 + 10 + 18 = 32
        double result = vector.dotProduct(v1, v2);
        assertEquals(32.0, result, 0.0001);
    }

    @Test
    void testDotProductIncompatibleDimensions() {
        VectorUtility vector = new VectorUtility();
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};
        // Verifies that your code correctly throws an error for unequal lengths
        assertThrows(IllegalArgumentException.class, () -> {
            vector.dotProduct(v1, v2);
        });
    }
}