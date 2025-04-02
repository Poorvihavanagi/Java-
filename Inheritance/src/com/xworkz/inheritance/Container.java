package com.xworkz.inheritance;

public class Container extends Bottle
{

    public void fill() {
        super.fill();
        System.out.println("Running fill in container");
    }
    public void pour() {
        super.pour();
        System.out.println("Running pour in container");
    }
    public void open() {
        super.open();
        System.out.println("Running open in container");
    }
    public void close(){
        super.close();
        System.out.println("Running close in container");
    }
    public void shake(){
        super.shake();
        System.out.println("Running shake in container");
    }
}
