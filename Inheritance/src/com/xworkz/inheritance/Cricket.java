package com.xworkz.inheritance;

public class Cricket extends Game {
    public void start() {
        super.start();
        System.out.println("Cricket match is starting with a toss...");
    }

    public void play() {
        super.play();
        System.out.println("Players are batting and bowling...");
    }
    public void pause() {
        super.pause();
        System.out.println("Cricket match paused due to rain...");
    }
    public void end() {
        super.end();
        System.out.println("Cricket match has ended with a winner...");
    }
    public void displayRules() {
        super.displayRules();
        System.out.println("Cricket rules: 11 players per team, 20 or 50 overs...");
    }
}
