package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
class JBT1 extends JBTThisAsParameter {
    public int i;

    public void method() {
        method1(this);
    }

    private void method1(JBT1 jbt1) {
        System.out.println(jbt1.i);
    }

    public void methodValue(int i) {
        System.out.println(i);
    }
}
