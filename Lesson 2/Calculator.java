public class Calculator {

    private int firstNumder;
    private char operation;
    private int secondNumder;

    public int getFirstNumder() {
        return firstNumder;
    }

    public char getOperation() {
        return operation;
    }

    public int getSecondNumder() {
        return secondNumder;
    }

    public void setFirstNumder(int firstNumder) {
        if (firstNumder > -1) {
            this.firstNumder = firstNumder;
        } else {
            System.out.println("Используйте целые положительные числа!");
        }
    }

    public void setSecondNumder(int secondNumder) {
        if ((secondNumder > -1)) {
            if (((operation == '/') || (operation == '%')) && (secondNumder == 0)) {
                System.out.println("Деление на 0. Введите корректное число!");
            } else {
                this.secondNumder = secondNumder;
            }
        } else {
            System.out.println("Используйте целые положительные числа!");
        }
    }

    public void setOperation(char operation) {
        // некрасиво, ну да ладно)
        if ((operation == '+') || (operation == '-') || (operation == '*') || (operation == '/') || (operation == '^') || (operation == '%')) {
            this.operation = operation;
        } else {
            System.out.println("Неккоректная операция!");
        }
    }

    public int calculate() {
        int resault = -1;
        switch (operation) {
            case '+':
                firstNumder += secondNumder;
                resault = firstNumder;
                break;
            case '-':
                firstNumder -= secondNumder;
                resault = firstNumder;
                break;
            case '*':
                firstNumder *= secondNumder;
                resault = firstNumder;
                break;
            case '^':
                resault = 1;
                for (int i = 0; i < secondNumder; i++) {
                    resault *= firstNumder;
                }
                break;
            case '/':
                if (secondNumder != 0) {
                    firstNumder /= secondNumder;
                    resault = firstNumder;
                }
                break;
            case '%':
                if (secondNumder != 0) {
                    firstNumder %= secondNumder;
                    resault = firstNumder;
                }
                break;
            default:
                break;
        }
        return resault;
    }
}
