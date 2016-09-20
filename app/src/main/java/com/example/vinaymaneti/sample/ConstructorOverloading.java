package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class ConstructorOverloading {

    public int studentId;
    public String studentName;
    public int marks;

    public ConstructorOverloading(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    ConstructorOverloading(int id, String name, int marks) {
        this.studentId = id;
        this.studentName = name;
        this.marks = marks;
    }

    public static void main(String args[]) {
        ConstructorOverloading constructorOverloading = new ConstructorOverloading(55, "vinay");
        constructorOverloading.displayValue();

        ConstructorOverloading constructorOverloadingMoreParam = new ConstructorOverloading(344, "siva", 95);
        constructorOverloadingMoreParam.displayValue();
    }

    private void displayValue() {
        System.out.println(studentId + " " + studentName + " " + marks);
    }
}
