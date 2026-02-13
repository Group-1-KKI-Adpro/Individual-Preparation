package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void add_twoVectors_returnsElementWiseSum() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(new double[]{5.0, 7.0, 9.0}, result, 2);
    }

    @Test
    void dotProduct_twoVectors_returnsDotProduct() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};

        double result = vectorUtility.dotProduct(v1, v2);

        // 1*4 + 2*5 + 3*6 = 4 + 10 + 18 = 32
        assertEquals(32.0, result, 2);
    }
}
