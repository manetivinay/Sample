package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class Sum {

    Addition a;


    void Cal(Addition addition) {
        int a = addition.a;
        int b = addition.b;
        int c = a + b;
        System.out.println("sum of 2 values :-" + c);
        addition.display();
    }
}
