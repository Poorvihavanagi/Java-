package com.xworkz.toString.internal;

public class RoomFreshener {
    private String brand;
    private String scent;
    private int volume;

    public RoomFreshener(String brand, String scent, int volume) {
        this.brand = brand;
        this.scent = scent;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "RoomFreshener{Brand='" + brand + "', Scent='" + scent + "', Volume=" + volume + "ml}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 960;
    }
}