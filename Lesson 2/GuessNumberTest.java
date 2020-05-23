import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        // инициализация игроков
        System.out.print("Игрок 1 введите свое имя: ");
        Player playerOne = new Player(sc.next());
        System.out.print("Игрок 2 введите свое имя: ");
        Player playerTwo = new Player(sc.next());
        // запуск игры
        String userResponse;
        do {
            GuessNumber gn = new GuessNumber(rnd.nextInt(101), playerOne, playerTwo);
            gn.startGame();
            System.out.print("Хотите продолжить? [да/нет]: ");
            userResponse = validationUserResponse(sc.next());
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