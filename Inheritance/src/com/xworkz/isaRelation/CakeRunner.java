package com.xworkz.isaRelation;

import com.xworkz.inheritance.Cake;
import com.xworkz.inheritance.Sweet;

public class CakeRunner
{
    public static void main(String[] args) {
        Sweet sweet = new Sweet();
        sweet.bake();
        sweet.decorate();
        sweet.slice();
        sweet.serve();
        sweet.taste();

        System.out.println("------------------------------");

        Cake cake = new Sweet();
        cake.bake();
        cake.decorate();
        cake.slice();
        cake.serve();
        cake.taste();
    }
}
