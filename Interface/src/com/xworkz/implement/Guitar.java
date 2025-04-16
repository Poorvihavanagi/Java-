package com.xworkz.implement;

import com.xworkz.internal.Music;

public class Guitar implements Music {
    @Override
    public void play(){
        System.out.println("Running play in guitar");
    }
    @Override
    public void pause(){
        System.out.println("Running pause in guitar");
    }
    @Override
    public void stop(){
        System.out.println("Running stop in guitar");
    }
}
