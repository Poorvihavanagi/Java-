package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Chair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair = new Chair("Wood", "Brown", 90);
        System.out.println(chair);

        int hash=chair.hashCode();
        System.out.println("Hash Code: " +hash);
        System.out.println("Original Code: " +System.identityHashCode(chair));
    }
}
