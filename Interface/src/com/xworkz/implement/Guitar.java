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
    @Override
    public void shuffle() {
        System.out.println("Shuffling the music tracks in MP3 player.");
    }

    @Override
    public void repeat() {
        System.out.println("Repeating the current song in MP3 player.");
    }
}
