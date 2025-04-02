package com.xworkz.inheritance;

public class Ink extends Pen
{
    public void write(){
        super.write();
        System.out.println("Running write in ink");
    }
    public void draw(){
        super.write();
        System.out.println("Running draw in ink");
    }
    public void refill(){
        super.refill();
        System.out.println("Running refill in ink");
    }
    public void capOn() {
        super.capOn();
        System.out.println("Putting the cap on the pen...");
    }

    public void capOff() {
        super.capOff();
        System.out.println("Removing the cap from the pen...");
    }
}
