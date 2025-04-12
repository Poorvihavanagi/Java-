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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof RoomFreshener) {
                System.out.println("Ref is RoomFreshener, will compare...");
                RoomFreshener freshener1 = this;
                RoomFreshener freshener2 = (RoomFreshener) obj;
                if (freshener1.brand.equals(freshener2.brand) &&
                        freshener1.scent.equals(freshener2.scent) &&
                        freshener1.volume == freshener2.volume) {
                    System.out.println("Both room fresheners are identical");
                    return true;
                }
            }
        }
        return false;
    }
}