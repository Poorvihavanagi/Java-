package com.xworkz.toString.runner;
import com.xworkz.toString.internal.HandSanitizer;

public class HandSanitizerRunner {
    public static void main(String[] args) {
        HandSanitizer sanitizer = new HandSanitizer("Dettol", 70, 200);
        System.out.println(sanitizer);

        int hash = sanitizer.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(sanitizer));

        HandSanitizer sanitizer1 = new HandSanitizer("Dettol", 70, 200);
        HandSanitizer sanitizer2 = new HandSanitizer("Lifebuoy", 70, 200);

        System.out.println("Checking same location: " + (sanitizer1 == sanitizer2));
        boolean same = sanitizer1.equals(sanitizer2);
        System.out.println("Sanitizer1 is same as Sanitizer2: " + same);
    }
}