package com.xworkz.practice.internal;

public class NetflixProviderImpl implements ContentProvider{
    @Override
    public void streamVideo() {
        System.out.println("Running stream video in netflix provider");
    }
}
