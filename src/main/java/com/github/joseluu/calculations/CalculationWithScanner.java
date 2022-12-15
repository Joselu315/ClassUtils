package com.github.joseluu.calculations;

import java.util.Scanner;

public class CalculationWithScanner {
    Scanner scanner = new Scanner(System.in);

    public int sum() {
        int number = scanner.nextInt();
        int result = 0;

        while (number == 0) {
            result += number;

            System.out.println("Put 0 if you wont add more numbers");
            number = scanner.nextInt();
        }
        return result;
    }
    public int rest() {
        int number = scanner.nextInt();
        int result = 0;

        while (number == 0) {
            result -= number;

            System.out.println("Put 0 if you wont add more numbers");
            number = scanner.nextInt();
        }
        return result;
    }
    public int multiply() {
        int number = scanner.nextInt();
        int result = 0;

        while (number == 0) {
            result *= number;

            System.out.println("Put 0 if you wont add more numbers");
            number = scanner.nextInt();
        }
        return result;
    }
    public int divide() {
        int number = scanner.nextInt();
        int result = 0;

        while (number == 0) {
            result /= number;

            System.out.println("Put 0 if you wont add more numbers");
            number = scanner.nextInt();
        }
        return result;
    }
}
