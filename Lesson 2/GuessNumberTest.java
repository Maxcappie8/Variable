import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public String validationUserResponse(String userResponse) {
        Scanner scanner = new Scanner(System.in);
        if ((userResponse.equalsIgnoreCase("да")) || (userResponse.equalsIgnoreCase("нет"))) {
            return userResponse;
        } else {
            System.out.print("Хотите продолжить? [да/нет]: ");
            return validationUserResponse(scanner.next());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Игрок 1 введите свое имя: ");
        Player playerOne = new Player(sc.next());
        System.out.print("Игрок 2 введите свое имя: ");
        Player playerTwo = new Player(sc.next());
        GuessNumberTest gnt = new GuessNumberTest();
        String userResponse;
        do {
            GuessNumber gn = new GuessNumber(rnd.nextInt(101));
            int a = 0;
            int b = 0;
            do {
                if (a < 1) {
                    System.out.print(playerOne.getName() + " введите свое число: ");
                    playerOne.setNumber(sc.nextInt());
                    if (gn.startGame(playerOne.getName(), playerOne.getNumber())) {
                        b++;
                    }
                    a++;
                } else {
                    System.out.print(playerTwo.getName() + " введите свое число: ");
                    playerTwo.setNumber(sc.nextInt());
                    if (gn.startGame(playerTwo.getName(), playerTwo.getNumber())) {
                        b++;
                    }
                    a--;
                }
            } while (b == 0);
            System.out.print("Хотите продолжить? [да/нет]: ");
            userResponse = gnt.validationUserResponse(sc.next());
        } while (userResponse.equalsIgnoreCase("да"));
    }
}
