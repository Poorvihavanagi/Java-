package com.xworkz.inheritance;

public class Pg extends Building{
    public void cleanHome(){
        System.out.println("Clean pg room");
    }

    public void payRent(Building building){
        building.paint();
        building.construct();
        building.provideElectricity();
        building.openDoors();
        building.closeWindows();

        if(building instanceof Pg){
            System.out.println("Building is an instance of pg");
            Pg pg=new Pg();
            pg.cleanHome();
        }
    }
}
