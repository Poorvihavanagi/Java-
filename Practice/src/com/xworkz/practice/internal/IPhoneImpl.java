package com.xworkz.practice.internal;

public class IPhoneImpl implements MobileDevice{
    @Override
    public void makeCall() {
        System.out.println("Running make call in Iphone Impl");
    }
}
