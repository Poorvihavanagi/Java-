package com.xworkz.toString.runner;

import com.xworkz.toString.internal.IronBox;

public class IronBoxRunner {
    public static void main(String[] args) {
        IronBox ironBox = new IronBox("Bajaj", 1000, "White");
        System.out.println(ironBox);

        int hash = ironBox.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(ironBox));

        IronBox ironBox1 = new IronBox("Bajaj", 1000, "White");
        IronBox ironBox2 = new IronBox("Philips", 1200, "Black");

        System.out.println("Checking same location: " + (ironBox1 == ironBox2));
        boolean same = ironBox1.equals(ironBox2);
        System.out.println("IronBox1 is same as IronBox2: " + same);
    }
}
