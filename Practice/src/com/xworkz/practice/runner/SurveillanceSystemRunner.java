package com.xworkz.practice.runner;

import com.xworkz.practice.external.HomeSecuritySystem;
import com.xworkz.practice.internal.NestSecurityImpl;
import com.xworkz.practice.internal.SurveillanceSystem;

public class SurveillanceSystemRunner {
    public static void main(String[] args) {
        SurveillanceSystem surveillanceSystem=new NestSecurityImpl();
        HomeSecuritySystem homeSecuritySystem=new HomeSecuritySystem(surveillanceSystem);
        homeSecuritySystem.activateAlarm();
    }
}
