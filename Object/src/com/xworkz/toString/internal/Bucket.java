package com.xworkz.toString.internal;

public class Bucket {
    private String material;
    private int capacity;
    private String color;

    public Bucket(String material, int capacity, String color) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Bucket{Material='" + material + "', Capacity=" + capacity + "L, Color='" + color + "'}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -60;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bucket) {
                System.out.println("Ref is Bucket, will compare...");
                Bucket bucket1 = this;
                Bucket bucket2 = (Bucket) obj;
                if (bucket1.material.equals(bucket2.material)) {
                    System.out.println("Both buckets are of the same material");
                    return true;
                }
            }
        }
        return false;
    }

}