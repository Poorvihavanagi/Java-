package com.xworkz.isaRelation;

import com.xworkz.inheritance.Glue;
import com.xworkz.inheritance.Sticky;

public class GlueRunner {
    public static void main(String[] args) {

        Glue glue = new Glue();
        glue.apply();
        glue.dry();
        glue.bond();
        glue.checkStickiness();
        glue.remove();

        System.out.println("--------------------------------------------------");
        Sticky sticky = new Glue();
        sticky.apply();
        sticky.dry();
        sticky.bond();
        sticky.checkStickiness();
        sticky.remove();
    }
}
