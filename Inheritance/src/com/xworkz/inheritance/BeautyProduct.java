package com.xworkz.inheritance;

public class BeautyProduct extends NailPolish {
    public void apply() {
        super.apply();
        System.out.println("Applying beauty product nail polish...");
    }
    public void remove() {
        super.remove();
        System.out.println("Using a beauty product remover for nail polish...");
    }
    public void dry() {
        super.dry();
        System.out.println("Drying beauty product nail polish...");
    }
    public void checkColor() {
        super.checkColor();
        System.out.println("Checking beauty product nail polish shade...");
    }
    public void shake() {
        super.shake();
        System.out.println("Shaking beauty product nail polish before application...");
    }
}
