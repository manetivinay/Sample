package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 9/17/16.
 */
public class apple {

    public static void main(String args[]) {
        tuna tunaObject = new tuna(10);

        for (int i = 0; i < 5; i++) {
            tunaObject.add();
            System.out.println(tunaObject.toString());
        }
    }
}
