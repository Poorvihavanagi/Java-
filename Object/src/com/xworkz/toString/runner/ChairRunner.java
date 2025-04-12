package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Chair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair = new Chair("Wood", "Brown", 90);
        System.out.println(chair);

        int hash=chair.hashCode();
        System.out.println("Hash Code: " +hash);
        System.out.println("Original Code: " +System.identityHashCode(chair));

        Chair chair2 = new Chair("Wood", "Brown", 85);
        System.out.println("Checking same location: " + (chair == chair2));
        boolean same = chair.equals(chair2);
        System.out.println("Chair1 is same as Chair2: " + same);

    }
}
