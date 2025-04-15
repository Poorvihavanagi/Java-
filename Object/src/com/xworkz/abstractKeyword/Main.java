package com.xworkz.abstractKeyword;

public class Main {
    public static void main(String[] args) {

        System.out.println("Beach class:");
        SunnyBeach beach = new SunnyBeach();
        beach.display();

        System.out.println("----------------------------------------");

        System.out.println("Sunglasses class:");
        SportsSunglasses sunglass = new SportsSunglasses();
        sunglass.changeColor();

        System.out.println("-----------------------------------------");

        System.out.println("Drum class:");
        BassDrum drum = new BassDrum();
        drum.play();
        drum.tune();

        System.out.println("------------------------------------------");

        System.out.println("Bar class:");
        LoungeBar bar = new LoungeBar("Sky High", "Rooftop", 120);
        bar.showLoungeDetails();

        System.out.println("------------------------------------------");

        System.out.println("Cake class:");
        ChocolateCake cake1 = new ChocolateCake("Chocolate", "Medium", 3, 20.99, "Choco Chips");
        ChocolateCake cake2 = new ChocolateCake("Vanilla", "Small", 2, "Strawberry Drizzle"); // copy
        ChocolateCake cake3 = new ChocolateCake("Red Velvet", "Large", "Whipped Cream"); // copy
        cake1.displayDetails();
        cake2.displayDetails();
        cake3.displayDetails();
    }
}
