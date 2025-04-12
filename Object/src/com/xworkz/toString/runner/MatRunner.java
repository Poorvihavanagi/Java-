
package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Mat;

public class MatRunner {
    public static void main(String[] args) {
        Mat mat = new Mat("Cotton", "Red", "Large");
        System.out.println(mat);

        int hash = mat.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(mat));

        Mat mat1 = new Mat("Cotton", "Red", "Large");
        Mat mat2 = new Mat("Wool", "Blue", "Medium");

        System.out.println("Checking same location: " + (mat1 == mat2));
        boolean same = mat1.equals(mat2);
        System.out.println("Mat1 is same as Mat2: " + same);
    }
}