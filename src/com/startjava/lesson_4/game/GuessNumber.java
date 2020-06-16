package com.startjava.lesson_4.game;

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
            }
        } while (!makeMove(playerTwo));
        showEnteredNumbers(playerOne);
        showEnteredNumbers(playerTwo);
        playerOne.fillZeros();
        playerOne.setAttempt(0);
        playerTwo.fillZeros();
        playerTwo.setAttempt(0);
    }

    private boolean makeMove(Player player) {
        int attempt = 10 - player.getAttempt();
        if (attempt != 0) {
            System.out.print(player.getName() + " [осталось попыток - " + attempt + "] введите ваше число: ");
            player.setEnteredNumber(scanner.nextInt());
            if (compareNumbers(player)) {
                return true;
            }
        } else if (attempt == 0) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private boolean compareNumbers(Player player) {
        if (player.getLastEnteredNumber() == randomNumber) {
            System.out.println(player.getName() + " выйграл(а)!");
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + player.getAttempt() + " попытки");
            return true;
        } else if (player.getLastEnteredNumber() < randomNumber) {
            System.out.println(player.getName() + " не угадал(а)! Загаданное число больше.");
        } else {
            System.out.println(player.getName() + " не угадал(а)! Загаданное число меньше.");
        }
        return false;
    }

    private void showEnteredNumbers(Player player) {
        System.out.print("Попытки " + player.getName() + ": ");
        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}