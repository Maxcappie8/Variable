import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String userResponse;
        do {
            System.out.print("Введите первое число: ");
            calc.setFirstNumder(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setOperation(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setSecondNumder(scanner.nextInt());
            System.out.println("Результат: " + calc.calculate());
            System.out.print("Хотите продолжить? [да/нет]: ");
            userResponse = validationUserResponse(scanner.next());
        } while (userResponse.equalsIgnoreCase("да"));
    }

    private static String validationUserResponse(String userResponse) {
        Scanner scanner = new Scanner(System.in);
        if ((userResponse.equalsIgnoreCase("да")) || (userResponse.equalsIgnoreCase("нет"))) {
            return userResponse;
        } else {
            System.out.print("Хотите продолжить? [да/нет]: ");
            return validationUserResponse(scanner.next());
        }
    }
}