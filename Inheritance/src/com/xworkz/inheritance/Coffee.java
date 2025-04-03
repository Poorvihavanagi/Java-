package com.xworkz.inheritance;

public class Coffee extends Drink {
    public void prepare() { super.prepare(); System.out.println("Brewing hot coffee..."); }
    public void pour() { super.pour(); System.out.println("Pouring coffee into a cup..."); }
    public void serve() { super.serve(); System.out.println("Serving coffee with sugar and milk..."); }
    public void sip() { super.sip(); System.out.println("Sipping hot coffee slowly..."); }
    public void finish() { super.finish(); System.out.println("Finishing the last sip of coffee..."); }
}
