package com.xworkz.practice.runner;

import com.xworkz.practice.external.StreamingApp;
import com.xworkz.practice.internal.ContentProvider;
import com.xworkz.practice.internal.NetflixProviderImpl;

public class ContentProviderRunner {
    public static void main(String[] args) {
        ContentProvider contentProvider=new NetflixProviderImpl();
        StreamingApp streamingApp=new StreamingApp(contentProvider);
        streamingApp.playVideo();
    }
}
