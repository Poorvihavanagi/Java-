package com.xworkz.inheritance;

public class Cricket extends Game {

    @Override
    public void start() {
        super.start();
        System.out.println("Running start in Cricket");
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Running play in Cricket");
    }

    @Override
    public void pause() {
        super.pause();
        System.out.println("Running pause in Cricket");
    }

    @Override
    public void end() {
        super.end();
        System.out.println("Running end in Cricket");
    }

    @Override
    public void displayRules() {
        super.displayRules();
        System.out.println("Running displayRules in Cricket");
    }
    public void toss() {
        System.out.println("Running toss in cricket");
    }
}
