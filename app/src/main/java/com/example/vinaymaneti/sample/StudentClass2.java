package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/19/16.
 */
public class StudentClass2 {
    public int studentId;
    public String studentName;

    void insertRecord(int id, String name) {
        studentId = id;
        studentName = name;
    }

    void displayRecord() {
        System.out.println(studentId + " " + studentName);
    }

    public static void main(String args[]) {
        StudentClass2 studentClass2 = new StudentClass2();
        studentClass2.insertRecord(1111, "vinay");


        StudentClass2 studentClass3 = new StudentClass2();
        studentClass3.insertRecord(2222, "siva");

        studentClass2.displayRecord();
        studentClass3.displayRecord();
    }
}
