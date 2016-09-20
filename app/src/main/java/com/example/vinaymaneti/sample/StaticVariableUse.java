package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class StaticVariableUse {

    int rollNumber;
    String studentName;
    static String collegeName = "GSCET";


    StaticVariableUse(int rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    void displayValue() {
        System.out.println(rollNumber + " " + studentName + " " + collegeName);
    }

    public static void main(String args[]) {
        StaticVariableUse s1 = new StaticVariableUse(555, "vinay");
        StaticVariableUse s2 = new StaticVariableUse(333, "siva");
        s1.displayValue();
        s2.displayValue();
    }
}
