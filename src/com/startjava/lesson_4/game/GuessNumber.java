package com.startjava.lesson_4.game;

import java.util.Arrays;
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
        makeMove(playerOne);
        makeMove(playerTwo);
        showResult(playerOne);
        showResult(playerTwo);
    }

    private boolean makeMove(Player player) {
        player.setEnteredValues(fillArrayByZeros(player.getEnteredValues()));
        for (int i = 0; i < 10; i++) {
            int numberOfAttempts = 10 - i;
            System.out.print(player.getName() + " [осталось попыток - " + numberOfAttempts + "] введите ваше число: ");
            player.setNumber(scanner.nextInt());
            player.setEnteredValues(addNumberInArray(i, player.getNumber(), player.getEnteredValues()));
            if (compareNums(player.getName(), player.getNumber())) {
                player.setAttempt(++i);
                return true;
            }
        }
        System.out.println("У " + player.getName() + " закончились попытки");
        return false;
    }

    private int[] fillArrayByZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                Arrays.fill(array, 0, i, 0);
                return array;
            }
        }
        return null;
    }

    private int[] addNumberInArray(int index, int number, int[] array) {
        array[index] = number;
        return array;
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

    private void showResult(Player player) {
        if (player.getAttempt() != 0) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + player.getAttempt() + " попытки");
        } else {
            System.out.println("Игрок " + player.getName() + " не угадал число.");
        }
        System.out.print("Его попытки: ");
        for (int index : player.getEnteredValues()) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
