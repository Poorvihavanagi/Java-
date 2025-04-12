
package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Shampoo;

public class ShampooRunner {
    public static void main(String[] args) {
        Shampoo shampoo = new Shampoo("Dove", "Anti-dandruff", 180);
        System.out.println(shampoo);

        int hash = shampoo.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(shampoo));

        Shampoo shampoo1 = new Shampoo("Dove", "Anti-dandruff", 180);
        Shampoo shampoo2 = new Shampoo("Dove", "Anti-dandruff", 180);

        System.out.println("Checking same location: " + (shampoo1 == shampoo2));
        boolean same = shampoo1.equals(shampoo2);
        System.out.println("Shampoo1 is same as Shampoo2: " + same);
    }
}