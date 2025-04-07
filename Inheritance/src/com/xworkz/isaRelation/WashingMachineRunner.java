package com.xworkz.isaRelation;

import com.xworkz.inheritance.Appliances;
import com.xworkz.inheritance.Refrigerator;
import com.xworkz.inheritance.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {

        WashingMachine machine = new WashingMachine();
        machine.turnOn();
        machine.checkPower();
        machine.displayBrand();
        machine.repair();
        machine.turnOff();

        System.out.println("--------------------------------------------------");
        Appliances appliance = new WashingMachine();
        appliance.turnOn();
        appliance.checkPower();
        appliance.repair();
        appliance.displayBrand();
        appliance.turnOff();

        System.out.println("--------------------------------------------------");
        Refrigerator refrigerator=new Refrigerator();
        refrigerator.coolItems(refrigerator);
        refrigerator.coolItems(appliance);
    }
}
