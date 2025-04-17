package com.xworkz.runner;

import com.xworkz.implement.Soccer;
import com.xworkz.internal.Game;

public class GameRunner {
    public static void main(String[] args) {
        Game game=new Soccer();
        game.start();
        game.play();
        game.end();
        game.pause();
    }
}
