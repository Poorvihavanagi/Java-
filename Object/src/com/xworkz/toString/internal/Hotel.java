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
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -330;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Hotel) {
                System.out.println("Ref is Hotel, will compare...");
                Hotel hotel1 = this;
                Hotel hotel2 = (Hotel) obj;
                if (hotel1.name.equals(hotel2.name) &&
                        hotel1.star == hotel2.star &&
                        hotel1.pricePerNight == hotel2.pricePerNight) {
                    System.out.println("Both Hotels have the same name, star rating, and price per night");
                    return true;
                }
            }
        }
        return false;
    }
}
