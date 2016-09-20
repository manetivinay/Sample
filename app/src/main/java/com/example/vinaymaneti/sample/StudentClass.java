package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/19/16.
 */
public class StudentClass {

    public int studentId;
    public String studentName;


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getStudentName() {
        return this.studentName;
    }

    public static void main(String args[]) {
        StudentClass studentClass = new StudentClass();
        studentClass.setStudentId(1);
        studentClass.setStudentName("vinay");
        System.out.println(studentClass.getStudentId());
        System.out.println(studentClass.getStudentName());
    }

}
