import java.util.Scanner;

public class GuessNumber {

    private int randomNumber;
    private Player playerOne;
    private Player playerTwo;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(int randomNumber, Player playerOne, Player playerTwo) {
        this.randomNumber = randomNumber;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        do {
            if (makeMove(playerOne)) {
                break;
            } else if (makeMove(playerTwo)) {
                break;
            }
        } while (true);
    }

    private boolean makeMove(Player player) {
        System.out.print(player.getName() + " введите ваше число: ");
        player.setNumber(scanner.nextInt());
        return compareNums(player.getName(), player.getNumber());
    }

    private boolean compareNums(String playerName, int number) {
        if (number == randomNumber) {
            System.out.println(playerName + " выйграл(а)!");
            return true;
        } else if (number < randomNumber) {
            System.out.println(playerName + " не угадал(а)! Загаданное число больше.");
        } else {
            System.out.println(playerName + " не угадал(а)! Загаданное число меньше.");
        }
        return false;
    }
}



