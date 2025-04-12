package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Television;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television tv = new Television("Sony", 55, "LED");
        System.out.println(tv);

        int hash = tv.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(tv));

        Television tv1 = new Television("Sony", 55, "LED");
        Television tv2 = new Television("Sony", 55, "LED");

        System.out.println("Checking same location: " + (tv1 == tv2));
        boolean same = tv1.equals(tv2);
        System.out.println("Television1 is same as Television2: " + same);
    }
}