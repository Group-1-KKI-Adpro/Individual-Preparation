package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    private final ArithmeticUtility util = new ArithmeticUtility();

    @Test
    void testAdd() {
        assertEquals(5.0, util.add(2, 3));
    }
}