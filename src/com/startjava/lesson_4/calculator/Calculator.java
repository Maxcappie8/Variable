package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class Calculator {

    private String[] mathExpression = new String[3];
    private String[] operations = {"+", "-", "*", "/", "%", "^"};

    Scanner scanner = new Scanner(System.in);

    public void setMathExpression() {
        System.out.print("Введите выражение: ");
        this.mathExpression = scanner.nextLine().split(" ", 3);
        validateInputField();
    }

    public void validateInputField() {
        if (((Integer.parseInt(mathExpression[0])) < 0) || ((Integer.parseInt(mathExpression[2])) < 0)) {
            System.out.println("Ошибка! Используйте целые положительные числа!");
            setMathExpression();
        }
        if (!containsForArray(mathExpression[1], operations)) {
            System.out.println("Ошибка! Неккоректная операция!");
            setMathExpression();
        }
        if ((operations[3].equals(mathExpression[1]) || operations[4].equals(mathExpression[1])) && mathExpression[2].equals("0")) {
            System.out.println(operations[3] + operations[4]);
            System.out.println("Ошибка! Деление на 0!");
            setMathExpression();
        }
    }

    private boolean containsForArray(String string, String[] stringArray) {
        for (String s : stringArray) {
            if (string.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public int calculate() {
        int result = 0;
        switch (mathExpression[1]) {
            case "+":
                return Math.addExact(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
            case "-":
                return Math.subtractExact(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
            case "*":
                return Math.multiplyExact(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
            case "^":
                return pow(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
            case "/":
                return Math.floorDiv(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
            case "%":
                return Math.floorMod(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
        }
        return result;
    }

    private int pow(int firstNumder, int secondNumder) {
        int result = 1;
        for (int i = 0; i < secondNumder; i++) {
            result *= firstNumder;
        }
        return result;
    }
}