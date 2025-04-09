package com.xworkz.toString.internal;

public class Hotel
{
    private String name;
    private int star;
    private double pricePerNight;

    public Hotel(String name, int star, double pricePerNight){
        this.name=name;
        this.star=star;
        this.pricePerNight=pricePerNight;
    }
    @Override
    public String toString(){
        return "Hotel{$$name= '" + name + "', $$Star= " + star + ", $$Price per night= " + pricePerNight + "}";
    }
}
