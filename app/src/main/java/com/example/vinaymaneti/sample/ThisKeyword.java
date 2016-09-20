package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class ThisKeyword {
    int id;
    String name;


    //if you remove the this keyword we can see the ambiguity
    ThisKeyword(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayValue() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        ThisKeyword tk = new ThisKeyword(555, "vinay");
        tk.displayValue();
    }
}
