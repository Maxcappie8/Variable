package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class Calculator {

    private String[] inputField = new String[3];
    private String[] operations = {"+", "-", "*", "/", "%", "^"};

    Scanner scanner = new Scanner(System.in);

    public void setInputField() {
        System.out.print("Введите выражение: ");
        this.inputField = scanner.nextLine().split(" ", 3);
        validateInputField();
    }

    public void validateInputField() {
        if (((Integer.parseInt(inputField[0])) < 0) || ((Integer.parseInt(inputField[2])) < 0)) {
            System.out.println("Ошибка! Используйте целые положительные числа!");
            setInputField();
        }
        if (!containsForArray(inputField[1], operations)) {
            System.out.println("Ошибка! Неккоректная операция!");
            setInputField();
        }
        if ((operations[3].equals(inputField[1]) || operations[4].equals(inputField[1])) && inputField[2].equals("0")) {
            System.out.println(operations[3] + operations[4]);
            System.out.println("Ошибка! Деление на 0!");
            setInputField();
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
        switch (inputField[1]) {
            case "+":
                return Math.addExact(Integer.parseInt(inputField[0]), Integer.parseInt(inputField[2]));
            case "-":
                return Math.subtractExact(Integer.parseInt(inputField[0]), Integer.parseInt(inputField[2]));
            case "*":
                return Math.multiplyExact(Integer.parseInt(inputField[0]), Integer.parseInt(inputField[2]));
            case "^":
                return pow(Integer.parseInt(inputField[0]), Integer.parseInt(inputField[2]));
            case "/":
                return Math.floorDiv(Integer.parseInt(inputField[0]), Integer.parseInt(inputField[2]));
            case "%":
                return Math.floorMod(Integer.parseInt(inputField[0]), Integer.parseInt(inputField[2]));
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