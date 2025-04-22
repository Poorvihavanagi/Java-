package com.xworkz.practice.external;

import com.xworkz.practice.internal.MusicPlatform;

public class MusicStreamingService {
    private MusicPlatform musicPlatform;

    public MusicStreamingService(MusicPlatform musicPlatform){
        this.musicPlatform=musicPlatform;
        System.out.println("Parameterized const MusicStreaming");
    }

    public void changeSong(){
        if(this.musicPlatform!=null){
            this.musicPlatform.playSong();
            System.out.println("not null music platform");
        }
        else{
            System.out.println("It is null");
        }
    }
}
