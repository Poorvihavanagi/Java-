package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Bucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket = new Bucket("Plastic", 15, "Red");
        System.out.println(bucket);
    }
}