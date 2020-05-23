public class Calculator {

    private int firstNumder;
    private char operation;
    private int secondNumder;

    public void setFirstNumder(int firstNumder) {
        if (firstNumder > -1) {
            this.firstNumder = firstNumder;
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

    public void setSecondNumder(int secondNumder) {
        if (secondNumder > -1) {
            if (((operation == '/') || (operation == '%')) && (secondNumder == 0)) {
                // костыль, чтобы при выполнении деления не падала программа, по умолчанию secondNumder инициализируется 0
                this.secondNumder = 1;
                System.out.println("!!!Ошибка!!! Деление на 0. Введите корректное число!");
            } else {
                this.secondNumder = secondNumder;
            }
        } else {
            System.out.println("Используйте целые положительные числа!");
        }
    }

    public int calculate() {
        int result = 0;
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
                    return firstNumder / secondNumder;
            case '%':
                    return firstNumder % secondNumder;
        }
        return result;
    }

    private int exp(int firstNumder, int secondNumder) {
        int result = 1;
        for (int i = 0; i < secondNumder; i++) {
            result *= firstNumder;
        }
        return result;
    }
}