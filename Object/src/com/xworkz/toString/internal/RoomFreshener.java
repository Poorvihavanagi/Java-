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

    public String toString() {
        return "RoomFreshener{Brand='" + brand + "', Scent='" + scent + "', Volume=" + volume + "ml}";
    }
}