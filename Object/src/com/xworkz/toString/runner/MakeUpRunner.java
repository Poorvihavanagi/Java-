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
    }
}
