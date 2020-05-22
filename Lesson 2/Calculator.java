public class Calculator {

    private int firstNumder;
    private char operation;
    private int secondNumder;

    public int getFirstNumder() {
        return firstNumder;
    }

    public void setFirstNumder(int firstNumder) {
        if (firstNumder > -1) {
            this.firstNumder = firstNumder;
        } else {
            System.out.println("Используйте целые положительные числа!");
        }
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        // некрасиво, ну да ладно)
        if ((operation == '+') || (operation == '-') || (operation == '*') || (operation == '/') || (operation == '^') || (operation == '%')) {
            this.operation = operation;
        } else {
            System.out.println("Неккоректная операция!");
        }
    }

    public int getSecondNumder() {
        return secondNumder;
    }

    public void setSecondNumder(int secondNumder) {
        if (secondNumder > -1) {
            if (((operation == '/') || (operation == '%')) && (secondNumder == 0)) {
                System.out.println("Деление на 0. Введите корректное число!");
            } else {
                this.secondNumder = secondNumder;
            }
        } else {
            System.out.println("Используйте целые положительные числа!");
        }
    }

    public int calculate() {
        int resault = 0;
        switch (operation) {
            case '+':
                return firstNumder + secondNumder;
            case '-':
                return firstNumder - secondNumder;
            case '*':
                return firstNumder * secondNumder;
            case '^':
                return exp(firstNumder,secondNumder);
            case '/':
                if (secondNumder != 0) {
                    return firstNumder / secondNumder;
                }
            case '%':
                if (secondNumder != 0) {
                    return firstNumder % secondNumder;
                }
            default:
        }
        return resault;
    }

    private int exp(int firstNumder, int secondNumder) {
        int resault = 1;
        for (int i = 0; i < secondNumder; i++) {
            resault *= firstNumder;
        }
        return resault;
    }
}