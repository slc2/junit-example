package org.example.util;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("unit")
class LetterGradeExTest {

    @Test
    void fiftyNineShouldReturnF() {
        var grader = new LetterGrade();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        var grader = new LetterGrade();
        assertEquals('D', grader.determineLetterGrade(69));

    }

    @Test
    void seventyNineShouldReturnC() {
        var grader = new LetterGrade();
        assertEquals('C', grader.determineLetterGrade(79));

    }

    @Test
    void eightyNineShouldReturnB() {
        var grader = new LetterGrade();
        assertEquals('B', grader.determineLetterGrade(89));

    }

    @Test
    void eightyShouldReturnB() {
        var grader = new LetterGrade();
        assertEquals('B', grader.determineLetterGrade(80));

    }

    @Test
    void ninetyNineShouldReturnA() {
        var grader = new LetterGrade();
        assertEquals('A', grader.determineLetterGrade(99));

    }

    @Test
    void zeroShouldReturnF() {
        var grader = new LetterGrade();
        assertEquals('F', grader.determineLetterGrade(0));

    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException() {
        var grader = new LetterGrade();
        assertThrows(IllegalArgumentException.class,
                () -> grader.determineLetterGrade(-1));

    }
}