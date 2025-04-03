package com.xworkz.isaRelation;

import com.xworkz.inheritance.Cap;
import com.xworkz.inheritance.Hat;

public class CapRunner
{
    public static void main(String[] args) {

        Cap cap = new Hat();
        cap.wear();
        cap.remove();
        cap.checkMaterial();


        System.out.println("-------------------------------------");
        Hat hat = new Hat();
        hat.wear();
        hat.remove();
        hat.checkMaterial();

    }
}

