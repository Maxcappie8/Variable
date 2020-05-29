package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            calc.setInputField();
            System.out.println(" = " + calc.calculate());
        } while (validateUserResponse());
    }

    private static boolean validateUserResponse() {
        System.out.print("Хотите продолжить? [да/нет]: ");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("да")) {
            return true;
        } else if (userResponse.equalsIgnoreCase("нет")) {
            return false;
        } else {
            return validateUserResponse();
        }
    }
}