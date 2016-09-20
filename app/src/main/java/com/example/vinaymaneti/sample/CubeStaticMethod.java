package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class CubeStaticMethod {

    static int Cube(int value) {
        return value * value * value;
    }

    public static void main(String args[]) {
        int result = CubeStaticMethod.Cube(5);
        System.out.println(result);
    }
}
