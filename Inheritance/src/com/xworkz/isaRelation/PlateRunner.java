package com.xworkz.isaRelation;

import com.xworkz.inheritance.Dish;
import com.xworkz.inheritance.Plate;

public class PlateRunner
{
    public static void main(String[] args) {
        Plate plate=new Plate();
        plate.wash();
        plate.store();
        plate.use();
        plate.checkMaterial();
        plate.dry();

        System.out.println("---------------------------------");

        Dish dish = new Plate();
        dish.wash();
        dish.store();
        dish.dry();
        dish.use();
        dish.checkMaterial();

    }
}
