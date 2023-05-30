package org.example.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("unit")
class CalculatorWithBeforeAllExTest {
    static Calculator calculator;

    @BeforeAll
    static void setupOnce() {
        calculator = new Calculator();
    }

    @Test
    void twoPlusTwoShouldEqualFour() {
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void lessHelpfulTwoPlusTwoShouldEqualFour() {
        assertTrue(calculator.add(2,2) == 4);
    }

    @Test
    void threePlusTwoShouldEqualFive() {
        assertEquals(5, calculator.add(3,2));
    }
}