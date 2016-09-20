package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class A4 {

    int data = 10;

    A4(){
        B4 b4 = new B4(this);
        b4.display();
        b4.displayMemory();

    }

    public static void main(String args[]){
        A4 a4 = new A4();
    }

    void displayValue(){
        System.out.println("from A4");
    }
}
