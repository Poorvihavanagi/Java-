package com.xworkz.practice.internal;

public class DGCAImpl implements AviationAuthority{
    @Override
    public void approveFlight() {
        System.out.println("Running approve flights in DGCAImpl");
    }
}
