package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] enteredValues = new int[10];
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

    public int[] getEnteredValues() {
        return Arrays.copyOf(enteredValues, enteredValues.length);
    }

    public void setEnteredValues(int[] enteredValues) {
        this.enteredValues = enteredValues;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}
