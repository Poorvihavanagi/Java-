package com.xworkz.isaRelation;

import com.xworkz.inheritance.Furniture;
import com.xworkz.inheritance.Table;

public class TableRunner {
    public static void main(String[] args) {

        Furniture furniture = new Furniture();
        furniture.placeObject();
        furniture.clean();
        furniture.fold();
        furniture.adjustHeight();
        furniture.move();

        Table table = new Furniture();
        table.placeObject();
        table.clean();
        table.fold();
        table.adjustHeight();
        table.move();
    }
}

