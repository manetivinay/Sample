package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 9/17/16.
 */
public class tuna {
    private int sum;
    private final int NUMBER;

    tuna() {
        NUMBER = 0;
    }

    public tuna(int x) {
        NUMBER = x;
    }

    public void add() {
        sum = sum + NUMBER;
    }

    public String toString() {
        return String.format("Sume %s", sum);
    }
}
