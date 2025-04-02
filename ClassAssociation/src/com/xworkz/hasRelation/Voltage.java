package com.xworkz.hasRelation;

public class Voltage
{
    private int power;
    private float capacity;

    public Voltage(int power,float capacity){
        System.out.println("running voltage cons");
        this.power=power;
        this.capacity=capacity;
    }

    public void voltageDisplay(){
        System.out.println("Power:"+this.power);
        System.out.println("Capacity:"+this.capacity);
    }
}
