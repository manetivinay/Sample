package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class Addition {

    int a = 15;
    int b = 30;

    Addition() {

        Sum sum = new Sum();
        sum.Cal(this);

    }

    public static void main(String args[]) {
        Addition addition = new Addition();
    }
    

    void display(){
        System.out.println("Addtion is done");
    }
}
