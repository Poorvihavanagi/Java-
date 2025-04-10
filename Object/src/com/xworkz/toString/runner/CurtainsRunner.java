package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Curtains;

public class CurtainsRunner {
    public static void main(String[] args) {
        Curtains curtains = new Curtains("Cotton", 84, "Floral");
        System.out.println(curtains);

        int hash = curtains.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(curtains));
    }
}
