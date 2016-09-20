package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class StaticVariable {
    static int value = 0;

    StaticVariable() {
        value = value + 1;
        System.out.println("value increment static keyword using :" + value);
    }


    public static void main(String args[]) {
        StaticVariable staticVariable = new StaticVariable();
        StaticVariable staticVaraible2 = new StaticVariable();
        StaticVariable staticVariable3 = new StaticVariable();
    }
}
