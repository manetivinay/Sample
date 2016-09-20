package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/19/16.
 */
public class DefaultConstructor {
    public int id;
    public String name;


    //If we are not declaring any value to variable, by default default constructor will assign values based on datatype
    void displayValue() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        DefaultConstructor defaultConstructor1 = new DefaultConstructor();
        defaultConstructor1.displayValue();


        DefaultConstructor defaultConstructor2 = new DefaultConstructor();
        defaultConstructor2.displayValue();
    }
}
