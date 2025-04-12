package com.xworkz.toString.internal;

public class Train {
    private String name;
    private int speed;
    private int coaches;

    public Train(String name, int speed, int coaches) {
        this.name = name;
        this.speed = speed;
        this.coaches = coaches;
    }

    @Override
    public String toString() {
        return "Train{Name: " + name + ", Speed: " + speed + " km/h, Coaches: " + coaches + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 957;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Train) {
                System.out.println("Ref is Train, will compare...");
                Train train1 = this;
                Train train2 = (Train) obj;
                if (train1.name.equals(train2.name) && train1.speed == train2.speed && train1.coaches == train2.coaches) {
                    System.out.println("Both trains are Same");
                    return true;
                }
            }
        }
        return false;
    }
}
