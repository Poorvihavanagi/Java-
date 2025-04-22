package com.xworkz.practice.external;

import com.xworkz.practice.internal.ContentProvider;

public class StreamingApp {
    private ContentProvider contentProvider;
    public StreamingApp(ContentProvider contentProvider){
        this.contentProvider=contentProvider;
        System.out.println("Parameterized const Streaming app");
    }

    public void playVideo(){
        if(this.contentProvider!=null){
            System.out.println("Content provider is not null");
            this.contentProvider.streamVideo();
        }
        else{
            System.out.println("It is null");
        }
    }
}
