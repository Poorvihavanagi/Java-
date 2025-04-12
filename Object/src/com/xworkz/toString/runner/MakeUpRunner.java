package com.xworkz.toString.runner;
import com.xworkz.toString.internal.MakeUp;
public class MakeUpRunner
{
    public static void main(String[] args) {
        MakeUp makeup = new MakeUp("Maybelline", "Foundation", 499.99);
        System.out.println(makeup);

        int hash = makeup.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(makeup));


        MakeUp makeup1 = new MakeUp("Maybelline", "Foundation", 499.99);
        MakeUp makeup2 = new MakeUp("L'Oreal", "Lipstick", 799.99);

        System.out.println("Checking same location: " + (makeup1 == makeup2));
        boolean same = makeup1.equals(makeup2);
        System.out.println("Makeup1 is same as Makeup2: " + same);
    }
}
