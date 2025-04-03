package com.xworkz.inheritance;

public class Rose extends Flower {

    public void bloom() {
        super.bloom();
        System.out.println("The rose is blooming beautifully...");
    }

    public void smell() {
        super.smell();
        System.out.println("The rose has a strong, sweet fragrance...");
    }

    public void photosynthesize() {
        super.photosynthesize();
        System.out.println("The rose is producing energy through photosynthesis...");
    }

    public void attractBees() {
        super.attractBees();
        System.out.println("The rose is attracting bees with its vibrant color...");
    }

    public void wither() {
        super.wither();
        System.out.println("The rose is slowly wilting away...");
    }
}
