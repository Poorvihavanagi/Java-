package com.xworkz.practice.runner;

import com.xworkz.practice.external.Smartphone;
import com.xworkz.practice.internal.IPhoneImpl;
import com.xworkz.practice.internal.MobileDevice;

public class MobileDeviceRunner {
    public static void main(String[] args) {
        MobileDevice mobileDevice=new IPhoneImpl();
        Smartphone smartphone=new Smartphone(mobileDevice);
        smartphone.browseInternet();
    }
}
