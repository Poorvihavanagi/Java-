package com.xworkz.practice.runner;

import com.xworkz.practice.external.MusicStreamingService;
import com.xworkz.practice.internal.MusicPlatform;
import com.xworkz.practice.internal.SpotifyMusicImpl;

public class MusicPlatformRunner {
    public static void main(String[] args) {
        MusicPlatform musicPlatform=new SpotifyMusicImpl();
        MusicStreamingService musicStreamingService=new MusicStreamingService(musicPlatform);
        musicStreamingService.changeSong();
    }
}
