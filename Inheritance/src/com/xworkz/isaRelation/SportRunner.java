package com.xworkz.isaRelation;

import com.xworkz.inheritance.Sport;
import com.xworkz.inheritance.FootBall;

public class SportRunner {

    public static void main(String[] args) {

        FootBall football = new FootBall();
        football.startGame();
        football.play();
        football.score();
        football.pause();
        football.endGame();

        System.out.println("-----------------------------------------------------------");
        Sport sport = new FootBall();
        sport.startGame();
        sport.play();
        sport.score();
        sport.pause();
        sport.endGame();
    }
}
