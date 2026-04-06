package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testFactorialZero() {
        assertEquals(1, App.calculateFactorial(0));
    }

    @Test
    void testFactorialPositive() {
        assertEquals(120, App.calculateFactorial(5));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.calculateFactorial(-1);
        });
    }
}
