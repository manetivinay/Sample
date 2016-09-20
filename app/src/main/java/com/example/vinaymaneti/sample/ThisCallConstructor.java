package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class ThisCallConstructor {

    int id;
    String name;

    ThisCallConstructor() {
        System.out.println("Default Constructor is invoked");
    }

    ThisCallConstructor(int studentId, String studentName) {
        this();
        id = studentId;
        name = studentName;

    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        ThisCallConstructor thiscallConstructor = new ThisCallConstructor(5555, "Vinay");
        thiscallConstructor.display();

        ThisCallConstructor thiscallConstructor1 = new ThisCallConstructor(6666, "Kumar");
        thiscallConstructor1.display();
    }

}
