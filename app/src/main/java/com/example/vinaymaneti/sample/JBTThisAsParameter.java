package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class JBTThisAsParameter {

    public static void main(String args[]) {
        JBT1 jbt1 = new JBT1();
        jbt1.i = 10;
        jbt1.method();
        jbt1.methodValue(50);
    }
}
