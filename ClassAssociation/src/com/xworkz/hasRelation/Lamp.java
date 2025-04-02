package com.xworkz.hasRelation;

public class Lamp
{
    private Warranty warranty;
    public Lamp(Warranty warranty){
        System.out.println("Running warranty in lamp");
        this.warranty=warranty;
    }
    public void lampDisplay(){
        System.out.println("Accessing methods");
        this.warranty.warrantyDisplay();
    }
}
