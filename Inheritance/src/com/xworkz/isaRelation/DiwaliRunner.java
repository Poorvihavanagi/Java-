package com.xworkz.isaRelation;

import com.xworkz.inheritance.Festival;
import com.xworkz.inheritance.Diwali;
import com.xworkz.inheritance.Holi;

public class DiwaliRunner {
    public static void main(String[] args) {

        Diwali diwali = new Diwali();
        diwali.celebrate();
        diwali.lightDecorations();
        diwali.distributeSweets();
        diwali.performRituals();
        diwali.enjoyFireworks();

        System.out.println("---------------------------------------------------");

        Festival festival = new Diwali();
        festival.celebrate();
        festival.lightDecorations();
        festival.distributeSweets();
        festival.performRituals();
        festival.enjoyFireworks();

        System.out.println("---------------------------------------------------");
        Holi holi=new Holi();
        holi.playWithColor(holi);
    }
}
