package com.company;

public class GpaCalculatorClass {
    private double getGradeInFormat(double grade) {
        if (grade > 94) {
            return 4.0;
        } else if (grade >= 90 && grade <= 93.) {
            return 3.67;
        } else if (grade >= 85 && grade <= 89) {
            return 3.33;
        } else if (grade >= 80 && grade <= 84) {
            return 3.0;
        } else if (grade >= 75 && grade <= 79) {
            return 2.67;
        } else if (grade >= 70 && grade <= 74) {
            return 2.33;
        } else if (grade >= 65 && grade <= 69) {
            return 2.0;
        } else if (grade >= 60 && grade <= 64) {
            return 1.67;
        } else if (grade >= 55 && grade <= 59) {
            return 1.33;
        } else if (grade >= 50 && grade <= 54) {
            return 1.0;
        } else if (grade >= 0 && grade <= 49) {
            return 0.0;
        }
        return 0;
    }
}

