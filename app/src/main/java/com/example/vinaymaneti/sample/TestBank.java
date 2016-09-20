package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class TestBank {

    public static void main(String args[]) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        Axis axis = new Axis();

        System.out.println("SBI Rate of Interest :-" + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest :-" + icici.getRateOfInterest());
        System.out.println("Axis Rate of Interest :-" + axis.getRateOfInterest());
    }
}
