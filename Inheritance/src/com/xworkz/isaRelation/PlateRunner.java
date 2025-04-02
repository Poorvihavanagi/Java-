package com.xworkz.isaRelation;

import com.xworkz.inheritance.Dish;
import com.xworkz.inheritance.Plate;

public class PlateRunner
{
    public static void main(String[] args) {
        Plate plate=new Plate();
        plate.serveFood();
        plate.clean();
        plate.stack();
        plate.checkMaterial();
        plate.dry();

        Dish dish = new Plate();
        dish.wash();
        dish.store();

    }
}
