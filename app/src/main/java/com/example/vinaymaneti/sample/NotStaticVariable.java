package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class NotStaticVariable {


    //without static variable the memory is when ever object is created

    int value = 0;

    NotStaticVariable() {
        value++;
        System.out.println("value :--" + value);
    }


    public static void main(String args[]) {
        NotStaticVariable staticVariable = new NotStaticVariable();
        NotStaticVariable staticVariable1 = new NotStaticVariable();
        NotStaticVariable staticVariable3 = new NotStaticVariable();
    }
}
