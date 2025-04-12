package com.xworkz.toString.internal;

public class House {
    private String location;
    private int floors;
    private double price;

    public House(String location, int floors, double price) {
        this.location = location;
        this.floors = floors;
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{Location: " + location + ", Floors: " + floors + ", Price: ₹" + price + "}";
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
            if (obj instanceof House) {
                System.out.println("Ref is House, will compare...");
                House house1 = this;
                House house2 = (House) obj;
                if (house1.location.equals(house2.location) && house1.floors == house2.floors ) {
                    System.out.println("Both Houses have the same location, floors, and price");
                    return true;
                }
            }
        }
        return false;
    }

}
