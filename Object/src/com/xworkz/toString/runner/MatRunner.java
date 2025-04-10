
package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Mat;

public class MatRunner {
    public static void main(String[] args) {
        Mat mat = new Mat("Cotton", "Red", "Large");
        System.out.println(mat);

        int hash = mat.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(mat));
    }
}