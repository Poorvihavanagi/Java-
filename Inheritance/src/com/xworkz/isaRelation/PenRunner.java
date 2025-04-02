package com.xworkz.isaRelation;

import com.xworkz.inheritance.Ink;
import com.xworkz.inheritance.Pen;

public class PenRunner
{
    public static void main(String[] args) {

        Ink ink=new Ink();
        ink.write();
        ink.draw();
        ink.refill();
        ink.capOn();
        ink.capOff();

        Pen pen=new Ink();
        pen.write();
        pen.draw();
        pen.refill();
        pen.capOn();
        pen.capOff();
    }
}
