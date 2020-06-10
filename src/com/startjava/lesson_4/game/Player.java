package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] enteredNums = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getEnteredNums() {
        for (int i = 0; i < enteredNums.length; i++) {
            if (enteredNums[i] == 0) {
                return Arrays.copyOf(enteredNums, i);
            }
        }
        return Arrays.copyOf(enteredNums, enteredNums.length);
    }

    public void setEnteredNums(int enteredNum) {
        enteredNums[attempt] = enteredNum;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void fillArrayByZeros() {
        for (int i = 0; i < enteredNums.length; i++) {
            if (enteredNums[i] == 0) {
                Arrays.fill(enteredNums, 0, i, 0);
            }
        }
        Arrays.fill(enteredNums, 0);
    }
}