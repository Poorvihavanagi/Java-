package com.xworkz.abstractKeyword;

public abstract class Drum {

    abstract void play();

    public void tune(){
        System.out.println("abstract class with non-abstract method");
    }
}
