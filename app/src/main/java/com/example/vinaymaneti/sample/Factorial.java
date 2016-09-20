package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/19/16.
 */
public class Factorial {

    void calculateFactorial(int n) {
        int factorialValue = 1;
        for (int i = 1; i <= 5; i++) {
            factorialValue = factorialValue * i;
        }
        System.out.println("factorial value:--" + factorialValue);
    }


    public static final void main(String args[]) {
        new Factorial().calculateFactorial(5);
    }
}
