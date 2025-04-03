package com.xworkz.isaRelation;

import com.xworkz.inheritance.Poet;
import com.xworkz.inheritance.Writer;

public class WriterRunner {
    public static void main(String[] args) {

        Poet poet = new Poet();
        poet.write();
        poet.edit();
        poet.publish();
        poet.inspire();
        poet.create();
        System.out.println("----------------------------------------------------------------------------------------");


        Writer writer = new Poet();
        writer.write();
        writer.edit();
        writer.publish();
        writer.inspire();
        writer.create();
    }
}
