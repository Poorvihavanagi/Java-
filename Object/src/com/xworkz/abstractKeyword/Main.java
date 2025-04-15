package com.xworkz.abstractKeyword;

public class Main {
    public static void main(String[] args) {

        System.out.println("Beach class:");
        SunnyBeach sunnyBeach = new SunnyBeach();
        sunnyBeach.display();

        System.out.println("----------------------------------------");


        System.out.println("Sunglasses class:");
        SportsSunglasses sportsSunglasses = new SportsSunglasses();
        sportsSunglasses.changeColor();

        System.out.println("-----------------------------------------");


        System.out.println("Drum class:");
        BassDrum bassDrum = new BassDrum();
        bassDrum.play();
        bassDrum.tune();

        System.out.println("------------------------------------------");


        System.out.println(" Bar class:");
        LoungeBar loungeBar = new LoungeBar("The Velvet Lounge", "Downtown", 150);
        loungeBar.showDetails();
        loungeBar.showLoungeDetails();

        System.out.println("-------------------------------------------");


        System.out.println("Cake class:");
        ChocolateCake chocolateCake = new ChocolateCake("Chocolate", "Medium", 3, 20.99, "Chocolate Ganache");
        chocolateCake.displayDetails();

        ChocolateCake chocolateCake2 = new ChocolateCake("Vanilla", "Small", 2, "Whipped Cream");
        chocolateCake2.displayDetails();

        ChocolateCake chocolateCake3 = new ChocolateCake("Strawberry", "Large", "Sprinkles");
        chocolateCake3.displayDetails();
    }
}
