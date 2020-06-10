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
        playerOne.fillArrayByZeros();
        playerOne.setAttempt(0);
        playerTwo.fillArrayByZeros();
        playerTwo.setAttempt(0);
        do {
            if (makeMove(playerOne)) {
                break;
            } else if (makeMove(playerTwo)) {
                break;
            }
        } while (true);
        showResult(playerOne);
        showResult(playerTwo);
    }

    private boolean makeMove(Player player) {
        int numberOfAttempts = 10 - player.getAttempt();
        if (numberOfAttempts != 0) {
            System.out.print(player.getName() + " [осталось попыток - " + numberOfAttempts + "] введите ваше число: ");
            player.setNumber(scanner.nextInt());
            player.setEnteredNums(player.getNumber());
            player.setAttempt(1 + player.getAttempt());
            if (compareNums(player)) {
                return true;
            }
        } else if (numberOfAttempts == 0) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private boolean compareNums(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println(player.getName() + " выйграл(а)!");
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + player.getAttempt() + " попытки");
            return true;
        } else if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + " не угадал(а)! Загаданное число больше.");
        } else {
            System.out.println(player.getName() + " не угадал(а)! Загаданное число меньше.");
        }
        return false;
    }

    private void showResult(Player player) {
        System.out.print("Попытки " + player.getName() + ": ");
        for (int index : player.getEnteredNums()) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}