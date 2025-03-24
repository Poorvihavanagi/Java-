package com.demo.accessspecifiers;

public class Robot
{
    public String model;
    String type;
    private int batter;

    public void charge(){
        this.batter=100;
        System.out.println("Charging robot");
    }

    void work(){
        this.diagnose();
        System.out.println(model+ " is working as a " + type);
    }

    private void diagnose(){
        System.out.println("Performing disgnostics");
    }
}
