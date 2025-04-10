package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella(8, "High", "Auto-Open");
        System.out.println(umbrella);

        int hash = umbrella.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(umbrella));
    }
}
