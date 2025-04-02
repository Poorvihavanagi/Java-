package com.xworkz.isaRelation;

import com.xworkz.inheritance.Cup;
import com.xworkz.inheritance.Mug;

public class MugRunner
{
    public static void main(String[] args) {

        Cup cup=new Cup();
        cup.fill();
        cup.drink();
        cup.wash();
        cup.heat();
        cup.checkMaterial();

        Mug mug=new Cup();
        mug.fill();
        mug.drink();
        mug.wash();
        mug.heat();
        mug.checkMaterial();
    }
}
