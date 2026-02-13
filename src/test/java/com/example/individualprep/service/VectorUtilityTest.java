package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {

    private final VectorUtility util = new VectorUtility();

    @Test
    void testNorm() {
        double[] v = {3, 4};

        double result = util.norm(v);

        assertEquals(5.0, result); // sqrt(3^2 + 4^2)
    }
}