package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class Staticmethod {

    int rollNumber;
    String studentName;
    static String collegename = "GSCET";


    Staticmethod(int id, String studentName) {
        this.rollNumber = id;
        this.studentName = studentName;
    }

    static void chanegCollegeName() {
        collegename = "JNTU";
    }

    void displayValue() {
        System.out.println(rollNumber + " " + studentName + " " + collegename);
    }

    public static void main(String args[]) {
        Staticmethod staticmethod = new Staticmethod(555, "Vinay");
        Staticmethod staticmethod2 = new Staticmethod(444, "siva");
        staticmethod.displayValue();
        staticmethod2.displayValue();
    }
}
