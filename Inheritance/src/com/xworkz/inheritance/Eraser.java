package com.xworkz.inheritance;

public class Eraser extends Stationery {
    public void use() {
        super.use();
        System.out.println("Using the eraser to remove pencil marks...");
    }
    public void store() {
        super.store();
        System.out.println("Storing the eraser in a pencil box...");
    }
    public void checkQuality() {
        super.checkQuality();
        System.out.println("Checking the softness of the eraser...");
    }
    public void replace() {
        super.replace();
        System.out.println("Replacing the eraser with a new one...");
    }
    public void dispose() {
        super.dispose();
        System.out.println("Disposing of the worn-out eraser...");
    }
}
