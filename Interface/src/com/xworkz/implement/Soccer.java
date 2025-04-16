package com.xworkz.implement;

import com.xworkz.internal.Game;

public class Soccer implements Game {

    @Override
    public void start(){
        System.out.println("Running start game in soccer");
    }
    @Override
    public void play(){
        System.out.println("Running  play in soccer");
    }
    @Override
    public void end(){
        System.out.println("Running end game in soccer ");
    }
}
