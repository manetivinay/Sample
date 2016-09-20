package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class ThisMethods {


// You may invoke the method of the current class by using the this keyword.
// If you don't use the this keyword, compiler automatically adds this keyword while invoking the method


    void A() {
        System.out.println("Method A is called");
    }

    void B() {
        System.out.println("Method B is called");
        this.A();
    }

    void c() {
        System.out.println("Method c cis called");
        B();
    }


    public static void main(String args[]) {
        ThisMethods tm = new ThisMethods();
        tm.c();

    }
}
