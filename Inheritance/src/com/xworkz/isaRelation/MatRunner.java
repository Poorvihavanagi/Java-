package com.xworkz.isaRelation;

import com.xworkz.inheritance.Mat;
import com.xworkz.inheritance.Rug;

public class MatRunner {
    public static void main(String[] args) {

        Rug rug = new Rug();
        rug.place();
        rug.clean();
        rug.rollUp();
        rug.checkMaterial();
        rug.move();

        System.out.println("-----------------------------------------------------------");
        Mat mat = new Rug();
        mat.place();
        mat.clean();
        mat.rollUp();
        mat.checkMaterial();
        mat.move();
    }
}
