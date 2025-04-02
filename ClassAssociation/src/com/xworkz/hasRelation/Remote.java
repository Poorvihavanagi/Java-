package com.xworkz.hasRelation;

public class Remote
{
    private Battery battery;

    public Remote(Battery battery){
        this.battery=battery;
    }
    public void remoteDisplay(){
        System.out.println("running set");
        this.battery.setBrand("nippon");
        this.battery.setDuration("100yrs");
        System.out.println("running get");
        System.out.println(this.battery.getBrand());
        System.out.println(this.battery.getDuration());
    }
}
