package com.xworkz.inheritance;

public class Badminton extends Game{
    public void toss() {
        System.out.println("Conducting the toss to decide batting or bowling");
    }
    public void serveShuttle(Game game){
        game.end();
        game.displayRules();
        game.pause();
        game.play();
        game.start();

        if(game instanceof Badminton){
            System.out.println("Game is instance of badminton");
            Badminton badminton=(Badminton) game;
            badminton.toss();
        }
    }

}
