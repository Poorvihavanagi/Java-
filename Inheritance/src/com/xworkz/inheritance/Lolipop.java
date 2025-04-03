package com.xworkz.inheritance;

public class Lolipop extends Candy {

    public void taste() {
        super.taste();
        System.out.println("Lollipop has a fruity flavor.");
    }

    public void chew() {
        super.chew();
        System.out.println("Lollipop is hard, so it should be sucked before chewing.");
    }

    public void unwrap() {
        super.unwrap();
        System.out.println("Unwrapping the lollipop from its stick cover.");
    }

    public void dissolve() {
        super.dissolve();
        System.out.println("Lollipop dissolves slowly when sucked.");
    }

    public void checkFlavor() {
        super.checkFlavor();
        System.out.println("Checking if the lollipop flavor is strawberry, orange, or lemon.");
    }
}
