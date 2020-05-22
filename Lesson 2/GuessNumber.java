import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int randomNumber;
    private String playerOne;
    private String playerTwo;

    public GuessNumber(int randomNumber, String playerOne, String playerTwo) {
        this.randomNumber = randomNumber;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public boolean responseСheck(String playerName, int number) {
        if (number == randomNumber) {
            System.out.println(playerName + " выйграл(а)!");
            return true;
        } else {
            if (number < randomNumber) {
                System.out.println(playerName + " не угадал(а)! Загаданное число больше.");
            } else {
                System.out.println(playerName + " не угадал(а)! Загаданное число меньше.");
            }
            return false;
        }
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        do {
            if (a < 1) {
                System.out.print(playerOne + " введите ваше число: ");
                if (responseСheck(playerOne, sc.nextInt())) {
                    b++;
                }
                a++;
            } else {
                System.out.print(playerTwo + " введите ваше число: ");
                if (responseСheck(playerTwo, sc.nextInt())) {
                    b++;
                }
                a--;
            }
        } while (b == 0);
    }
}


