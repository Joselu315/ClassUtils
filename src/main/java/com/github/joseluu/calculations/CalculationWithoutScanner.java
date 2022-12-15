package com.github.joseluu.calculations;

public class CalculationWithoutScanner {
    public int sum(int... number) {
        int sum = 0;

        for (int value : number) {
            sum += value;
        }

        return sum;
    }
    public int rest(int... number) {
        int rest = 0;

        for (int value : number) {
            rest -= value;
        }

        return rest;
    }
    public int multiply(int... number) {
        int multiply = 0;

        for (int value : number) {
            multiply *= value;
        }

        return multiply;
    }
    public int divide(int... number) {
        int divide = 0;

        for (int value : number) {
            divide /= value;
        }

        return divide;
    }
}
