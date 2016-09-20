package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class WithoutMainMethod {

    static {
        System.out.println("With main method, possible with static block");
    }

    public static void main(String args[]) {
        System.out.println("Hello main");
    }
}
