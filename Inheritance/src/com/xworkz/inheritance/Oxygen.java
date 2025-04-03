package com.xworkz.inheritance;

public class Oxygen extends Air {

    public void flow() {
        super.flow();
        System.out.println("Oxygen is flowing through the atmosphere...");
    }
    public void compress() {
        super.compress();
        System.out.println("Compressing oxygen into a cylinder...");
    }
    public void expand() {
        super.expand();
        System.out.println("Oxygen expands when released from a container...");
    }
    public void checkPurity() {
        super.checkPurity();
        System.out.println("Checking the purity of medical oxygen...");
    }
    public void mix() {
        super.mix();
        System.out.println("Oxygen is mixing with nitrogen in the air...");
    }
}
