package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class B4 {

    A4 a4;

    B4(A4 a4) {
        this.a4 = a4;
    }

    void display() {
        System.out.println(a4.data);
        a4.displayValue();
    }

    void displayMemory() {
        System.out.println("displayMemory");
    }
}
