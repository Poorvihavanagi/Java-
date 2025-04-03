package com.xworkz.isaRelation;

import com.xworkz.inheritance.Chair;
import com.xworkz.inheritance.OfficeChair;

public class ChairRunner
{
    public static void main(String[] args) {

        OfficeChair officeChair = new OfficeChair();
        officeChair.sit();
        officeChair.move();
        officeChair.fold();
        officeChair.adjustHeight();
        officeChair.checkMaterial();

        System.out.println("-------------------------------------------");
        Chair chair = new OfficeChair();
        chair.sit();
        chair.move();
        chair.fold();
        chair.adjustHeight();
        chair.checkMaterial();
    }
}
