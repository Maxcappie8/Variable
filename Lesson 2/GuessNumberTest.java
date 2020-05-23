import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random rnd = new Random();
        // инициализация игроков
        System.out.print("Игрок 1 введите свое имя: ");
        Player playerOne = new Player(scanner.next());
        System.out.print("Игрок 2 введите свое имя: ");
        Player playerTwo = new Player(scanner.next());
        // запуск игры
        do {
            GuessNumber gn = new GuessNumber(rnd.nextInt(101), playerOne, playerTwo);
            gn.startGame();
            if (validationUserResponse()) {
                break;
            }
        } while (true);
    }

    private static boolean validationUserResponse() {
        System.out.print("Хотите продолжить? [да/нет]: ");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("да")) {
            return false;
        } else if (userResponse.equalsIgnoreCase("нет")) {
            return true;
        } else {
            return validationUserResponse();
        }
    }
}