import java.util.Random;

public class GuessNumber {

    private int randomNumber;

    public GuessNumber(int x) {
        randomNumber = x;
    }

    public boolean startGame(String playerName, int number) {
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
