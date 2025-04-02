package com.xworkz.isaRelation;

import com.xworkz.inheritance.Flag;
import com.xworkz.inheritance.NationalFlag;

public class FlagRunner
{
    public static void main(String[] args) {

        NationalFlag nationalFlag = new NationalFlag();
        nationalFlag.hoist();
        nationalFlag.fold();
        nationalFlag.wave();
        nationalFlag.checkMaterial();
        nationalFlag.display();

        System.out.println("--------------------------");
        Flag flag = new NationalFlag();
        flag.hoist();
        flag.fold();
        flag.wave();
        flag.checkMaterial();
        flag.display();
    }
}
