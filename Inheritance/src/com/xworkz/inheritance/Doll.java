package com.xworkz.inheritance;

public class Doll extends Toy {

    @Override
    public void play() {
        super.play();
        System.out.println("Running play in Doll");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Running display in Doll");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean in Doll");
    }

    @Override
    public void repair() {
        super.repair();
        System.out.println("Running repair in Doll");
    }

    @Override
    public void pack() {
        super.pack();
        System.out.println("Running pack in Doll");
    }

    public void dance(){
        System.out.println("Running dance in doll");
    }
}
