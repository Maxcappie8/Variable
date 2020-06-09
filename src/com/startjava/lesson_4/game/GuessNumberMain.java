package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberMain {

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
        } while (validateUserResponse());
    }

    private static boolean validateUserResponse() {
        System.out.print("Хотите продолжить? [да/нет]: ");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("да")) {
            return true;
        } else if (userResponse.equalsIgnoreCase("нет")) {
            return false;
        } else {
            return validateUserResponse();
        }
    }
}

