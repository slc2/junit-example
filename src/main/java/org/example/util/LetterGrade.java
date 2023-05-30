package org.example.util;

public class LetterGrade {
    public char determineLetterGrade(int gradeScore) {
        if (gradeScore < 0) {
            //return 'F';
            throw new IllegalArgumentException("Grade score cannot be negative");
        } else if (gradeScore < 60) {
            return 'F';
        } else if (gradeScore < 70) {
            return 'D';
        } else if (gradeScore < 80) {
            return 'C';
        } else if (gradeScore < 90)
            return 'B';
        return 'A';
    }
}
