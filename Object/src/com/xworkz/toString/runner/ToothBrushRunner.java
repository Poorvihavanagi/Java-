package com.xworkz.toString.runner;

import com.xworkz.toString.internal.ToothBrush;

public class ToothBrushRunner {
    public static void main(String[] args) {
        ToothBrush brush = new ToothBrush("Wavy", "Rubberized", "Compact");
        System.out.println(brush);

        int hash = brush.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(brush));
    }
}
