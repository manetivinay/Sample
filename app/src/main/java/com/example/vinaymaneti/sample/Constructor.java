package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/19/16.
 */
public class Constructor {

    //when ever you create a object constructor is called

    //if there is no constructor in the class, compiler automatically creates the constructor

    Constructor() {
        System.out.println("Constructor is called");
    }

    public static void main(String args[]) {
        Constructor constrcutor = new Constructor();
    }
}
