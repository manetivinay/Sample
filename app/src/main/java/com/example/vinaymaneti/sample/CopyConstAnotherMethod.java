package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class CopyConstAnotherMethod {

    public int studentId;
    public String studentName;

    CopyConstAnotherMethod() {

    }

    CopyConstAnotherMethod(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    public static void main(String args[]) {

        CopyConstAnotherMethod copyConstAnotherMethod = new CopyConstAnotherMethod(555, "Vinay");
        CopyConstAnotherMethod copyConstAnotherMethodCopy = new CopyConstAnotherMethod();
        copyConstAnotherMethodCopy.studentId = copyConstAnotherMethod.studentId;
        copyConstAnotherMethodCopy.studentName = copyConstAnotherMethod.studentName;
        copyConstAnotherMethod.displayValue();
        copyConstAnotherMethodCopy.displayValue();
    }

    public void displayValue() {
        System.out.println(studentId + " " + studentName);
    }

}
