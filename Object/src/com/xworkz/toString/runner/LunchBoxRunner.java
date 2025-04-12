
package com.xworkz.toString.runner;
import com.xworkz.toString.internal.LunchBox;

public class LunchBoxRunner {
    public static void main(String[] args) {
        LunchBox box = new LunchBox("Milton", 3, "Thermal");
        System.out.println(box);

        int hash = box.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(box));

        LunchBox box1 = new LunchBox("Milton", 3, "Thermal");
        LunchBox box2 = new LunchBox("Cello", 4, "Insulated");

        System.out.println("Checking same location: " + (box1 == box2));
        boolean same = box1.equals(box2);
        System.out.println("Box1 is same as Box2: " + same);
    }
}
