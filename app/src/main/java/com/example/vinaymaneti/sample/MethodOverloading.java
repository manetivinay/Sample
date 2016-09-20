package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/19/16.
 */
public class MethodOverloading {

    void sumAddition(int a, int b) {
        System.out.println("sum of 2 numbers :" + (a + b));
    }

    void sumAddition(int a, int b, int c) {
        System.out.println("sum of 3 numbers;" + (a + b + c));
    }

    void sumAddition(double a, double b, double c) {
        System.out.println("sum of 3 number but different dataType :-" + (a + b + c));
    }

    public static void main(String args[]) {
        MethodOverloading methodOverLoading = new MethodOverloading();
        methodOverLoading.sumAddition(2, 4);
        methodOverLoading.sumAddition(2, 5, 9);
        methodOverLoading.sumAddition(5.0, 6.4, 7.9);
    }
}
