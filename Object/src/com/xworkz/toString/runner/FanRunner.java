package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Usha", 4, 3);
        System.out.println(fan);

        int hash = fan.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(fan));

        Fan fan1 = new Fan("Usha", 5, 3);
        Fan fan2 = new Fan("Usha", 4, 4);

        System.out.println("Checking same location: " + (fan1 == fan2));
        boolean same = fan1.equals(fan2);
        System.out.println("Fan1 is same as Fan2: " + same);
    }
}
