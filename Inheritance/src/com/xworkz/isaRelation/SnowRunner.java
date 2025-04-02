package com.xworkz.isaRelation;

import com.xworkz.inheritance.Foam;
import com.xworkz.inheritance.Snow;

public class SnowRunner
{
    public static void main(String[] args) {

        Foam foam = new Foam();
        foam.fall();
        foam.melt();
        foam.accumulate();
        foam.freeze();
        foam.sparkle();

        Snow snow=new Foam();
        snow.fall();
        snow.melt();
        snow.accumulate();
        snow.freeze();
        snow.sparkle();

    }
}
