package com.xworkz.inheritance;

public class Coffee extends Drink {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Running prepare in Coffee");
    }

    @Override
    public void pour() {
        super.pour();
        System.out.println("Running pour in Coffee");
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println("Running serve in Coffee");
    }

    @Override
    public void sip() {
        super.sip();
        System.out.println("Running sip in Coffee");
    }

    @Override
    public void finish() {
        super.finish();
        System.out.println("Running finish in Coffee");
    }
}
