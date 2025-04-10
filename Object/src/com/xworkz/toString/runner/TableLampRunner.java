package com.xworkz.toString.runner;

import com.xworkz.toString.internal.TableLamp;

public class TableLampRunner {
    public static void main(String[] args) {
        TableLamp lamp = new TableLamp("LED", 3, "Warm White");
        System.out.println(lamp);

        int hash = lamp.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(lamp));
    }
}
