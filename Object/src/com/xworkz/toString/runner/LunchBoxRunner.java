
package com.xworkz.toString.runner;
import com.xworkz.toString.internal.LunchBox;

public class LunchBoxRunner {
    public static void main(String[] args) {
        LunchBox box = new LunchBox("Milton", 3, "Thermal");
        System.out.println(box);

        int hash = box.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(box));
    }
}
