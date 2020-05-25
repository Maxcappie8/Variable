package com.startjava.lesson_1.calculator;

public class Calculator {

    public static void main(String[] args) {
        int firstNumder = 1;
        char operation = '^';
        int secondNumder = 2;

        // проверка, что введены целые положительные числа
        if ((firstNumder > -1) && (secondNumder > -1)) {
            // проверка знака математической операции
            if (operation == '+') {
                firstNumder += secondNumder;
                System.out.println(firstNumder);
            } else if (operation == '-') {
                firstNumder -= secondNumder;
                System.out.println(firstNumder);
            } else if (operation == '*') {
                firstNumder *= secondNumder;
                System.out.println(firstNumder);
            } else if (operation == '/') {
                // проверка деления на 0
                if (secondNumder != 0) {
                    firstNumder /= secondNumder;
                    System.out.println(firstNumder);
                } else {
                    System.out.println("Деление на 0");
                }
            } else if (operation == '^') {
                // возведение firstNumder в степень secondNumder
                int a = 1;
                for (int i = 0; i < secondNumder; i++) {
                    a *= firstNumder;
                }
                System.out.println(a);
            } else if (operation == '%') {
                // проверка деления на 0
                if (secondNumder != 0) {
                    firstNumder %= secondNumder;
                    System.out.println(firstNumder);
                } else {
                    System.out.println("Деление на 0");
                }
            } else {
                System.out.println("Введите корректную операцию!");
            }
        } else {
            System.out.println("Вводите целые положительные числа!");
        }
    }
}
