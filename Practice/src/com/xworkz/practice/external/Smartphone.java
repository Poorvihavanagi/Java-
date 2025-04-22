package com.xworkz.practice.external;

import com.xworkz.practice.internal.MobileDevice;

public class Smartphone {
    private MobileDevice mobileDevice;

    public Smartphone(MobileDevice mobileDevice){
        this.mobileDevice=mobileDevice;
        System.out.println("Running smart phone");
    }
    public void browseInternet(){
        if(this.mobileDevice!=null){
            System.out.println("Running browse internet is not null");
            this.mobileDevice.makeCall();
        }
        else{
            System.out.println("It is null");
        }
    }
}
