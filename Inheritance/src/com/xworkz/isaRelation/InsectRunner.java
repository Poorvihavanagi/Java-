package com.xworkz.isaRelation;

import com.xworkz.inheritance.Ant;
import com.xworkz.inheritance.Insect;

public class InsectRunner {
    public static void main(String[] args) {

        Ant ant = new Ant();
        ant.description();
        ant.move();
        ant.sound();
        ant.food();
        ant.habitat();

        System.out.println("-----------------------------------------------------------------------------------------------");
        Insect insect = new Ant();
        insect.description();
        insect.move();
        insect.sound();
        insect.food();
        insect.habitat();
    }
}
