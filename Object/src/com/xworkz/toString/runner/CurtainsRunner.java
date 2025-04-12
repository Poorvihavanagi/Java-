package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Curtains;

public class CurtainsRunner {
    public static void main(String[] args) {
        Curtains curtains = new Curtains("Cotton", 84, "Floral");
        System.out.println(curtains);

        int hash = curtains.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(curtains));

        Curtains curtain1 = new Curtains("Cotton", 84, "Floral");
        Curtains curtain2 = new Curtains("Cotton", 90, "Striped");

        System.out.println("Checking same location: " + (curtain1 == curtain2));
        boolean same = curtain1.equals(curtain2);
        System.out.println("Curtain1 is same as Curtain2: " + same);

    }
}
