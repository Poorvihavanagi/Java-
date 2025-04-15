package com.xworkz.abstractKeyword;

public class BassDrum extends Drum{

    @Override
    void play() {
        System.out.println("Abstract method");
    }

    @Override
    public void tune() {
        super.tune();
    }
}
