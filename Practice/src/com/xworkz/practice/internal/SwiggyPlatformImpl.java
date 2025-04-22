package com.xworkz.practice.internal;

public class SwiggyPlatformImpl implements DeliveryPlatform{
    @Override
    public void deliverOrder() {
        System.out.println("Running deliver order in swiggy platform");
    }
}
