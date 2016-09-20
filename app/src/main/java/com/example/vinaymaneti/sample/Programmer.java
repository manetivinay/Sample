package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class Programmer extends Employee {

    int bonous = 1000;


    public static void main(String arg[]) {
        Programmer p = new Programmer();
        System.out.println("employee salary :--" + p.salary);
        System.out.println("Porgrammer bonus :;--" + p.bonous);
        p.sum();
    }

}
