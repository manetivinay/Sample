package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class Circle {

    Operation op;
    final double pi = 3.14;


    double area(int radius) {
        op = new Operation();
        int radiusSquareRootValue = op.squareRoot(radius);
        return pi * radiusSquareRootValue;
    }

    public static void main(String args[]) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println("area of a cricle:-" + result);
    }

}
