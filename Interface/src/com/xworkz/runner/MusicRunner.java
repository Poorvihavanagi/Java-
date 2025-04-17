package com.xworkz.runner;

import com.xworkz.implement.Guitar;
import com.xworkz.internal.Music;

public class MusicRunner {
    public static void main(String[] args) {
        Music music=new Guitar();
        music.play();
        music.pause();
        music.stop();
        music.shuffle();
        music.repeat();
    }
}
