package com.xworkz.inheritance;

public class Earth extends Planet{
    public void rotate() {
        super.rotate();
        System.out.println("Earth rotates once every 24 hours...");
    }

    public void revolve() {
        super.revolve();
        System.out.println("Earth completes one revolution around the sun in 365 days...");
    }

    public void supportLife() {
        super.supportLife();
        System.out.println("Earth is the only known planet that supports life...");
    }

    public void maintainAtmosphere() {
        super.maintainAtmosphere();
        System.out.println("Earth maintains an atmosphere rich in oxygen and nitrogen...");
    }

    public void containWater() {
        super.containWater();
        System.out.println("Earth contains abundant water bodies essential for life...");
    }
}
