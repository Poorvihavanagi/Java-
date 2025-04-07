package com.xworkz.casting;

public class RubberRunner
{
    public static void main(String[] args) {

        Rubber rubber=new Tyre();
        rubber.expand();
        //rubber.compress();

        Tyre tyre=new Tyre();
        tyre.expand();
        tyre.compress();

        Rubber rubber1=new Rubber();
        rubber1.expand();

        MRFTyre mrfTyre=new MRFTyre();
        mrfTyre.radial();
        mrfTyre.expand();
        mrfTyre.compress();

        ArmyVehicle armyVehicle=new ArmyVehicle();
        armyVehicle.Wheel(rubber);
        armyVehicle.Wheel(tyre);
        armyVehicle.Wheel(rubber1);
        armyVehicle.Wheel(mrfTyre);
    }
}
