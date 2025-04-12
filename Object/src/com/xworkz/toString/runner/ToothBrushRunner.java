package com.xworkz.toString.runner;

import com.xworkz.toString.internal.ToothBrush;

public class ToothBrushRunner {
    public static void main(String[] args) {
        ToothBrush brush = new ToothBrush("Wavy", "Rubberized", "Compact");
        System.out.println(brush);

        int hash = brush.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(brush));

        ToothBrush brush1 = new ToothBrush("Wavy", "Rubberized", "Compact");
        ToothBrush brush2 = new ToothBrush("Wavy", "Rubberized", "Compact");

        System.out.println("Checking same location: " + (brush1 == brush2));
        boolean same = brush1.equals(brush2);
        System.out.println("Brush1 is same as Brush2: " + same);
    }
}
