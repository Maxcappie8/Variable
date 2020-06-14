package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempt + 1);
    }

    public void setEnteredNumbers(int enteredNum) {
        enteredNumbers[attempt] = enteredNum;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void fillArrayByZeros() {
        Arrays.fill(enteredNumbers, 0, attempt, 0);
    }
}