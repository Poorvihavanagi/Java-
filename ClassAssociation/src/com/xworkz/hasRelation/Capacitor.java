package com.xworkz.hasRelation;

public class Capacitor
{
    private int voltage;
    private int speed;

    public Capacitor(int voltage,int speed){
        System.out.println("running capacitor cons");
        this.voltage=voltage;
        this.speed=speed;
    }
    public void capacitorDisplay(){
        System.out.println("Speed:"+this.speed);
        System.out.println("Voltage:"+this.voltage);
    }
}
