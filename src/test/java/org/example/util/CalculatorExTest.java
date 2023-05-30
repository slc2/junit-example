package org.example.util;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("unit")
class CalculatorExTest {
    @Test
    void twoPlusTwoShouldEqualFour() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void lessHelpfulTwoPlusTwoShouldEqualFour() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.add(2,2) == 4);
    }

    @Test
    void threePlusTwoShouldEqualFive() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(3,2));
    }
}