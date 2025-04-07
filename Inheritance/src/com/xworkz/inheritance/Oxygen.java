package com.xworkz.inheritance;

public class Oxygen extends Air {

    @Override
    public void flow() {
        super.flow();
        System.out.println("Running flow in oxygen...");
    }

    @Override
    public void compress() {
        super.compress();
        System.out.println("Running compress in oxygen...");
    }

    @Override
    public void expand() {
        super.expand();
        System.out.println("Running expand in oxygen...");
    }

    @Override
    public void checkPurity() {
        super.checkPurity();
        System.out.println("Running check purity in oxygen...");
    }

    @Override
    public void mix() {
        super.mix();
        System.out.println("Running mix in oxygen...");
    }

    public void supportLife(){
        System.out.println("Running support life in oxygen");
    }
}
