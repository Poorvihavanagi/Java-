package com.xworkz.toString.runner;
import com.xworkz.toString.internal.HandSanitizer;

public class HandSanitizerRunner {
    public static void main(String[] args) {
        HandSanitizer sanitizer = new HandSanitizer("Dettol", 70, 200);
        System.out.println(sanitizer);
    }
}