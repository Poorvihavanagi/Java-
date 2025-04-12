package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Bucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket = new Bucket("Plastic", 15, "Red");
        System.out.println(bucket);

        int hash = bucket.hashCode();
        System.out.println(new Bucket("Steel", 20, "Blue").hashCode());

        Bucket bucket1 = new Bucket("Plastic", 15, "Red");
        Bucket bucket2 = new Bucket("Steel", 20, "Blue");

        System.out.println("Checking same location: " + (bucket1 == bucket2));
        boolean same = bucket2.equals(bucket1);
        System.out.println("Bucket1 is same as Bucket2: " + same);

    }
}