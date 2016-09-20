package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/19/16.
 */
public class ParameterisedConstructor {

    public int studentId;
    public String studentname;

    ParameterisedConstructor(int id, String name) {
        studentId = id;
        studentname = name;
    }

    void displayValues() {
        System.out.println(studentId + " " + studentname);
    }

    public static void main(String args[]) {
        ParameterisedConstructor parameterisedConstructor = new ParameterisedConstructor(1111, "vinay");
        ParameterisedConstructor parameterisedConstructor1 = new ParameterisedConstructor(2222, "siva");
        parameterisedConstructor.displayValues();
        parameterisedConstructor1.displayValues();
    }

}
