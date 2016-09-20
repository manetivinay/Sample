package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class CopyConstructor {

    public int studentId;
    public String studentName;

    public CopyConstructor(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    CopyConstructor(CopyConstructor copy) {
        studentId = copy.studentId;
        studentName = copy.studentName;
    }

    public static void main(String args[]) {
        CopyConstructor copyConstructor = new CopyConstructor(5, "vinay");
        copyConstructor.displayValue();

        CopyConstructor copyConstructorCoping = new CopyConstructor(copyConstructor);
        copyConstructorCoping.displayValue();
    }

    private void displayValue() {
        System.out.println(studentId + " " + studentName);

    }
}
