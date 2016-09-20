package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class ConstructorExampleWithThisMethod {

    int id;
    String studentName;
    static String City;

    ConstructorExampleWithThisMethod() {
        System.out.println("Default constructor is invoked with this()");
    }


    ConstructorExampleWithThisMethod(int rollNumber, String userName) {
        this();
        id = rollNumber;
        studentName = userName;

    }

    ConstructorExampleWithThisMethod(int rollNumber, String userName, String city) {
        this(rollNumber, userName);
        id = rollNumber;
        studentName = userName;
        City = city;

    }

    void display() {
        System.out.println(id + " " + studentName + " " + City);
    }

    public static void main(String args[]) {

        ConstructorExampleWithThisMethod cewtm1 = new ConstructorExampleWithThisMethod(6666, "Kumar", "Hyderanad");
        cewtm1.display();

        ConstructorExampleWithThisMethod cewtm = new ConstructorExampleWithThisMethod(555, "vinay");
        cewtm.display();
    }
}
