package com.xworkz.isaRelation;
import com.xworkz.inheritance.Game;
import com.xworkz.inheritance.Cricket;
public class GameRunner
{
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.start();
        cricket.play();
        cricket.pause();
        cricket.end();
        cricket.displayRules();

        System.out.println("-------------------------------------------");
        Game game = new Cricket();
        game.start();
        game.play();
        game.pause();
        game.end();
        game.displayRules();
    }


}
