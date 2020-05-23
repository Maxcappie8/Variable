import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int randomNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(int randomNumber, Player playerOne, Player playerTwo) {
        this.randomNumber = randomNumber;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        do {
            if (step(playerOne)) {
                break;
            } else if (step(playerTwo)) {
                break;
            }
        } while (true); // за это простите)
    }

    private boolean step(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.print(player.getName() + " введите ваше число: ");
        player.setNumber(sc.nextInt());
        return compareNums(player.getName(), player.getNumber());
    }

    private boolean compareNums(String playerName, int number) {
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
}


