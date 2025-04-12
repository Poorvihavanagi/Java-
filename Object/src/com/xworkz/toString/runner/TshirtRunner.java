package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Tshirt;

public class TshirtRunner
{
    public static void main(String[] args) {
        Tshirt tshirt1=new Tshirt();
        tshirt1.setBrand("H&M");
        tshirt1.setPrice(459.99);
        tshirt1.setSize('S');
        tshirt1.setColor("Black");

        Tshirt tshirt2=new Tshirt();
        tshirt2.setBrand("H&M");
        tshirt2.setPrice(459.99);
        tshirt2.setSize('M');
        tshirt2.setColor("Black");

        System.out.println("checking same location: " +(tshirt1==tshirt2));
        Boolean same=tshirt2.equals(tshirt1);
        System.out.println("tshirt1 is same as tshirt2: " +same);

    }
}
