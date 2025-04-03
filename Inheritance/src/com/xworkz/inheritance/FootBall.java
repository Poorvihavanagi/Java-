package com.xworkz.inheritance;

public class FootBall extends Sport {

    @Override
    public void startGame() {
        super.startGame();
        System.out.println("Starting the football match...");
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Kicking the ball and passing...");
    }

    @Override
    public void score() {
        super.score();
        System.out.println("Scoring a goal in football!");
    }

    @Override
    public void pause() {
        super.pause();
        System.out.println("Half-time break in football...");
    }

    @Override
    public void endGame() {
        super.endGame();
        System.out.println("Blowing the final whistle in football...");
    }
}
