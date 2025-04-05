package com.xworkz.inheritance;

public class FootBall extends Sport {

    @Override
    public void startGame() {
        super.startGame();
        System.out.println("Running start Game in football...");
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Running play in football...");
    }

    @Override
    public void score() {
        super.score();
        System.out.println("Running score in football...");
    }

    @Override
    public void pause() {
        super.pause();
        System.out.println("Running pause in football...");
    }

    @Override
    public void endGame() {
        super.endGame();
        System.out.println("Running end Game in football...");
    }
}
