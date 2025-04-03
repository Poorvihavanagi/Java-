package com.xworkz.isaRelation;

import com.xworkz.inheritance.Stone;
import com.xworkz.inheritance.Marble;

public class StoneRunner {
    public static void main(String[] args) {
        Marble marble = new Marble();
        marble.extract();
        marble.cut();
        marble.polish();
        marble.use();
        marble.checkQuality();
        System.out.println("--------------------------------------------------------------");
        Stone stone = new Marble();
        stone.extract();
        stone.cut();
        stone.polish();
        stone.use();
        stone.checkQuality();
    }
}
